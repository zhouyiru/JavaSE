package com.code.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���ն�
public class UDPSafeReceive {

	public static void main(String[] args) throws Exception {
		//����udp�ķ���
		DatagramSocket socket = new DatagramSocket(9090);
		//׼���յ����ݰ������ڴ洢����
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		boolean  flag = true;
		while(flag){
			socket.receive(packet);
			Thread.sleep(10);  //ģ��cpu������������
			System.out.println("���յ������ݣ�"+ new String(buf,0,packet.getLength()));
		}
		//�ر���Դ
		socket.close();
		
		
	}
	
}
