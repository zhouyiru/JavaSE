package com.code.stringmethod;

public class tostring {


		int age;
		String name;
		public tostring(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return this.name+"-"+this.age;
		}
		public static void main(String[] args) {
			tostring p=new tostring(21,"уехЩ");
			p.toString();
		System.out.println(p.toString());
		}
	}
	


