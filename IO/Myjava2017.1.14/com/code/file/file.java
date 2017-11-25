package com.code.file;

import java.io.File;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1=new File(".");
		System.out.println(file1.getAbsoluteFile());
		
		File file2=new File("..\\快捷键.txt");
		System.out.println("有文件么："+file2.exists());
	}

}
