package com.code.tcp;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
//��ȡͼƬ�Ŀͻ���
public class ImageClient {

	public static void main(String[] args) throws Exception {
		//��һ���� ����tcp�ͻ��˷���
		Socket socket= new Socket(InetAddress.getByName("192.168.1.68"),9090);
		//��ȡsocket������������
		InputStream inputStream = socket.getInputStream();
		//����һ���ļ������������
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\��Ů.jpg");
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length= inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		fileOutputStream.close();
		socket.close();
	}
	
}
