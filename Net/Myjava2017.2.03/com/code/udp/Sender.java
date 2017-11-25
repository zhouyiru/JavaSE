package com.code.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Sender {
	
    public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub

	DatagramSocket socket=new DatagramSocket();//插座（码头）
	String data="我的第一个udp例子";
	byte[] buf=data.getBytes();
	DatagramPacket packet=new DatagramPacket(buf,buf.length,InetAddress.getLocalHost(),8080);//打包
	socket.send(packet);
	socket.close();//释放端口号
}
}
