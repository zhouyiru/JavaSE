package com.code.copyImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyImage {//�ֽ����ʺϿ���ͼƬ����Ƶ����Ƶ��word�ȣ����ʺϿ����ļ�����Ϊ���ɶ�д����

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File infile=new File("F:\\JAVAѧϰ����\\������\\day19\\hashSet����.png");
		File outfile=new File("E:\\����.png");
		FileInputStream fileInputStream=new FileInputStream(infile);
		FileOutputStream fileOutputStream=new FileOutputStream(outfile);
		byte[] buf=new byte[1024];
		int length=0;
		while((length=fileInputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		} 
	
		fileOutputStream.close();//�ȿ���أ�Ƕ�ף�
		fileInputStream.close();
	}

}
