package com.code.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 feiQ����Ҳ��ʹ����udpЭ��ͨѶ�ġ�
  
 ���� ��feiQ������Ϣ��
 
��QҪ����ĸ�ʽ����:
	version:time :sender : ip: flag:content ;
	�汾�ţ� ʱ�䣺������: IP��ַ : ��ʶ����32��: ����������
 
�κε�����������Լ��ļ��ܷ�ʽ������������������Ϣ��ʱ���������������Ҫ�ĸ�ʽ���ݣ���ô�ͻᵱ���������ݶ�����
 
 IP��ַ = ����� + ������
   192.168.1.255 
   
��udpЭ������һ��ip��ַ����Ϊ�㲥IP��ַ�� �㲥IP������Ϊ255�ġ�  
���㲥IP��ַ������Ϣ��ʱ����ͬһ������ε�ͬѧ�����Խ��ܵ���  
 
 */
public class feiq{
	
	public static void main(String[] args) throws IOException {
		//��һ���� ����udp�ķ���
		DatagramSocket socket = new DatagramSocket();
		
		//׼�����ݣ������ݷ�װ�����ݰ���
		String data = getData("hello FeiQ");
		byte[] buf = data.getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 2425);
		
		//����udp�ķ��񣬷�������
		socket.send(packet);
		
		//�ر���Դ
		socket.close();
	}
	
	public static String getData(String data){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("ϰ��:");
		sb.append("192.168.1.47:");
		sb.append("32:");
		sb.append(data);
		
		return sb.toString();
	}
	

}
