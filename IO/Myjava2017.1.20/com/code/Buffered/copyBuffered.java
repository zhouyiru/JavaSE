package com.code.Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyBuffered {

	public static void main(String[] args) throws IOException {
		String srcPath = "c:\\a.mp3";
		String destPath = "d:\\copy.mp3";
		copyFile(srcPath, destPath);
	}

	public static void copyFile(String srcPath, String destPath)
			throws IOException {
		// ���������������
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(destPath);

		// ʹ�û�����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		// ��ȡ��д����Ϣ
		int len = 0;

		while ((len = bis.read()) != -1) {
			bos.write(len);
		}

		// �ر���
		bis.close();
		bos.close();	
	}

}
