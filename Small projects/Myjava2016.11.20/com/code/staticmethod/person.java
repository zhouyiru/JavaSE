package com.code.staticmethod;

public class person {

	String name="����";
	String sex="��";
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
		System.out.println("������"+country+"�Ա�Ϊ"+sex+"������"+age+"���"+name);
	}
	void run(){
			System.out.println("����:" + country);
	}
	
	
}
