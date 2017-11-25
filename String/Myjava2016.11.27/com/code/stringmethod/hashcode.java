package com.code.stringmethod;

public class hashcode {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public hashcode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		hashcode a=new hashcode(111,"¹·ÍÞ");
		hashcode b=new hashcode(111,"Ã¨ÍÞ");
		System.out.println("±È½Ï"+a.equals(b));
		System.out.println("¹þÏ£Âð£º"+a.hashCode());
		System.out.println("¹þÏ£Âð£º"+b.hashCode());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Éí·ÝÖ¤"+this.id+"Ãû×Ö"+this.name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		hashcode user=(hashcode) obj;
		return this.id==user.id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
