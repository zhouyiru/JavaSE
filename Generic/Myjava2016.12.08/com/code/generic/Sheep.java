package com.code.generic;

public class Sheep {
	String name;

	public Sheep() {

	}

	public Sheep(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sheep@name:" + this.name;
	}

	public void eat() {
		System.out.println(this.name + "³ÔÇà²Ý");
	}
}
