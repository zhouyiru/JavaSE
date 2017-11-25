package com.code.stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mydate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");//大写HH为24进制
		String text=dateformat.format(new Date());
		System.out.print(text);
		
		String m="2016年11月30日  15:01:06";
		Date date=dateformat.parse(m);
		System.out.print(date);
	}
}
