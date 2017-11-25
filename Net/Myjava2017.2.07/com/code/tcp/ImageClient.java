package com.code.tcp;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
//获取图片的客户端
public class ImageClient {

	public static void main(String[] args) throws Exception {
		//第一步： 建立tcp客户端服务。
		Socket socket= new Socket(InetAddress.getByName("192.168.1.68"),9090);
		//获取socket的输入流对象
		InputStream inputStream = socket.getInputStream();
		//建立一个文件的输出流对象
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\美女.jpg");
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length= inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		fileOutputStream.close();
		socket.close();
	}
	
}
