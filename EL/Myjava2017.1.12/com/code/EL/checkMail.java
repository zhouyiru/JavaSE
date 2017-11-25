package com.code.EL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkMail {
public static void main(String[] args) {
	
	String mail = "abc123@sina.com.cn";
	String reg="[a-zA-Z1-9]\\w{1,11}@[a-zA-Z0-9]{2,}(\\.[a-z]{2,3}){1,2}";
	Pattern p=Pattern.compile(reg);
	Matcher m=p.matcher(mail);//正则对象匹配字符串
	while(m.find()){
		System.out.println(m.group());
	}
  }
}