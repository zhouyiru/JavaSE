package com.code.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收端
public class UDPSafeReceive {

	public static void main(String[] args) throws Exception {
		//建立udp的服务
		DatagramSocket socket = new DatagramSocket(9090);
		//准备空的数据包，用于存储数据
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		boolean  flag = true;
		while(flag){
			socket.receive(packet);
			Thread.sleep(10);  //模拟cpu处理能力不足
			System.out.println("接收到的数据："+ new String(buf,0,packet.getLength()));
		}
		//关闭资源
		socket.close();
		
		
	}
	
}
