package com.code.stringmethod;

public class equals1 {

	String name;
	String password;
	private int id;
	
	public equals1(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public static void main(String[] args) {
		equals1 a=new equals1("����","123");
		equals1 b=new equals1("����","123");
		System.out.println("�Ƚ�"+a.equals(b));
		System.out.println("a:"+a.hashCode());
		System.out.println("b:"+a.hashCode());
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		equals1 user=(equals1) obj;
		return this.name.equals(user.name)&&this.password.equals(user.password);
	}
	
	public String toString(){
		return "�û�����"+this.name +"���룺"+this.password;
	}
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
