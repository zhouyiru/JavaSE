package com.code.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 װ�������ģʽ�� ��ǿһ����Ĺ��ܡ�
 
  ����1 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ����кš�
 
 ����2 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ��зֺš�
 
 ����3 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ���˫���š�
 
 ����4 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ����к�+ �ֺš�
 
 ����5 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ����к�+ ˫���š�
 
 ����6 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ��зֺ�+˫���š�
 
 ����7 ����дһ�����BufferedReader�Ĺ��ܽ�����ǿ�� ��ǿ��readLine�������������ݴ����к�+ �ֺ�+˫���š�
 
װ�������ģʽ�Ĳ��裺
 	1. ����ǿ����ڲ�ά��һ������ǿ������á� 
 	2. ����ǿ�뱻��ǿ����һ����ͬ��������Ǹ��ӿ�.
 
װ�������ģʽ�ģ�
 	�ô��������˶�̬�ﵽ ��������֮����Ի����װ�Σ��Ƚ���
 	ȱ�㣺 ����ṹ��������������⡣
 */
//���кŵĻ�����   ��ǿ��
class BufferedLineNum extends BufferedReader{	
	BufferedReader bufferedReader;    // BufferedReader bufferedReader = new BufferedSemi();	
	int count = 1; 	
	public BufferedLineNum(BufferedReader bufferedReader){  // BufferedReader bufferedReader = new BufferedSemi();
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();  // �����������������readLine������BufferedSemi��readline������ô���������ˡ�
		if(line==null){
			return null;
		}
		line = count+":"+line;
		count++;
		return line;
	}	
}
//���ֺŵĻ��������ַ���
class BufferedSemi extends BufferedReader {  //ΪʲôҪ�̳�BufferedReader ? �̳���Ϊ���ø���Ķ�����Դ��ݸ�BuffereLineNum�Ĺ��췽����
	
	//���ڲ�ά��һ����Ҫ����ǿ���������
	BufferedReader bufferedReader ; 
	
	public BufferedSemi(BufferedReader bufferedReader){
		super(bufferedReader); // �������û���κ����õ���䣬ֻ����Ϊ���ñ��벻������ѡ�   ��Ϊ����û���޲εĹ��췽����
		this.bufferedReader = bufferedReader;
	}
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return  line;		
	}
}
//��˫���� ������
class BufferedQuto extends BufferedReader{
	//���ڲ�ά��һ����Ҫ����ǿ���������
	BufferedReader bufferedReader ; 
	public BufferedQuto(BufferedReader bufferedReader){
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line +"\"";
		return line;
	}
}
public class decorator {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\JAVAѧϰ����\\������\\day20\\����\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
		//������������������
		FileReader fileReader = new FileReader(file);
		//����һ�����������ַ�������
		BufferedReader bufferedReader = new BufferedReader(fileReader);		
		//����һ�����к� �Ļ��������ַ���
		BufferedLineNum  bufferedLineNum = new BufferedLineNum(bufferedReader);	
		//���ֺ�
		BufferedSemi bufferedSemi = new BufferedSemi(bufferedLineNum);	
		//����һ����˫���ŵĻ��������
		@SuppressWarnings("resource")
		BufferedQuto bufferedQuto = new BufferedQuto(bufferedSemi);
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}		
	}
}
