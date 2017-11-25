package com.code.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class chatSender extends Thread {
	@Override
	public void run() {
	
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		DatagramPacket packet = null;
		while((line=bufferedReader.readLine())!=null){
				packet = new DatagramPacket(line.getBytes(),line.getBytes().length,InetAddress.getByName("192.168.1.255"),9090);
				socket.send(packet);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		socket.close();
		}
	}

}
