package com.code.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



class BufferedLineNum1 extends BufferedReader{

	int count=1;

	public BufferedLineNum1(Reader in){
		super(in);
	}

	public String readLine() throws IOException {
		String line=super.readLine();
		if (line != null) {
			count++;
			return count + ":" + line;
		} else {
			return null;
		}
	}

	public static class decorator {

		public static void main(String[] args) throws IOException {

			File file=new File("F:\\JAVA学习资料\\基础班\\day20\\代码\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
			FileReader fileReader=new FileReader(file);
			BufferedLineNum1 bufferedLineNum=new BufferedLineNum1(fileReader);
			String line=null;
			while((line=bufferedLineNum.readLine())!=null){
				System.out.println(line);
			}
			bufferedLineNum.close();
		}
	}
}

