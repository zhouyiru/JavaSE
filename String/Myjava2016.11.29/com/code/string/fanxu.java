package com.code.string;

public class fanxu {

	public static String reaverseString( String str ){
		
		   // 1. ���ַ���ת��Ϊ�ַ�����
		   char chs[] = str.toCharArray();
		   // 2. ѭ������
		   for ( int start = 0 , end = chs.length - 1; start < end ; start++,end-- )
		   {
			   // 3. ���ݽ���
			   char temp = chs[end];
			   chs[end] = chs[start];
			   chs[start] = temp;
		   }
		  // 4. ���ַ�����ת��Ϊ�ַ���
	       return new String( chs );
		}
	public static void main(String[] args) {
		String str="abcd";
	   
		
		System.out.println(reaverseString(str));
	}
}
