package com.code.reflect;

public class Person {

	String name;
	
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	public Person() {
	}
	
	public void eat(int num,String[] arr){
		System.out.println(name+"��"+num+"���׷�");
	}
	
	public static void sleep(int hours){
		System.out.println("˯"+hours+"Сʱ");
	}
	
	@SuppressWarnings("unused")
	private void study(){
		System.out.println(name+"��ҹѧϰ...");
	}
	
	@Override
	public String toString() {
		return "������"+ this.name+" ���䣺"+this.age;
	}
	
}
