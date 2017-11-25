package com.code.test;


class Demo6 
{
	public static void main(String[] args) 
	{

	//整数
		//需求：定义一个变量用于存储正常人的年龄。
		byte age = 29; // 左边： 声明了一个名称为age的byte类型数据，右边：把29赋值给age变量
		System.out.println(age);
		
		//需求： 定义一个变量存储辅导员钱。 
		short money = 3000;
		System.out.println(money);

		//需求： 定义一个变量用于存储校长的钱。
		int bossMoney = 100000000;
		System.out.println(bossMoney);

		//需求： 存储周永康的钱。
		long allMoney = 10000000000000000L;
		System.out.println(allMoney);
		allMoney = 10;  //对变量进行重新赋值
		System.out.println(allMoney);
	
	
	    float pi = 3.14f;
		double height = 175.78;
		System.out.println(pi);
		System.out.println(height);
	

	
	boolean b = false;
	System.out.println(b);
	char c = 'a';

	System.out.println(c);
	}
}
