package com.code.recursive;
import java.io.File;
public class listFiles {
	/*	 
	需求1： 列出一个文件夹中的所有子孙文件与文件夹。 
	 
	需求2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：
			第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。
	 
	需求3 ：列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示：
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar
	需求： 删除一个非空的文件夹， 文件夹中有子孙文件与子孙目录。 
	 */	
		public static void main(String[] args) {
			listFiles3(new File("F:\\0416project\\day22"),"|--");
		}

		//需求3： 
		public static void listFiles3(File dir,String space){
			//找到文件夹中 的所有子文件与子目录
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println(space+file.getName());
				}else if(file.isDirectory()){
					System.out.println(space+ file.getName());
					listFiles3(file,"|   "+space); 
				}
				
			}
		}
		// 需求2
		public static void listFiles2(File dir,String space){
			//找到文件夹中 的所有子文件与子目录
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println(space+file.getName());
				}else if(file.isDirectory()){
					System.out.println(space+ file.getName());
					listFiles2(file,space+"   "); 
				}
			}
		}
		// 需求1： 列出一个文件夹中的所有子孙文件与文件夹
		public static void listFiles1(File dir){
			//找到文件夹中 的所有子文件与子目录
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println("文件："+file.getName());
				}else if(file.isDirectory()){
					System.out.println("文件夹："+ file.getName());
					listFiles1(file);
				}
				
			}
		}
		
		/*需求： 删除一个非空的文件夹， 文件夹中有子孙文件与子孙目录。    练习： 剪切一个非空的文件夹。   */
			public static void deleteDir(File dir){ //dir= f:\\aa\\bb
				//找到所有的子文件与子目录
				File[] files = dir.listFiles();
				for(File file : files){
					if(file.isFile()){
						file.delete();
					}else if(file.isDirectory()){
						deleteDir(file);
					}
				}
				dir.delete();
			}

		}
