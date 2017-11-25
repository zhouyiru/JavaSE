package com.code.overriding;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rect r=new Rect(4,5);
		r.getArea();
		r.getLen();
		System.out.println("面积："+r.getArea());
		System.out.println("周长："+r.getLen());
	}

}
