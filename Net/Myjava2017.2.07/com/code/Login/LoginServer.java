package com.code.Login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/*
 * 服务端
 * 
 * 第一个问题： 服务端没有接收到数据
 * 
 */
public class LoginServer extends Thread {
	
	Socket  socket ; 

	public LoginServer(Socket socket){
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			//第一步：获取socket的输入、输出流对象
			BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStreamWriter socketWriter = new OutputStreamWriter(socket.getOutputStream());
			//第二步： 读取客户端发送的消息。
			while(true){
				String line = socketReader.readLine();
				String[] datas = line.split(" ");
				String option = datas[0]; //客户端选择的功能
				String userName = datas[1]; //用户名
				String password = datas[2]; //密码
				Properties properties  = new Properties(); 	
				//先把配置文件的信息先加载到properties文件上。
				properties.load(new FileReader("F:\\users.txt"));

				
				if("a".equalsIgnoreCase(option)){
					//注册
				//把用户名与密码保存到Properties中
				if(!properties.containsKey(userName)){
					//如果该用户名不存在，我就把用户的信息添加上去。
					properties.setProperty(userName,password);
					// 把用户的注册信息保存到文件上。
					properties.store(new FileWriter("F:\\users.txt"),"users info");
					socketWriter.write("恭喜你,注册成功\r\n");
					
					
				}else{
					//如果用户名已经存在了，那么提示客户端用户名已经存在，请重新注册
					socketWriter.write("该用户名已经存在，请重新输入！！\r\n");
					
				}
					
					
				}else if("b".equalsIgnoreCase(option)){
					//登录
					String tempPassword = properties.getProperty(userName);
					if(tempPassword==null){
						socketWriter.write("没有该用户名存在，请重新登录!\r\n");
					}else{
						if(tempPassword.equals(password)){
							socketWriter.write("欢迎"+userName+"登录成功!\r\n");
						}else{
							socketWriter.write("你的密码有误，请重新输入!\r\n");		
						}
					}	
				}
				socketWriter.flush();
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) throws Exception {
		//建立tcp的服务端， 并且要监听一个端口
		@SuppressWarnings("resource")
		ServerSocket serverSocke = new ServerSocket(9090);
		//不断的接受用户的请求连接
		while(true){
			Socket socket = serverSocke.accept();
			//每个用户都应该开启一个线程为其服务
			new LoginServer(socket).start();
		}
	}
	

}
