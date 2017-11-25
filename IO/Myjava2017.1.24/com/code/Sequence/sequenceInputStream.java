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
SequenceInputStream (������) �� ���԰Ѷ������������������ȡ���ȴӵ�һ����ʼi��ȡ��Ȼ������һ��....

��������û�ж�ȡ�ļ���������


���󣺰�day01 �� day02���ļ��ϲ���һ��. ----->  �ܽ�.txt
 */
public class sequenceInputStream {

	
	public static void main(String[] args) throws IOException {
		merge4();
	}
	
	
	public static void merge4() throws IOException{
		//�ҵ�Ŀ���ļ�����
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File inFile3 = new File("f:\\day03.txt");
		File outFile = new File("f:\\�ܽ�.txt");
		
		//�������ݵ��������ͨ��
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
		
		
		//����һ������������
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
		
		//�����������飬�߶���д
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		sequenceInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	//�������ļ��ϲ���һ����
	public static void merge3() throws IOException{
		//�ҵ�Ŀ���ļ�����
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File inFile3 = new File("f:\\day03.txt");
		File outFile = new File("f:\\�ܽ�.txt");
		
		//�������ݵ��������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);

		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileInputStream fileInputStream3 = new FileInputStream(inFile3);
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();   //Vector ��һ���̰߳�ȫ���࣬����Ч�ʵ͡� ����ʹ��ArrayList
		v.add(fileInputStream1);
		v.add(fileInputStream2);
		v.add(fileInputStream3);
		Enumeration<FileInputStream> e = v.elements();  //ͨ��Vector�õ�һ����ʽ��������
			
		//����һ������������
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		
		//�����������飬�߶���д
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		sequenceInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	
	
	//ʹ��SequenceInputStream��ɺϲ��ļ�������
	@SuppressWarnings("resource")
	public static void merge2() throws IOException{
		//�ҵ�Ŀ���ļ�����
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File outFile = new File("f:\\�ܽ�.txt");
		
		//�ڶ������������ݵ��������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//�������ݵ��������ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2= new FileInputStream(inFile2);
		//��������������   
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = sequenceInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		sequenceInputStream.close();	
		fileOutputStream.close();	
	}
	
	
	
	
	
	
	//���� �ϲ������ļ���һ���ļ��ϡ�
	public static void merge1() throws IOException{
		//�ҵ�Ŀ���ļ�����
		File inFile1 = new File("F:\\day01.txt");
		File inFile2 = new File("f:\\day02.txt");
		File outFile = new File("f:\\�ܽ�.txt");
		//�����
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//�������ݵ��������ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2= new FileInputStream(inFile2);
		//������������洢�����ϼ����С�
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0;
		
		for(int i = 0 ; i<list.size() ; i++){
			FileInputStream inputStream = list.get(i);
			while((length = inputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			}
			//�ر���Դ
			inputStream.close();
		}
		fileOutputStream.close();
	}
}
