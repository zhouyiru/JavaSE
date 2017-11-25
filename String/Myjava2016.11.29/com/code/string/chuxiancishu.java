package com.code.string;

public class chuxiancishu {
	 public static int getCount( String src , String tag ){ 
		  // 0. 定义索引变量和统计个数的变量
		  int index = 0;
		  int count = 0;	   
		  // 1. 写循环判断
		  while ( ( index = src.indexOf(tag) ) != -1 )   // jackjava
		  {
			 src = src.substring( index + tag.length() );   // index 4 + 4 = 8
		  //System.out.print( src.length() + " : " + index + " :  " + tag.length() );
				   // 3. 累加
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
