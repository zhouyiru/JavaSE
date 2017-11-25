package com.code.Encoding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class Encoding {
	/*
	��������� :
	ע�⣺ 
		1. ����һ�㶼���ñ��������ʹ��ͬ������������ӿ��Ա�������������⡣
		2. Ӣ����ÿ������ж��Ǽ��õġ� 
		   a   97
	 */
		public static void main(String[] args) throws UnsupportedEncodingException {
			String str = "�й�";
			//����    ���ö��ı�ɿ�������... 
			byte[] buf = str.getBytes();  // gbk
			System.out.println("gbk������ֵ��"+ Arrays.toString(buf));   // [-42, -48, -71, -6]
			
			buf = str.getBytes("utf8"); //ʹ��utf-8�����б���
			System.out.println("utf-8������ֵ��"+ Arrays.toString(buf));   // ��-28, -72, -83,   -27, -101, -67��
			 
			//�������
			String result = new String(buf,"utf-8");  //gbk
			System.out.println("����Ľ����"+result);
					
			/*
			 �������������ݶ����Ի�ԭ���ݳɹ��� 
			 */		
			String str2 = "�й�";
			buf =  str2.getBytes("gbk"); //ʹ����gbk�����б���     [-42, -48, -71, -6]
			str2 = new String(buf,"iso8859-1"); //ʹ������������
			
			//����ʹ�û�ԭ�й���
			//��һ�����ҵ����ĸ��ַ���Ӧ������
			buf = str2.getBytes("iso8859-1");
			str2 = new String(buf,"gbk");
			System.out.println(str2);   // 
				
			//  -2, -1,  ��utf-16�ı�ʶλ��
			String str3 = "��a��";                            /// [-2, -1, 93, -34, 0, 97, 94, 127]
			byte[] buf2 = str3.getBytes("unicode") ;  //ע�⣺�����ʱ�����ʹ����unicode��� ��ôĬ�Ͼͻ�ʹ��utf-16���
			System.out.println("�ֽ����飺"+ Arrays.toString(buf2));
				
		}		
	}













