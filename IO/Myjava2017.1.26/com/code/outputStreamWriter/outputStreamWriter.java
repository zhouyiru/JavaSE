package com.code.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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
public class outputStreamWriter {

	public static void main(String[] args) throws IOException {
		writeTest1();
		writeData();
		
	}
	
	
	//ָ��������д����
	public static void writeData() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\a.txt");  // FileWriter Ĭ��ʹ�õ������gbk������Ҳ���ָ�����д��
		OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		fileWriter.write("�й�");
		fileWriter.close();
	}
	

	//������ֽ���ת��������ַ���
	public static void  writeTest1() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\a.txt");
		String data = "hello world";
		//����Ҫ������ֽ���ת��������ַ���.          //�ֽ������ļ�������ݵ�ʱ����Ҫ����String���getbyte���ܣ�����ʹ���ַ���.
		OutputStreamWriter writer  = new OutputStreamWriter(fileOutputStream);
		//д������
		writer.write(data);
		//�ر���Դ
		writer.close();
	}
	


}

