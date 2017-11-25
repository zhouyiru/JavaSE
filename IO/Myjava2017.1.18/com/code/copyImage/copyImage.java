package com.code.copyImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyImage {//字节流适合拷贝图片，音频，视频，word等，不适合拷贝文件。因为不可读写汉字

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File infile=new File("F:\\JAVA学习资料\\基础班\\day19\\hashSet疑问.png");
		File outfile=new File("E:\\拷贝.png");
		FileInputStream fileInputStream=new FileInputStream(infile);
		FileOutputStream fileOutputStream=new FileOutputStream(outfile);
		byte[] buf=new byte[1024];
		int length=0;
		while((length=fileInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		} 
	
		fileOutputStream.close();//先开后关（嵌套）
		fileInputStream.close();
	}

}
