package com.code.recursive;
import java.io.File;
public class listFiles {
	/*	 
	����1�� �г�һ���ļ����е����������ļ����ļ��С� 
	 
	����2���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ������ǰ��Ҫ����Ӧ�����Ŀո�
			��һ��ǰ����0�����ڶ���ǰ����1����������ǰ����2��...���Դ����ơ�
	 
	����3 ���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ��Ҫ����״�ṹ��Ч��������ʾ��
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
	���� ɾ��һ���ǿյ��ļ��У� �ļ������������ļ�������Ŀ¼�� 
	 */	
		public static void main(String[] args) {
			listFiles3(new File("F:\\0416project\\day22"),"|--");
		}

		//����3�� 
		public static void listFiles3(File dir,String space){
			//�ҵ��ļ����� ���������ļ�����Ŀ¼
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
		// ����2
		public static void listFiles2(File dir,String space){
			//�ҵ��ļ����� ���������ļ�����Ŀ¼
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
		// ����1�� �г�һ���ļ����е����������ļ����ļ���
		public static void listFiles1(File dir){
			//�ҵ��ļ����� ���������ļ�����Ŀ¼
			File[] files = dir.listFiles();
			for(File file : files){
				if(file.isFile()){
					System.out.println("�ļ���"+file.getName());
				}else if(file.isDirectory()){
					System.out.println("�ļ��У�"+ file.getName());
					listFiles1(file);
				}
				
			}
		}
		
		/*���� ɾ��һ���ǿյ��ļ��У� �ļ������������ļ�������Ŀ¼��    ��ϰ�� ����һ���ǿյ��ļ��С�   */
			public static void deleteDir(File dir){ //dir= f:\\aa\\bb
				//�ҵ����е����ļ�����Ŀ¼
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
