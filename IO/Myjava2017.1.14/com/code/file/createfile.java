package com.code.file;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("F:\\JAVA学习资料\\a.txt");
		File dir =new File("F:\\JAVA学习资料\\abc");
		File dir1 =new File("F:\\JAVA学习资料\\aa\\bb");
		System.out.println(file.createNewFile());//创建空文件
		System.out.println(dir.mkdir());//创建单级文件夹
		System.out.println(dir1.mkdirs());//创建多级文件夹		
		//System.out.println(dir1.delete());
	}

}
