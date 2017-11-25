package com.code.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	public static void main(String[] args) throws IOException {
		ReadTest1();
		ReadTest2();
	}
	public static void ReadTest1() throws IOException{//方式一
		File file = new File("F:\\JAVA学习资料\\a.txt");
		FileReader fileReader=new FileReader(file);
		int content=0;
		while((content=fileReader.read())!=-1){//每次读取一个字符的数据
			System.out.print((char)content);
		}
		fileReader.close();
	}

	public static void ReadTest2() throws IOException{//方式二
		File file = new File("F:\\JAVA学习资料\\a.txt");
		FileReader fileReader=new FileReader(file);
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		fileReader.close();
	}
}
