package com.code.fileeg;
import java.io.File;

public class listfile {
	public static void main(String[] args) {
    File dir=new File("F:\\JAVAѧϰ����\\������\\day19\\����\\day17\\src\\cn\\itcast\\map");
    listjava(dir);
    list(dir);		
	}
	public static void listjava(File dir){//�г�����java�ļ�
		File[] files=dir.listFiles();
		for(File file:files){
			String fileName=file.getName();
			/*if(fileName.matches(".+\\.java")){//������ʽƥ��
				System.out.println(fileName);
			}*/
			if(fileName.endsWith(".java")){
				System.out.println(fileName);
			}
		}
	}
	public static void list(File dir){
		File[] files=dir.listFiles();
		System.out.println("���ļ���");
		for(File file:files){
			if(file.isFile()){
				System.out.println("\t"+file.getName());//\tΪ�Ʊ����8λ
			}
		}
		System.out.println("��Ŀ¼��");
		for(File file:files){
			if(file.isDirectory()){
				System.out.println("\t"+file.getName());
			}
		}
	}
}