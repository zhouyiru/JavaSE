package com.code.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 ���� ��һ��MP3�г�n�ݣ�ÿ����1m��Ȼ���ٺϲ�������
 */
public class CutFile {
	public static void main(String[] args) throws IOException {
		cutFile();
	}		

	//�и�mp3
	public static void cutFile() throws IOException{
		File file = new File("F:\\��Ů\\1.mp3");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024*1024];
		int length = 0 ; 
		int count = 1; 	
		while((length = fileInputStream.read(buf))!=-1){				
			//ÿ��ȡһ�Σ�������һ���ļ�
			FileOutputStream fileOutputStream = new FileOutputStream("F:\\music\\part"+count+".mp3");
			//�Ѷ�ȡ��������д��
			fileOutputStream.write(buf,0,length);
			count++;
			//�ر���Դ
			fileOutputStream.close();
		}
		//�ر���Դ
		fileInputStream.close();	
	}
}
