package com.code.overriding;

public class Dog extends Animal {


	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public void eat(){
		System.out.println("����");
	}
    public void shout(){
	  System.out.println("����");
    }
    public void eat(String food){
    	System.out.println("�ԣ�"+food);
    }
}
