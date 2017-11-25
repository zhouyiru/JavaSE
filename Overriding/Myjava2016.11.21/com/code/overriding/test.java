package com.code.overriding;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add=new Address("中国","辽宁沈阳","经济开发区11号街");
		Person p=new Person("jack",27,add);
		p.speak();
		
		
		System.out.println();
	}

}
