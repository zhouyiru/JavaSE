package com.code.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
转换流：

InputStreamReader  ：InputStreamReader 是字节流通向字符流的桥梁

OutputStreamWriter	输出字节流的转换流。 	输出字节流转换成输出字符流

转换流的作用：
	1. 可以把字节流转换成字符流。
	2. 可以指定任意的码表进行读写数据。

FileReader---------- gbk
FileWriter ---------gbk

 */
public class outputStreamWriter {

	public static void main(String[] args) throws IOException {
		writeTest1();
		writeData();
		
	}
	
	
	//指定码表进行写数据
	public static void writeData() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\a.txt");  // FileWriter 默认使用的码表是gbk码表，而且不能指定码表写。
		OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		fileWriter.write("中国");
		fileWriter.close();
	}
	

	//把输出字节流转换成输出字符流
	public static void  writeTest1() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("f:\\a.txt");
		String data = "hello world";
		//需求：要把输出字节流转换成输出字符流.          //字节流向文件输出数据的时候需要借助String类的getbyte功能，我想使用字符流.
		OutputStreamWriter writer  = new OutputStreamWriter(fileOutputStream);
		//写出数据
		writer.write(data);
		//关闭资源
		writer.close();
	}
	


}

