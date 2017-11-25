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
	//合并mp3文件
	public static void mergeFile() throws IOException{
		File dir= new File("f:\\music");
		File[] files = dir.listFiles();	//获取到文件夹中的所有子文件
		//创建一个Vector对象存储FileInputStream对象
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		//遍历数组，
		for(int i = 0; i<files.length ; i++){
			if(files[i].getName().endsWith(".mp3")){
				vector.add(new FileInputStream(files[i]));
			}
		}
		
		//创建一个序列流对象
		SequenceInputStream inputStream = new SequenceInputStream(vector.elements());
		//创建一个输出流对象
		FileOutputStream fileOutputStream = new  FileOutputStream("f:\\晚风.mp3");
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}	
		//关闭资源
		fileOutputStream.close();
		inputStream.close();		
	}
	
}
