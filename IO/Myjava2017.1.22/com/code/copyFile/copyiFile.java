package com.code.copyFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyiFile {//�ַ����ʺϿ����ļ������ʺϿ���ͼƬ����Ƶ����Ƶ��word�ȣ����С�仯�����ļ�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyImage();
	}
public static void copyImage() throws IOException{
	File file1 = new File("F:\\JAVAѧϰ����\\������\\day20\\����\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
	File file2 = new File("F:\\JAVAѧϰ����\\������\\day20\\����\\day20\\src\\cn\\itcast\\writer\\����.java");
	FileReader fileReader = new FileReader(file1);
	FileWriter fileWriter = new FileWriter(file2);
	char[] buf = new char[1024];
	int length=0;
	while((length=fileReader.read(buf))!=-1){
		fileWriter.write(buf,0,length);
	}
	fileWriter.close();
	fileReader.close();
}
}
