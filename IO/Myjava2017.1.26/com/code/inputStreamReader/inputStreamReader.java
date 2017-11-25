package com.code.inputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
ת������

InputStreamReader  ��InputStreamReader ���ֽ���ͨ���ַ���������

OutputStreamWriter	����ֽ�����ת������ 	����ֽ���ת��������ַ���

ת���������ã�
	1. ���԰��ֽ���ת�����ַ�����
	2. ����ָ������������ж�д���ݡ�

FileReader---------- gbk
FileWriter ---------gbk

 */
public class inputStreamReader {

	public static void main(String[] args) throws IOException {
		readTest1();
		readData();
	}
	
	//ָ������ȡ����
	public static void readData() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		char[] buf = new char[1024];
		int length = 0 ; 
		while((length = inputStreamReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		
		//�ر���Դ
		inputStreamReader.close();
	}
	
	//�������ֽ���ת�����������ַ���  -----> InputStreamReader
	public static void readTest1() throws IOException{
		//�Ȼ�ȡ��׼ ��������
		//InputStream in = System.in;
		//���ֽ���ת�����ַ���
		
		//InputStreamReader inputStreamReader = new InputStreamReader(in);
		
		//һ�ζ�ȡһ�еĹ���
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			System.out.println(line);
		}
		
	}
}

