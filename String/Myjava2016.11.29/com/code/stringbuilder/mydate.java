package com.code.stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mydate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");//��дHHΪ24����
		String text=dateformat.format(new Date());
		System.out.print(text);
		
		String m="2016��11��30��  15:01:06";
		Date date=dateformat.parse(m);
		System.out.print(date);
	}
}
