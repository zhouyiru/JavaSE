package com.code.printStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
public class printStream {



	/*
	 PrintStream 	��ӡ��: 
	 
	 ��ӡ���ĺô���
	 	1. ��ӡ�����Դ�ӡ�������͵����ݡ�
	 	2. ��ӡ����ӡ������������֮ǰ�����Ȱ�����ת���ַ���Ȼ���ٴ�ӡ��ȥ��
	 
	 ����ʹ���ֽ��������ַ���д��int�������ݵ�ʱ���Ƚ��鷳����Ϊ������Ҫ����Щ������ת�����ַ���Ȼ�����ǲ���д��ȥ��
	 */
	  	
		public static void main(String[] args) throws IOException {
			/*//�ҵ�Ŀ���ļ�
			File file = new File("F:\\a.txt");
			//�������ݵ����ͨ��
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			//д������
			fileOutputStream.write("97".getBytes());
			//�ر���Դ
			fileOutputStream.close();
			
			
			���ã���������Ϊ���Ǵ�ӡ�������͵����ݣ����Ҵ�ӡ����֮ǰ����ת�����ַ���Ȼ���ٴ�ӡ��
			//�ҵ�Ŀ���ļ�
			File file = new File("F:\\a.txt");
			//������ӡ������
			PrintStream printStream = new PrintStream(file);
			//��ӡ����
			printStream.println(97);
			printStream.println(true);
			printStream.println(3.14);
			//�ر���Դ
			printStream.close();
			
			
			����2�� �ռ���־��Ϣ
			
			FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\20150519.log"), true);
			PrintStream printStream = new PrintStream(fileOutputStream);
			
			try{
				String str=null;
				System.out.println("�ַ�������"+ str.length());
				int result  = 4/0; 
			}catch(Exception e){
				
				
				e.printStackTrace(printStream);
			}
			
			��׼�������Ĭ����ָ����̨�����Խ����޸ġ�
			 */
			PrintStream printStream = new PrintStream(new File("F:\\b.txt"));
			//�޸ı�׼�������
			System.setOut(printStream);
			System.out.println("hehe");
			
		}
		
		

}
