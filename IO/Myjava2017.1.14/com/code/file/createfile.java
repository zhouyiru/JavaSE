package com.code.file;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("F:\\JAVAѧϰ����\\a.txt");
		File dir =new File("F:\\JAVAѧϰ����\\abc");
		File dir1 =new File("F:\\JAVAѧϰ����\\aa\\bb");
		System.out.println(file.createNewFile());//�������ļ�
		System.out.println(dir.mkdir());//���������ļ���
		System.out.println(dir1.mkdirs());//�����༶�ļ���		
		//System.out.println(dir1.delete());
	}

}
