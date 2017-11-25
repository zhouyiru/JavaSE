package com.code.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ģ������������������ͨѶ
 * 
 * ������������֮���ͨѶ��ʹ��tcpЭ��ġ�
 * 
 * httpЭ�������ڹ淶������������֮��ͨѶ���ݵĸ�ʽ��
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
			//��ȡsocket�������ͨ��
			OutputStream out = socket.getOutputStream();
			out.write("������̫�����ˣ���".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		//��������˵ķ���
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(9191);
		//���ܿͻ��˵�����
		while(true){
			Socket socket = serverSocket.accept();
			new TomcatDemo(socket).start();
			System.out.println("�û�������...");
		}
	}
	
}
