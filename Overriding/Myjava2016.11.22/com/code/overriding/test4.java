package com.code.overriding;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.eat("��");
		d.shout();
		
		Cat c=new Cat();
		c.eat();
		c.shout();
		System.out.println(d instanceof Animal);//�ж��Ƿ����ڴ���
	}

}
