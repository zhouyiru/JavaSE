package com.code.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
/*
1. ʹ��tcpЭ���дһ����������ע���¼���ܡ�(֧�ֶ��û�ͬʱע���ڵ�¼)

Ҫ�� 
	1. �û�ע������ݱ���Ҫ���浽����˵��ļ����档
	2. �ͻ��˵�¼��ʱ�򣬿ͻ��������������Ҫ�����˵��ļ�У�飬������ڸ��û��������룬�������¼�ɹ���

ʹ���ַ���д�����ݵ�ʱ��,������д�������ڲ�ά���Ļ����ַ������У���Ҫ����flush������close�������ݲŻ�������д��ȥ�� �����ַ������Ѿ��洢���ˣ�����Ҳһ��
��д��ȥ��


*/

//�ͻ���
public class LoginClient {
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//����tcp�ͻ��˵ķ���
		@SuppressWarnings("resource")
		Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
		//��ȡsocket�����롢���ͨ����
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStreamWriter socketWriter = new OutputStreamWriter(socket.getOutputStream());
		
		//�û�ѡ��Ĺ���
		while(true){
			System.out.println("��ѡ���ܣ� A(ע��)   B(��¼)");
			String option = scanner.next();
			if("a".equalsIgnoreCase(option)){
				System.out.println("��ѡ����ע�Ṧ��");
				//ע��
				getInfo(scanner, socketReader, socketWriter, option);
				
				
			}else if("b".equalsIgnoreCase(option)){
				//��¼
				System.out.println("��ѡ���˵�¼����");
				getInfo(scanner, socketReader, socketWriter, option);
				
			}else{
				System.out.println("���ѡ������,������ѡ��!!");
			}
		}
	}

	public static void getInfo(Scanner scanner, BufferedReader socketReader,
			OutputStreamWriter socketWriter, String option) throws IOException {
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("��ѡ������:");
		String password = scanner.next();
		//���û��������뷢�͸������
		String line =option+" "+userName+" "+password+"\r\n";    
		socketWriter.write(line);
		//ˢ�»�����
		socketWriter.flush();
		
		//��ȡ����˵ķ�����Ϣ
		 line = socketReader.readLine();
		System.out.println(line);
	}
	

}
