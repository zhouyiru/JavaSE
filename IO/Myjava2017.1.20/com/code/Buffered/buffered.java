package com.code.Buffered;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
public class buffered {

	public static void main(String[] args) throws IOException {
		readTest();
		writeTest();
	}
		public static void readTest() throws IOException{
	    File file=new File("F:\\JAVA学习资料\\a.txt");
	    FileInputStream fileInputStream=new FileInputStream(file);
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		int content=0;
		while((content=bufferedInputStream.read())!=-1){
			System.out.println((char)content);
		}
		bufferedInputStream.close();
	 }
		public static void writeTest() throws IOException{
			File file=new File("F:\\JAVA学习资料\\a.txt");
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			String data="hello";
			bufferedOutputStream.write(data.getBytes());
			//bufferedOutputStream.flush();
			bufferedOutputStream.close();
		}	
	}

