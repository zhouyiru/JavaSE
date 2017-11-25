package com.code.Encoding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class Encoding {
	/*
	编码与解码 :
	注意： 
		1. 我们一般都会让编码与解码使用同样的码表，这样子可以避免出现乱码问题。
		2. 英文在每个码表中都是兼用的。 
		   a   97
	 */
		public static void main(String[] args) throws UnsupportedEncodingException {
			String str = "中国";
			//编码    看得懂的变成看不懂的... 
			byte[] buf = str.getBytes();  // gbk
			System.out.println("gbk码表编码值："+ Arrays.toString(buf));   // [-42, -48, -71, -6]
			
			buf = str.getBytes("utf8"); //使用utf-8码表进行编码
			System.out.println("utf-8码表编码值："+ Arrays.toString(buf));   // 【-28, -72, -83,   -27, -101, -67】
			 
			//解码过程
			String result = new String(buf,"utf-8");  //gbk
			System.out.println("解码的结果："+result);
					
			/*
			 出现了乱码数据都可以还原数据成功吗？ 
			 */		
			String str2 = "中国";
			buf =  str2.getBytes("gbk"); //使用了gbk码表进行编码     [-42, -48, -71, -6]
			str2 = new String(buf,"iso8859-1"); //使用拉丁码表解码
			
			//需求：使用还原中国。
			//第一步：找到这四个字符对应的数字
			buf = str2.getBytes("iso8859-1");
			str2 = new String(buf,"gbk");
			System.out.println(str2);   // 
				
			//  -2, -1,  是utf-16的标识位。
			String str3 = "州a广";                            /// [-2, -1, 93, -34, 0, 97, 94, 127]
			byte[] buf2 = str3.getBytes("unicode") ;  //注意：编码的时候如果使用了unicode码表， 那么默认就会使用utf-16码表
			System.out.println("字节数组："+ Arrays.toString(buf2));
				
		}		
	}













