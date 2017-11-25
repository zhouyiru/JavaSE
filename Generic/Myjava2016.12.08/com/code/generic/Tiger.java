package com.code.generic;

public class Tiger {

	String name;

	public Tiger() {

	}

	public Tiger(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Tiger@name:" + this.name;
	}

	public void eat() {
		System.out.println(this.name + "³ÔÑò");
	}
}