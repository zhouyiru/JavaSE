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
	String reg = "1[35]\\d{9}";//在字符串中，定义正则出现\ 要一对出现。         
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
		String s = str.replaceAll("(.)\\1+","$1");//$ 可以获取到该方法中正则实际参数中的某一个存在的组 $组编号即可。
		System.out.println(str+":"+s);
		String nums = "wser127372tyuiopd6226178909876789fghjk";
		String s1 = nums.replaceAll("\\d+","*");
		System.out.println(nums+":"+s1);
	}
	public static void getDemo()
	{
		String str = "da jia zhu yi le,ming tian bu fang jia,xie xie!";
		//想要获取由3个字母组成的单词。
		//刚才的功能返回的都是一个结果，只有split返回的是数组，但是它是把规则作为分隔符，不会获取符合规则的内容。
		//这时我们要用到一些正则对象。
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
		  
		checkQQ2(); //正则表达式匹配
		checkTel(); 
		splitDemo();//切割空格
		splitDemo2();//重叠词切割
		replaceDemo();//替换
		getDemo();//获取
	}
}
