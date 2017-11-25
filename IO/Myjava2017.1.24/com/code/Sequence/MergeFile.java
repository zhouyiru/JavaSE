package com.code.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		mergeFile();
	}
	//�ϲ�mp3�ļ�
	public static void mergeFile() throws IOException{
		File dir= new File("f:\\music");
		File[] files = dir.listFiles();	//��ȡ���ļ����е��������ļ�
		//����һ��Vector����洢FileInputStream����
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		//�������飬
		for(int i = 0; i<files.length ; i++){
			if(files[i].getName().endsWith(".mp3")){
				vector.add(new FileInputStream(files[i]));
			}
		}
		
		//����һ������������
		SequenceInputStream inputStream = new SequenceInputStream(vector.elements());
		//����һ�����������
		FileOutputStream fileOutputStream = new  FileOutputStream("f:\\���.mp3");
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}	
		//�ر���Դ
		fileOutputStream.close();
		inputStream.close();		
	}
	
}
