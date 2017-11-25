package com.code.overriding;

public class Cat extends Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}


	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}


	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}


	public void eat(){
		System.out.println("Γ¨ΑΈ");
	}
	public void shout(){
		System.out.println("ίχίχ");
	}
}
