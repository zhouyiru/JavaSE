package com.code.overriding;

public class Circle {
    double r;
	public static final double PI=3.14;
	public Circle(double r){
		this.r=r;
	}
	public double getArea(double r){
		return PI*r*r;
	}
	public double getLeagth(double r){
		return 2*PI*r;
	}
	public static void main(String[] args){
		Circle c=new Circle(3);
		//c.getArea(3);
		System.out.println("面积："+c.getArea(3));
		//c.getLeagth(3);
		System.out.println("面积："+c.getLeagth(3));
	}
}
