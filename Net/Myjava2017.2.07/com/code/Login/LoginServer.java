package com.code.Login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/*
 * �����
 * 
 * ��һ�����⣺ �����û�н��յ�����
 * 
 */
public class LoginServer extends Thread {
	
	Socket  socket ; 

	public LoginServer(Socket socket){
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			//��һ������ȡsocket�����롢���������
			BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStreamWriter socketWriter = new OutputStreamWriter(socket.getOutputStream());
			//�ڶ����� ��ȡ�ͻ��˷��͵���Ϣ��
			while(true){
				String line = socketReader.readLine();
				String[] datas = line.split(" ");
				String option = datas[0]; //�ͻ���ѡ��Ĺ���
				String userName = datas[1]; //�û���
				String password = datas[2]; //����
				Properties properties  = new Properties(); 	
				//�Ȱ������ļ�����Ϣ�ȼ��ص�properties�ļ��ϡ�
				properties.load(new FileReader("F:\\users.txt"));

				
				if("a".equalsIgnoreCase(option)){
					//ע��
				//���û��������뱣�浽Properties��
				if(!properties.containsKey(userName)){
					//������û��������ڣ��ҾͰ��û�����Ϣ�����ȥ��
					properties.setProperty(userName,password);
					// ���û���ע����Ϣ���浽�ļ��ϡ�
					properties.store(new FileWriter("F:\\users.txt"),"users info");
					socketWriter.write("��ϲ��,ע��ɹ�\r\n");
					
					
				}else{
					//����û����Ѿ������ˣ���ô��ʾ�ͻ����û����Ѿ����ڣ�������ע��
					socketWriter.write("���û����Ѿ����ڣ����������룡��\r\n");
					
				}
					
					
				}else if("b".equalsIgnoreCase(option)){
					//��¼
					String tempPassword = properties.getProperty(userName);
					if(tempPassword==null){
						socketWriter.write("û�и��û������ڣ������µ�¼!\r\n");
					}else{
						if(tempPassword.equals(password)){
							socketWriter.write("��ӭ"+userName+"��¼�ɹ�!\r\n");
						}else{
							socketWriter.write("���������������������!\r\n");		
						}
					}	
				}
				socketWriter.flush();
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) throws Exception {
		//����tcp�ķ���ˣ� ����Ҫ����һ���˿�
		@SuppressWarnings("resource")
		ServerSocket serverSocke = new ServerSocket(9090);
		//���ϵĽ����û�����������
		while(true){
			Socket socket = serverSocke.accept();
			//ÿ���û���Ӧ�ÿ���һ���߳�Ϊ�����
			new LoginServer(socket).start();
		}
	}
	

}
