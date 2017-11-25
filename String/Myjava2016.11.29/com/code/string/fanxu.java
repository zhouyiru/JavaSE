package com.code.string;

public class fanxu {

	public static String reaverseString( String str ){
		
		   // 1. 将字符串转换为字符数组
		   char chs[] = str.toCharArray();
		   // 2. 循环交换
		   for ( int start = 0 , end = chs.length - 1; start < end ; start++,end-- )
		   {
			   // 3. 数据交换
			   char temp = chs[end];
			   chs[end] = chs[start];
			   chs[start] = temp;
		   }
		  // 4. 将字符数组转换为字符串
	       return new String( chs );
		}
	public static void main(String[] args) {
		String str="abcd";
	   
		
		System.out.println(reaverseString(str));
	}
}
