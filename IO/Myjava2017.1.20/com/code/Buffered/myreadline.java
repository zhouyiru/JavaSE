package com.code.Buffered;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class myreadline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\JAVAѧϰ����\\������\\day20\\����\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
		FileReader fileReader=new FileReader(file);
		String line = null; 
		while((line=readLine(fileReader))!=null){
			System.out.println(line);
		}
	}
	public static String readLine(FileReader fileReader) throws IOException{
		StringBuilder sb=new StringBuilder();
		int content=0;
		while((content=fileReader.read())!=-1){
			if(content=='\r'){
				continue;
			}else if(content=='\n'){
				return sb.toString();
			}else{
				sb.append((char)content);
			}
		}
		return null;
	}
}
