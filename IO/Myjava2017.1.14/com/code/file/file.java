package com.code.file;

import java.io.File;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1=new File(".");
		System.out.println(file1.getAbsoluteFile());
		
		File file2=new File("..\\��ݼ�.txt");
		System.out.println("���ļ�ô��"+file2.exists());
	}

}
