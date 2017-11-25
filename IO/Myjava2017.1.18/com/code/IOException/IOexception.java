package com.code.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest();

	}
	public static void readTest(){
		FileInputStream fileInputStream=null;
		try{
			File file=new File("F:\\JAVA学习资料\\a.txt");//找到目录文件
			fileInputStream=new FileInputStream(file);//创建数据通路
			byte[] buf=new byte[1024];//读取文件,建立缓冲数组（1024的倍数效率高）
			int length=0;//记录本次读取自己个数
			while((length=fileInputStream.read(buf))!=-1){
				System.out.println("方式四:"+new String(buf,0,length));
			}
		}catch(IOException e){
			System.out.println("读取文件出错");
			throw new RuntimeException(e);//糖衣炮弹(包装起来)
		}finally{
			try{
				if(fileInputStream!=null){
					fileInputStream.close();//关闭文件
					System.out.println("关闭资源成功");
				}
			}catch(IOException e){
				System.out.println("关闭资源失败");
				throw new RuntimeException(e);
			}
		}
	}
}
