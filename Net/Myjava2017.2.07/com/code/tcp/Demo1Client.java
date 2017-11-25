package com.code.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*
 tcp的特点：
 	1. tcp协议通讯是面向连接的，tcp的客户端一旦建立，马上要与服务端建立连接。 
 	2. tcp协议在连接中传输大数据量,tcp是基于IO流进行数据传输。
 	3. 通过三次握手机制连接，可靠协议(保证数据传输的完整性)
 	4. 因为tcp是面向连接的，所以效率稍低. 
 	5. tcp协议是分客户端与服务端。 
 
 	比如：QQ文件传输、 飞Q文件传输、 打电话...

tcp协议下的Socket  ：
	Socket(客户端类)
	ServerSocket（服务端类）

一个网络程序如果能够接收消息与发送消息，那么至少会占用两个端口。 
 */
//客户端
public class Demo1Client {
	
	public static void main(String[] args) throws Exception {
		//第一步： 建立tcp的客户端服务
		Socket  socket = new Socket(InetAddress.getLocalHost(), 9090);
		//第二步： 准备 数据 , 获取对应的流通道。
		String data = "这个是我第一个tcp的例子";
		OutputStream out = socket.getOutputStream();
		//第三步： 可以吧数据写出
		out.write(data.getBytes());
		
		
		//客户端要接收服务端回送的数据
		//获取socket的输入流
		InputStream inputStream  = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length =inputStream.read(buf); 
		System.out.println("客户端接收到的内容是："+ new String(buf,0,length));
		
		
		
		
		//第四步：关闭资源
		socket.close();
	}
}
