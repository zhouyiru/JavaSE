package com.code.fileeg;
import java.io.File;

public class listfile {
	public static void main(String[] args) {
    File dir=new File("F:\\JAVA学习资料\\基础班\\day19\\代码\\day17\\src\\cn\\itcast\\map");
    listjava(dir);
    list(dir);		
	}
	public static void listjava(File dir){//列出所有java文件
		File[] files=dir.listFiles();
		for(File file:files){
			String fileName=file.getName();
			/*if(fileName.matches(".+\\.java")){//正则表达式匹配
				System.out.println(fileName);
			}*/
			if(fileName.endsWith(".java")){
				System.out.println(fileName);
			}
		}
	}
	public static void list(File dir){
		File[] files=dir.listFiles();
		System.out.println("子文件：");
		for(File file:files){
			if(file.isFile()){
				System.out.println("\t"+file.getName());//\t为制表符，8位
			}
		}
		System.out.println("子目录：");
		for(File file:files){
			if(file.isDirectory()){
				System.out.println("\t"+file.getName());
			}
		}
	}
}