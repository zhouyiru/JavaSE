package com.code.IOException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyTest();
	}
	public static void copyTest(){
		FileInputStream fileInputStream=null;//����
		FileOutputStream fileOutputStream=null;
		try{
			File infile=new File("F:\\JAVAѧϰ����\\������\\day19\\hashSet����.png");
			File outfile=new File("E:\\����.png");
			fileInputStream=new FileInputStream(infile);
			fileOutputStream=new FileOutputStream(outfile);
			byte[] buf=new byte[1024];
			int length=0;
			while((length=fileInputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			} 
		}catch(IOException e){
			System.out.println("�����ļ�ʧ��");
			throw new RuntimeException(e);
		}finally{
			try{
				if(fileOutputStream!=null){
					fileOutputStream.close();//�ȿ���أ�Ƕ�ף�		
					System.out.println("�ر��ļ��ɹ�");
				}
			}catch(IOException e){
				System.out.println("�ر��ļ�ʧ��");
				throw new RuntimeException(e);
			}
		}{
			try{
				if(fileInputStream!=null){
					fileInputStream.close();//�ȿ���أ�Ƕ�ף�
					System.out.println("�ر��ļ��ɹ�");
				}
			}catch(IOException e){
				System.out.println("�ر��ļ�ʧ��");
				throw new RuntimeException(e);
			}
		}
	}

}
