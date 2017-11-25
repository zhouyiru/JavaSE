package com.code.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端  ServerSocket
public class Demo1Server {

	public static void main(String[] args) throws Exception {
		//第一步： 建立tcp的服务端。 
		ServerSocket serverSocket = new ServerSocket(9090);
		//第二步：接受客户端的连接
		Socket socket = serverSocket.accept();   //  accept() 是一个阻塞型的方法，没有客户端与其连接的时候，一致等待下去
		//第三步： 获取socket对应的流通道
		InputStream inputStream = socket.getInputStream();
		//第四步： 通过输入流通道读取数据
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println("服务端接收到的数据："+ new String(buf,0,length));
		
		
		//服务端给客户端回送数据客户端
		//获取socket的输出流
		OutputStream out = socket.getOutputStream();
		out.write("客户端你辛苦啦！！".getBytes());
		
		
		
		//第五步： 关闭资源
		serverSocket.close();
	}
	
}
