package com.code.overriding;

public class Person {

	public String name;
	public int age;
	Address add;
	
	Person(){
		
	}
	Person(String name,int age,Address add){
		
		this.name=name;
		this.age=age;
		this.add=add;
		
	}
	
	void speak(){
		System.out.println("������"+name+" ���䣺"+age+" "+add.print());
	}
}

