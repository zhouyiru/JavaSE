package com.code.copyFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyiFile {//字符流适合拷贝文件，不适合拷贝图片，音频，视频，word等，因大小变化，损坏文件

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyImage();
	}
public static void copyImage() throws IOException{
	File file1 = new File("F:\\JAVA学习资料\\基础班\\day20\\代码\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
	File file2 = new File("F:\\JAVA学习资料\\基础班\\day20\\代码\\day20\\src\\cn\\itcast\\writer\\拷贝.java");
	FileReader fileReader = new FileReader(file1);
	FileWriter fileWriter = new FileWriter(file2);
	char[] buf = new char[1024];
	int length=0;
	while((length=fileReader.read(buf))!=-1){
		fileWriter.write(buf,0,length);
	}
	fileWriter.close();
	fileReader.close();
}
}
