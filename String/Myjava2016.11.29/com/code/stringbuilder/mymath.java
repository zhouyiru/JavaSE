package com.code.stringbuilder;

import java.util.Random;

public class mymath {

	public static void main(String[] args) {
		System.out.println(Math.abs(-3));//����ֵ
		System.out.println(Math.ceil(3.14));//����ȡ��
		System.out.println(Math.round(3.64));//��������
		System.out.println(Math.floor(3.14));//����ȡ��
		System.out.println(Math.random());//0��n��1�����
		
		Random r=new Random();
		System.out.print(r.nextInt(5));//0-4�������
	}
}
