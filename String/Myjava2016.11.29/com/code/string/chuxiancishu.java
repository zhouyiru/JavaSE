package com.code.string;

public class chuxiancishu {
	 public static int getCount( String src , String tag ){ 
		  // 0. ��������������ͳ�Ƹ����ı���
		  int index = 0;
		  int count = 0;	   
		  // 1. дѭ���ж�
		  while ( ( index = src.indexOf(tag) ) != -1 )   // jackjava
		  {
			 src = src.substring( index + tag.length() );   // index 4 + 4 = 8
		  //System.out.print( src.length() + " : " + index + " :  " + tag.length() );
				   // 3. �ۼ�
			 count++;
			   }
			   return count;
			}
	 public static void main(String[] args) {
		String src="abbcd";
		String tag="b";
		System.out.print( getCount(src , tag ));
	}
}
