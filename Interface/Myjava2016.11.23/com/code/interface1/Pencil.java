package com.code.interface1;

public class Pencil implements Eraser {

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Í¿¸Ä...");
	}

	String name;
	Pencil() {
	}
	Pencil(String name) {
		this.name = name;
	}
	void write() {
		System.out.println("Ð´×Ö");
	}
}
