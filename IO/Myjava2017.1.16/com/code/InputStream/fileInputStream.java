package com.code.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read1();
		read2();
		read3();
		read4();
	}
 
	public static void read1() throws IOException{
		File file=new File("F:\\JAVAѧϰ����\\a.txt");//�ҵ�Ŀ¼�ļ�
		FileInputStream fileInputStream=new FileInputStream(file);//��������ͨ·
		int content=fileInputStream.read();//��ȡ�ļ�
		System.out.println("��ʽһ��"+(char)content);
		fileInputStream.close();//�ر���Դ
	}
	public static void read2() throws IOException{
		File file=new File("F:\\JAVAѧϰ����\\a.txt");//�ҵ�Ŀ¼�ļ�
		FileInputStream fileInputStream=new FileInputStream(file);//��������ͨ·
		int content=0;//��������,��һ���ֽ�
	   while((content=fileInputStream.read())!=-1){//��ȡ�ļ�
		System.out.println("��ʽ����"+(char)content); 
	
	   }
		fileInputStream.close();//�ر��ļ�
	}
	public static void read3() throws IOException{
		File file=new File("F:\\JAVAѧϰ����\\a.txt");//�ҵ�Ŀ¼�ļ�
		FileInputStream fileInputStream=new FileInputStream(file);//��������ͨ·
		byte[] buf=new byte[1024];//��ȡ�ļ�,������������
		int length=fileInputStream.read(buf);
		System.out.println("��ʽ����"+new String(buf,0,length));
	   
		fileInputStream.close();//�ر��ļ�
	}
	public static void read4() throws IOException{//Ч�����
		long starttime=System.currentTimeMillis();
		File file=new File("F:\\JAVAѧϰ����\\a.txt");//�ҵ�Ŀ¼�ļ�
		FileInputStream fileInputStream=new FileInputStream(file);//��������ͨ·
		byte[] buf=new byte[1024];//��ȡ�ļ�,�����������飨1024�ı���Ч�ʸߣ�
		int length=0;//��¼���ζ�ȡ�Լ�����
		while((length=fileInputStream.read(buf))!=-1){
			System.out.println("��ʽ��:"+new String(buf,0,length));
		}
		fileInputStream.close();//�ر��ļ�
		long endtime=System.currentTimeMillis();
	System.out.println("����ʱ�䣺"+(endtime-starttime));
	
	}
}
