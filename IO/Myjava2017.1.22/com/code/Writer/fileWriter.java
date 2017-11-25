package com.code.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteTest();
	}

	public static void WriteTest() throws IOException{
		File file=new File("F:\\JAVA学习资料\\a.txt");
		FileWriter fileWriter = new FileWriter(file,true);//true表示追加数据（默认清空文本再写入）
		String data="爱你";
		fileWriter.write(data);
		fileWriter.close();//内部维护的字符数组，必须调用flush()或者close()方法，或者数组满
	}
}
