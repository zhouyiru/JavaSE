package com.code.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 装饰者设计模式： 增强一个类的功能。
 
  需求1 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有行号。
 
 需求2 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有分号。
 
 需求3 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有双引号。
 
 需求4 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有行号+ 分号。
 
 需求5 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有行号+ 双引号。
 
 需求6 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有分号+双引号。
 
 需求7 ：编写一个类对BufferedReader的功能进行增强， 增强其readLine方法，返回数据带有行号+ 分号+双引号。
 
装饰者设计模式的步骤：
 	1. 在增强类的内部维护一个被增强类的引用。 
 	2. 让增强与被增强类有一个共同父类或者是父接口.
 
装设者设计模式的：
 	好处：利用了多态达到 了类与类之间可以互相的装饰，比较灵活。
 	缺点： 代码结构不清晰，难以理解。
 */
//带行号的缓冲类   增强类
class BufferedLineNum extends BufferedReader{	
	BufferedReader bufferedReader;    // BufferedReader bufferedReader = new BufferedSemi();	
	int count = 1; 	
	public BufferedLineNum(BufferedReader bufferedReader){  // BufferedReader bufferedReader = new BufferedSemi();
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();  // 解决方案：如果这里的readLine方法是BufferedSemi的readline方法那么该问题解决了。
		if(line==null){
			return null;
		}
		line = count+":"+line;
		count++;
		return line;
	}	
}
//带分号的缓冲输入字符流
class BufferedSemi extends BufferedReader {  //为什么要继承BufferedReader ? 继承是为了让该类的对象可以传递给BuffereLineNum的构造方法。
	
	//在内部维护一个需要被增强的类的引用
	BufferedReader bufferedReader ; 
	
	public BufferedSemi(BufferedReader bufferedReader){
		super(bufferedReader); // 该语句是没有任何作用的语句，只不过为了让编译不报错而已。   因为父类没有无参的构造方法。
		this.bufferedReader = bufferedReader;
	}
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return  line;		
	}
}
//带双引号 缓冲类
class BufferedQuto extends BufferedReader{
	//在内部维护一个需要被增强的类的引用
	BufferedReader bufferedReader ; 
	public BufferedQuto(BufferedReader bufferedReader){
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line +"\"";
		return line;
	}
}
public class decorator {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\JAVA学习资料\\基础班\\day20\\代码\\day20\\src\\cn\\itcast\\writer\\CopyJava.java");
		//建立缓冲输入流对象
		FileReader fileReader = new FileReader(file);
		//创建一个缓冲输入字符流对象
		BufferedReader bufferedReader = new BufferedReader(fileReader);		
		//创建一个带行号 的缓冲输入字符流
		BufferedLineNum  bufferedLineNum = new BufferedLineNum(bufferedReader);	
		//带分号
		BufferedSemi bufferedSemi = new BufferedSemi(bufferedLineNum);	
		//创建一个带双引号的缓冲类对象
		@SuppressWarnings("resource")
		BufferedQuto bufferedQuto = new BufferedQuto(bufferedSemi);
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}		
	}
}
