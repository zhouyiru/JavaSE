package com.code.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class chatReceive extends Thread{

	
	@Override
	public void run() {
		try {
			@SuppressWarnings("resource")
			DatagramSocket socket = new DatagramSocket(9090);
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf,buf.length);
			while(true){
				socket.receive(packet);
				System.out.println(packet.getAddress().getHostAddress()+"˵:"+new String(buf,0,packet.getLength()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
