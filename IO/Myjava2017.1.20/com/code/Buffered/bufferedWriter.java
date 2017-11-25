package com.code.Buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file = new File("F:\\JAVA学习资料\\a.txt");
    FileWriter fileWriter = new FileWriter(file,true);
    BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
    bufferWriter.newLine();//   bufferWriter.write("\r\n");
    bufferWriter.write("你好啊!");
    bufferWriter.close();
	}

}
