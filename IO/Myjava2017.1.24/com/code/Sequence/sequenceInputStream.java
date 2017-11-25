package com.code.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
SequenceInputStream (序列流) ： 可以把多个输入流串联起来读取，先从第一个开始i读取，然后再下一个....

序列流是没有读取文件的能力。


需求：把day01 与 day02的文件合并成一个. ----->  总结.txt
 */
public class sequenceInputStream {

	
	public static void main(String[] args) throws IOException {
		merge4();
	}
	
	
	public static void merge4() throws IOException{
		//找到目标文件对象
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File inFile3 = new File("f:\\day03.txt");
		File outFile = new File("f:\\总结.txt");
		
		//建立数据的输入输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);

		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileInputStream fileInputStream3 = new FileInputStream(inFile3);
		
		//
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		list.add(fileInputStream3);
		final Iterator<FileInputStream> it = list.iterator();
		
		
		//创建一个序列流对象
		SequenceInputStream sequenceInputStream = new SequenceInputStream(new Enumeration<FileInputStream>() {

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
			
				return it.next();
			}
		});
		
		//创建缓冲数组，边读边写
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		sequenceInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	//把三个文件合并成一个。
	public static void merge3() throws IOException{
		//找到目标文件对象
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File inFile3 = new File("f:\\day03.txt");
		File outFile = new File("f:\\总结.txt");
		
		//建立数据的输入输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);

		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileInputStream fileInputStream3 = new FileInputStream(inFile3);
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();   //Vector 是一个线程安全的类，操作效率低。 我想使用ArrayList
		v.add(fileInputStream1);
		v.add(fileInputStream2);
		v.add(fileInputStream3);
		Enumeration<FileInputStream> e = v.elements();  //通过Vector得到一个老式迭代器。
			
		//创建一个序列流对象
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		
		//创建缓冲数组，边读边写
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		sequenceInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	
	
	//使用SequenceInputStream完成合并文件的需求
	@SuppressWarnings("resource")
	public static void merge2() throws IOException{
		//找到目标文件对象
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File outFile = new File("f:\\总结.txt");
		
		//第二步：建立数据的输入输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//建立数据的输入输出通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2= new FileInputStream(inFile2);
		//创建序列流对象   
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		sequenceInputStream.close();	
		fileOutputStream.close();	
	}
	
	
	
	
	
	
	//需求： 合并两个文件到一个文件上。
	public static void merge1() throws IOException{
		//找到目标文件对象
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File outFile = new File("f:\\总结.txt");
		//输出流
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//建立数据的输入输出通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2= new FileInputStream(inFile2);
		//把输入流对象存储到集合集合中。
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0;
		
		for(int i = 0 ; i<list.size() ; i++){
			FileInputStream inputStream = list.get(i);
			while((length = inputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			}
			//关闭资源
			inputStream.close();
		}
		fileOutputStream.close();
	}
}
