package com.code.inclass;

public class outer {//成员内部类

	int num=100;
	class inner{
		int b=100;
		public void print(){
			System.out.println("我爱你"+num+b);
		}
	}
	public void run(){
	System.out.println("就是你");
	}

}	

