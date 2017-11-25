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
		hashcode a=new hashcode(111,"����");
		hashcode b=new hashcode(111,"è��");
		System.out.println("�Ƚ�"+a.equals(b));
		System.out.println("��ϣ��"+a.hashCode());
		System.out.println("��ϣ��"+b.hashCode());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���֤"+this.id+"����"+this.name;
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
