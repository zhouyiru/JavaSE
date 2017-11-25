package com.code.tcp;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
/*
 需求： 编写一个服务端可以与多个客户端进行连接，客户端一旦连接成功，马上输送一张图片数据给客户端。。
 
 */

//服务端
public class ImageServer extends Thread {

	Socket socket;
	
	static HashSet<String> ips = new HashSet<String>();  //该集合是用户存储客户端的ip地址的。
	
	 public ImageServer(Socket socket) {
		 this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//第三步： 获取socket输出字节流
			OutputStream socketOut = socket.getOutputStream(); 
			//第四步：获取图片的输入流，读取图片的数据，把图片数据写出给客户端
			FileInputStream fileInputStream = new FileInputStream("F:\\美女\\1.jpg");
			byte[] buf = new byte[1024];
			int length = 0 ; 
			while((length = fileInputStream.read(buf))!=-1){
				socketOut.write(buf,0,length);
			}
			
			String ip  = socket.getInetAddress().getHostAddress(); //获取到对方的ip地址
			if(ips.add(ip)){ //如果可以存储到集合中，那么就意味着这个 是一个新的IP地址。
				System.out.println("恭喜："+ ip+"同学下载图片成功！！");
				System.out.println("当前下载的人数："+ ips.size());
				
			}
			
			
			//第五步：关闭资源
			fileInputStream.close();
			socket.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		//第一步： 建立tcp服务端的服务
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(9090);
		while(true){
			Socket socket =	serverSocket.accept(); //不断的接受用户的请求连接
			new ImageServer(socket).start();  //如果产生了一个Socket，那么就意味着有一个用户与服务端连接了，那么马上开启一线程为其服务。
		}
	}
	
	
}
