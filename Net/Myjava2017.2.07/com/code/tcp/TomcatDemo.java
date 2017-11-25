package com.code.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 模拟服务器与浏览器进行通讯
 * 
 * 浏览器与服务器之间的通讯是使用tcp协议的。
 * 
 * http协议是用于规范浏览器与服务器之间通讯数据的格式。
 * 
 */
public class TomcatDemo extends Thread {
	
	Socket socket ; 
	
	public TomcatDemo(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//获取socket的输出流通道
			OutputStream out = socket.getOutputStream();
			out.write("周奕儒太厉害了！！".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		//建立服务端的服务
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(9191);
		//接受客户端的连接
		while(true){
			Socket socket = serverSocket.accept();
			new TomcatDemo(socket).start();
			System.out.println("用户已连接...");
		}
	}
	
}
