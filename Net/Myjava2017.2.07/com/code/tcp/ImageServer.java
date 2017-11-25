package com.code.tcp;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
/*
 ���� ��дһ������˿��������ͻ��˽������ӣ��ͻ���һ�����ӳɹ�����������һ��ͼƬ���ݸ��ͻ��ˡ���
 
 */

//�����
public class ImageServer extends Thread {

	Socket socket;
	
	static HashSet<String> ips = new HashSet<String>();  //�ü������û��洢�ͻ��˵�ip��ַ�ġ�
	
	 public ImageServer(Socket socket) {
		 this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//�������� ��ȡsocket����ֽ���
			OutputStream socketOut = socket.getOutputStream(); 
			//���Ĳ�����ȡͼƬ������������ȡͼƬ�����ݣ���ͼƬ����д�����ͻ���
			FileInputStream fileInputStream = new FileInputStream("F:\\��Ů\\1.jpg");
			byte[] buf = new byte[1024];
			int length = 0 ; 
			while((length = fileInputStream.read(buf))!=-1){
				socketOut.write(buf,0,length);
			}
			
			String ip  = socket.getInetAddress().getHostAddress(); //��ȡ���Է���ip��ַ
			if(ips.add(ip)){ //������Դ洢�������У���ô����ζ����� ��һ���µ�IP��ַ��
				System.out.println("��ϲ��"+ ip+"ͬѧ����ͼƬ�ɹ�����");
				System.out.println("��ǰ���ص�������"+ ips.size());
				
			}
			
			
			//���岽���ر���Դ
			fileInputStream.close();
			socket.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		//��һ���� ����tcp����˵ķ���
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(9090);
		while(true){
			Socket socket =	serverSocket.accept(); //���ϵĽ����û�����������
			new ImageServer(socket).start();  //���������һ��Socket����ô����ζ����һ���û������������ˣ���ô���Ͽ���һ�߳�Ϊ�����
		}
	}
	
	
}
