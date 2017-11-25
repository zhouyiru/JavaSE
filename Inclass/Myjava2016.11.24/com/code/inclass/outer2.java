package com.code.inclass;

public class outer2 {//局部内部类

	int y=100;
	public void print(){
		final int z=200;//在方法里必须用final关键字
		class inner2{
			public void show(){
			System.out.println("内部类"+y+z);
			}
		}
	inner2 i=new inner2();
	i.show();
	}
}
