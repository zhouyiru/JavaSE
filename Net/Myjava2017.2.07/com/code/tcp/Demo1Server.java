package com.code.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//�����  ServerSocket
public class Demo1Server {

	public static void main(String[] args) throws Exception {
		//��һ���� ����tcp�ķ���ˡ� 
		ServerSocket serverSocket = new ServerSocket(9090);
		//�ڶ��������ܿͻ��˵�����
		Socket socket = serverSocket.accept();   //  accept() ��һ�������͵ķ�����û�пͻ����������ӵ�ʱ��һ�µȴ���ȥ
		//�������� ��ȡsocket��Ӧ����ͨ��
		InputStream inputStream = socket.getInputStream();
		//���Ĳ��� ͨ��������ͨ����ȡ����
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println("����˽��յ������ݣ�"+ new String(buf,0,length));
		
		
		//����˸��ͻ��˻������ݿͻ���
		//��ȡsocket�������
		OutputStream out = socket.getOutputStream();
		out.write("�ͻ���������������".getBytes());
		
		
		
		//���岽�� �ر���Դ
		serverSocket.close();
	}
	
}
