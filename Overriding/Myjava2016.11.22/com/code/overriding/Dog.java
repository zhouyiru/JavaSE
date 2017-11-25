package com.code.overriding;

public class Dog extends Animal {


	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public void eat(){
		System.out.println("¹·Á¸");
	}
    public void shout(){
	  System.out.println("ÍôÍô");
    }
    public void eat(String food){
    	System.out.println("³Ô£º"+food);
    }
}
