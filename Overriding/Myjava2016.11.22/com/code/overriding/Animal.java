package com.code.overriding;

public class Animal {

	int x=1;
	String name;
	public void eat(){
		System.out.println("³Ô");
	}
	public void shout(){
		System.out.println("½Ð");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
