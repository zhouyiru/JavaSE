package com.code.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;




public class Receive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    DatagramSocket socket = new DatagramSocket(8080);
    byte[] buf = new byte[1024];
    DatagramPacket packet = new DatagramPacket(buf,buf.length);
    socket.receive(packet);
    System.out.println(packet.getAddress().getHostAddress()+"���յ����ݣ�"+new String(buf,0,packet.getLength()));//��ȡ���ν��յ����ֽڸ���
    socket.close();
    
	}

}
