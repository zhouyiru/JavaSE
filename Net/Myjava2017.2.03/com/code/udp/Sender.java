package com.code.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Sender {
	
    public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub

	DatagramSocket socket=new DatagramSocket();//��������ͷ��
	String data="�ҵĵ�һ��udp����";
	byte[] buf=data.getBytes();
	DatagramPacket packet=new DatagramPacket(buf,buf.length,InetAddress.getLocalHost(),8080);//���
	socket.send(packet);
	socket.close();//�ͷŶ˿ں�
}
}
