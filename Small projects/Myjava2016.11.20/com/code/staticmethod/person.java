package com.code.staticmethod;

public class person {

	String name="张三";
	String sex="男";
	int age=21;
	static String country="CK";
	 person(){
		
	}
	void persion(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	void speak(){
		System.out.println("国籍是"+country+"性别为"+sex+"的年龄"+age+"岁的"+name);
	}
	void run(){
			System.out.println("国籍:" + country);
	}
	
	
}
