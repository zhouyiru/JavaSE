package com.code.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
�����̣� ����Ҫ�������������ͨѶ.  ���磺QQ �� feiQ �� ��֩��  ������  
 
��ҳ��̣� ��html��Ϊ����ʵ��������������֮���ͨѶ��

��������磺   �ֲ��ڲ�ͬ����ļ����ͨ���ⲿ�豸�Ѽ���������������ﵽ�����������������Դ��Ŀ�ľͳ���Ϊһ����������硣
  
�������������ͨѶ��Ҫ�أ�
  1. IP��ַ
  2. �˿ں�
  3. ͨѶЭ��
 
IP��ַ��   IP��ַ�ı�������32��������λ����ɵģ� Ϊ�˷��������¼�����԰�һ��ip��ַ�ֳ���4�Σ� ÿ��8�����������ݡ� 2^8 = 0~255

	192.168.1.10   
IP��ַ����������� + ������

IP�����
	A���ַ��  һ������� + ����������     ����
	B���ַ�� ���������+ ����������      ѧУ����ҵ��λ
	C���ַ�� ��������� + һ��������     


�˿ںţ� �˿ںŵķ�Χ���������������� ,  ��0��1023�����ǽ��ܰ󶨣�binding����һЩ����   1024 �� 65535

���ö˿�
	21    FTP        
	80    HTTP
	443  HTTPS

 
 ͨѶЭ�飺
 	Udp Э��
 	tcp Э��

UDP
	�����ݼ���Դ��Ŀ�ķ�װΪ���ݰ�������Ҫ�������ӡ�
	ÿ�����ݰ���С������64K��
	��Ϊ�����ӣ����Բ��ɿ�,���ݰ��ᶪʧ��
	Ч�ʸߡ�

���磺��ܵĶԽ����� feiQͨѶ��  cs �� 

TCP 
	�������ӣ������е�ͨ��
	�������д����������
	ͨ���������ֻ������ӣ��ɿ�Э��
	Ч�ʵ�
	
���磺 ��绰�� FeiQ�ļ����䡢 

java�������������ԣ�����javaʹ����һ����������IP��ַ�� 

InetAddress IP��ַ��

InetAddress��Ҫ���յķ�����
	
	getLocalHost()      ���ر�����IP��ַ����
	getByName(String host)   ָ���ַ�����ʽ��IP��ַ���������������� һ��IP��ַ����


	getHostAddress()     ����IP��ַ�ַ����ı�ʾ��ʽ�� 
 	String getHostName()  ���ؼ���������֡�

	getAllByName(String host) 


 */
public class inetAddress {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress address = InetAddress.getLocalHost();  //��ȡ��������IP��ַ����
	
		InetAddress address = InetAddress.getByName("SNZ1SLEC1PUL97S");
		System.out.println("IP �� "+ address.getHostAddress());
		System.out.println("����������֣�"+ address.getHostName());
		
		InetAddress.getAllByName("http://www.baidu.com");
		
	}
	
}
