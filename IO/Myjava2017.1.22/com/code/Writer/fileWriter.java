package com.code.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteTest();
	}

	public static void WriteTest() throws IOException{
		File file=new File("F:\\JAVAѧϰ����\\a.txt");
		FileWriter fileWriter = new FileWriter(file,true);//true��ʾ׷�����ݣ�Ĭ������ı���д�룩
		String data="����";
		fileWriter.write(data);
		fileWriter.close();//�ڲ�ά�����ַ����飬�������flush()����close()����������������
	}
}
