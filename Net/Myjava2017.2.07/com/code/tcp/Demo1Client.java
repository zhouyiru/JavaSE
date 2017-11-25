package com.code.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*
 tcp���ص㣺
 	1. tcpЭ��ͨѶ���������ӵģ�tcp�Ŀͻ���һ������������Ҫ�����˽������ӡ� 
 	2. tcpЭ���������д����������,tcp�ǻ���IO���������ݴ��䡣
 	3. ͨ���������ֻ������ӣ��ɿ�Э��(��֤���ݴ����������)
 	4. ��Ϊtcp���������ӵģ�����Ч���Ե�. 
 	5. tcpЭ���Ƿֿͻ��������ˡ� 
 
 	���磺QQ�ļ����䡢 ��Q�ļ����䡢 ��绰...

tcpЭ���µ�Socket  ��
	Socket(�ͻ�����)
	ServerSocket��������ࣩ

һ�������������ܹ�������Ϣ�뷢����Ϣ����ô���ٻ�ռ�������˿ڡ� 
 */
//�ͻ���
public class Demo1Client {
	
	public static void main(String[] args) throws Exception {
		//��һ���� ����tcp�Ŀͻ��˷���
		Socket  socket = new Socket(InetAddress.getLocalHost(), 9090);
		//�ڶ����� ׼�� ���� , ��ȡ��Ӧ����ͨ����
		String data = "������ҵ�һ��tcp������";
		OutputStream out = socket.getOutputStream();
		//�������� ���԰�����д��
		out.write(data.getBytes());
		
		
		//�ͻ���Ҫ���շ���˻��͵�����
		//��ȡsocket��������
		InputStream inputStream  = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length =inputStream.read(buf); 
		System.out.println("�ͻ��˽��յ��������ǣ�"+ new String(buf,0,length));
		
		
		
		
		//���Ĳ����ر���Դ
		socket.close();
	}
}
