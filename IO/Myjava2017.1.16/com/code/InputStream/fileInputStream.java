package com.code.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read1();
		read2();
		read3();
		read4();
	}
 
	public static void read1() throws IOException{
		File file=new File("F:\\JAVA学习资料\\a.txt");//找到目录文件
		FileInputStream fileInputStream=new FileInputStream(file);//创建数据通路
		int content=fileInputStream.read();//读取文件
		System.out.println("方式一："+(char)content);
		fileInputStream.close();//关闭资源
	}
	public static void read2() throws IOException{
		File file=new File("F:\\JAVA学习资料\\a.txt");//找到目录文件
		FileInputStream fileInputStream=new FileInputStream(file);//创建数据通路
		int content=0;//保存数据,读一个字节
	   while((content=fileInputStream.read())!=-1){//读取文件
		System.out.println("方式二："+(char)content); 
	
	   }
		fileInputStream.close();//关闭文件
	}
	public static void read3() throws IOException{
		File file=new File("F:\\JAVA学习资料\\a.txt");//找到目录文件
		FileInputStream fileInputStream=new FileInputStream(file);//创建数据通路
		byte[] buf=new byte[1024];//读取文件,建立缓冲数组
		int length=fileInputStream.read(buf);
		System.out.println("方式三："+new String(buf,0,length));
	   
		fileInputStream.close();//关闭文件
	}
	public static void read4() throws IOException{//效率最高
		long starttime=System.currentTimeMillis();
		File file=new File("F:\\JAVA学习资料\\a.txt");//找到目录文件
		FileInputStream fileInputStream=new FileInputStream(file);//创建数据通路
		byte[] buf=new byte[1024];//读取文件,建立缓冲数组（1024的倍数效率高）
		int length=0;//记录本次读取自己个数
		while((length=fileInputStream.read(buf))!=-1){
			System.out.println("方式四:"+new String(buf,0,length));
		}
		fileInputStream.close();//关闭文件
		long endtime=System.currentTimeMillis();
	System.out.println("运行时间："+(endtime-starttime));
	
	}
}
