package com.code.EL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class checkQQel {
	public static void checkQQ2()         
	{                                     
		String qq = "12345";
	String reg = "[1-9][0-9]{4,14}";  
	boolean b = qq.matches(reg);      
	System.out.println(qq+"="+b);                                 
	} 
	
	public static void checkTel()                                                   
	{                                                                               
	String tel = "25800001111";                                                 
	String reg = "1[35]\\d{9}";//���ַ����У������������\ Ҫһ�Գ��֡�         
	boolean b= tel.matches(reg);                                                
	System.out.println(tel+":"+b);                                              
	}            
	public static void splitDemo()                              
	{                                                           
		String str = "aa.bb.cc";                                
		str = "-1     99    4    23";                           
		String[] arr = str.split(" +");                         
		for(String s : arr)                                     
		{                                                       
			System.out.println(s);                              
		}                                                       
	}                                       
	public static void splitDemo2()        
	{                                      
	String str = "sdqqfgkkkhjppppkl";
	String[] arr = str.split("(.)\\1+");
	for(String s : arr)                
	{                                  
	System.out.println(s);         
	}                                                                  
	} 
	public static void replaceDemo()
	{
		String str = "sdaaafghcccjkqqqqqql";
		String s = str.replaceAll("(.)\\1+","$1");//$ ���Ի�ȡ���÷���������ʵ�ʲ����е�ĳһ�����ڵ��� $���ż��ɡ�
		System.out.println(str+":"+s);
		String nums = "wser127372tyuiopd6226178909876789fghjk";
		String s1 = nums.replaceAll("\\d+","*");
		System.out.println(nums+":"+s1);
	}
	public static void getDemo()
	{
		String str = "da jia zhu yi le,ming tian bu fang jia,xie xie!";
		//��Ҫ��ȡ��3����ĸ��ɵĵ��ʡ�
		//�ղŵĹ��ܷ��صĶ���һ�������ֻ��split���ص������飬�������ǰѹ�����Ϊ�ָ����������ȡ���Ϲ�������ݡ�
		//��ʱ����Ҫ�õ�һЩ�������
		String reg = "\\b[a-z]{3}\\b";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.end());
			System.out.println("sub:"+str.substring(m.start(),m.end()));
			System.out.println(m.group());
		}
	}
	public static void main(String[] args) {
		  
		checkQQ2(); //������ʽƥ��
		checkTel(); 
		splitDemo();//�и�ո�
		splitDemo2();//�ص����и�
		replaceDemo();//�滻
		getDemo();//��ȡ
	}
}
