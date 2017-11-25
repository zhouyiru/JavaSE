package com.code.IOException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyTest();
	}
	public static void copyTest(){
		FileInputStream fileInputStream=null;//声明
		FileOutputStream fileOutputStream=null;
		try{
			File infile=new File("F:\\JAVA学习资料\\基础班\\day19\\hashSet疑问.png");
			File outfile=new File("E:\\拷贝.png");
			fileInputStream=new FileInputStream(infile);
			fileOutputStream=new FileOutputStream(outfile);
			byte[] buf=new byte[1024];
			int length=0;
			while((length=fileInputStream.read(buf))!=-1){
				fileOutputStream.write(buf,0,length);
			} 
		}catch(IOException e){
			System.out.println("拷贝文件失败");
			throw new RuntimeException(e);
		}finally{
			try{
				if(fileOutputStream!=null){
					fileOutputStream.close();//先开后关（嵌套）		
					System.out.println("关闭文件成功");
				}
			}catch(IOException e){
				System.out.println("关闭文件失败");
				throw new RuntimeException(e);
			}
		}{
			try{
				if(fileInputStream!=null){
					fileInputStream.close();//先开后关（嵌套）
					System.out.println("关闭文件成功");
				}
			}catch(IOException e){
				System.out.println("关闭文件失败");
				throw new RuntimeException(e);
			}
		}
	}

}
