package com.code.stringbuilder;

import java.util.Random;

public class yanzhengma {

	public static void main(String[] args) {
		Random r=new Random();
		char c[]=new char[]{'a','b','жа','Йњ','@','c'};
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<4;i++){
			sb.append(c[r.nextInt(c.length)]);
		}
		System.out.print(sb.toString());
	}
}
