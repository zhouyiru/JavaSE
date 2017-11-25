package com.code.printStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
public class printStream {



	/*
	 PrintStream 	打印流: 
	 
	 打印流的好处：
	 	1. 打印流可以打印任意类型的数据。
	 	2. 打印流打印任意类型数据之前，会先把数据转成字符串然后再打印出去。
	 
	 我们使用字节流或者字符流写出int类型数据的时候会比较麻烦，因为我们需要把这些数据线转换成字符串然后我们才能写出去。
	 */
	  	
		public static void main(String[] args) throws IOException {
			/*//找到目标文件
			File file = new File("F:\\a.txt");
			//建立数据的输出通道
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			//写出数据
			fileOutputStream.write("97".getBytes());
			//关闭资源
			fileOutputStream.close();
			
			
			作用１：　可以为我们打印任意类型的数据，而且打印数据之前会先转换成字符串然后再打印。
			//找到目标文件
			File file = new File("F:\\a.txt");
			//建立打印流对象
			PrintStream printStream = new PrintStream(file);
			//打印数据
			printStream.println(97);
			printStream.println(true);
			printStream.println(3.14);
			//关闭资源
			printStream.close();
			
			
			作用2： 收集日志信息
			
			FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\20150519.log"), true);
			PrintStream printStream = new PrintStream(fileOutputStream);
			
			try{
				String str=null;
				System.out.println("字符个数："+ str.length());
				int result  = 4/0; 
			}catch(Exception e){
				
				
				e.printStackTrace(printStream);
			}
			
			标准的输出流默认是指控制台，可以进行修改。
			 */
			PrintStream printStream = new PrintStream(new File("F:\\b.txt"));
			//修改标准的输出流
			System.setOut(printStream);
			System.out.println("hehe");
			
		}
		
		

}
