package com.code.Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\JAVAѧϰ����\\a.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line=null;
		while((line=bufferedReader.readLine())!=null){//String����null,int����-1
			System.out.println(line);
		}
		bufferedReader.close();
	}


}
