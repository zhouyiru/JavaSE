package com.code.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest();

	}
	public static void readTest(){
		FileInputStream fileInputStream=null;
		try{
			File file=new File("F:\\JAVAѧϰ����\\a.txt");//�ҵ�Ŀ¼�ļ�
			fileInputStream=new FileInputStream(file);//��������ͨ·
			byte[] buf=new byte[1024];//��ȡ�ļ�,�����������飨1024�ı���Ч�ʸߣ�
			int length=0;//��¼���ζ�ȡ�Լ�����
			while((length=fileInputStream.read(buf))!=-1){
				System.out.println("��ʽ��:"+new String(buf,0,length));
			}
		}catch(IOException e){
			System.out.println("��ȡ�ļ�����");
			throw new RuntimeException(e);//�����ڵ�(��װ����)
		}finally{
			try{
				if(fileInputStream!=null){
					fileInputStream.close();//�ر��ļ�
					System.out.println("�ر���Դ�ɹ�");
				}
			}catch(IOException e){
				System.out.println("�ر���Դʧ��");
				throw new RuntimeException(e);
			}
		}
	}
}
