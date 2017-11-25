package com.code.inputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class inputStreamReader {

	public static void main(String[] args) throws IOException {
		readTest1();
		readData();
	}
	
	//指定码表读取数据
	public static void readData() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		char[] buf = new char[1024];
		int length = 0 ; 
		while((length = inputStreamReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		
		//关闭资源
		inputStreamReader.close();
	}
	
	//把输入字节流转换成了输入字符流  -----> InputStreamReader
	public static void readTest1() throws IOException{
		//先获取标准 的输入流
		//InputStream in = System.in;
		//把字节流转换成字符流
		
		//InputStreamReader inputStreamReader = new InputStreamReader(in);
		
		//一次读取一行的功能
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			System.out.println(line);
		}
		
	}
}

