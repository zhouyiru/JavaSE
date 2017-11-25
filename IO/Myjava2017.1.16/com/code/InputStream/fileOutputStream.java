package com.code.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

	public static void main(String[] args) throws IOException {
		write1();
	}
	public static void write1() throws IOException {
		File file =new File("F:\\JAVA学习资料\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		String str="hello world";
		byte[] buf=str.getBytes();//把字节数组写出
		fileOutputStream.write(buf);
		fileOutputStream.close();
	}

}
