package com.code.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 需求： 把一首MP3切成n份，每份是1m，然后再合并起来。
 */
public class CutFile {
	public static void main(String[] args) throws IOException {
		cutFile();
	}		

	//切割mp3
	public static void cutFile() throws IOException{
		File file = new File("F:\\美女\\1.mp3");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024*1024];
		int length = 0 ; 
		int count = 1; 	
		while((length = fileInputStream.read(buf))!=-1){				
			//每读取一次，则生成一个文件
			FileOutputStream fileOutputStream = new FileOutputStream("F:\\music\\part"+count+".mp3");
			//把读取到的数据写出
			fileOutputStream.write(buf,0,length);
			count++;
			//关闭资源
			fileOutputStream.close();
		}
		//关闭资源
		fileInputStream.close();	
	}
}
