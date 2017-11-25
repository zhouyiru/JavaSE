package com.code.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 feiQ聊天也是使用了udp协议通讯的。
  
 需求： 给feiQ发送信息。
 
飞Q要处理的格式数据:
	version:time :sender : ip: flag:content ;
	版本号： 时间：发送人: IP地址 : 标识符（32）: 真正的内容
 
任何的网络程序都有自己的加密方式，如果给网络程序发送信息的时候，如果不符合他所要的格式数据，那么就会当成垃圾数据丢弃。
 
 IP地址 = 网络号 + 主机号
   192.168.1.255 
   
在udp协议中有一个ip地址称作为广播IP地址， 广播IP主机号为255的。  
给广播IP地址发送消息的时候，在同一个网络段的同学都可以接受到。  
 
 */
public class feiq{
	
	public static void main(String[] args) throws IOException {
		//第一步： 建立udp的服务
		DatagramSocket socket = new DatagramSocket();
		
		//准备数据，把数据封装到数据包中
		String data = getData("hello FeiQ");
		byte[] buf = data.getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 2425);
		
		//调用udp的服务，发送数据
		socket.send(packet);
		
		//关闭资源
		socket.close();
	}
	
	public static String getData(String data){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("习总:");
		sb.append("192.168.1.47:");
		sb.append("32:");
		sb.append(data);
		
		return sb.toString();
	}
	

}
