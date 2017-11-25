package com.code.extend;

public class test7 {
	public static void dosomething(car a){
		if(a instanceof benz){
			benz b=(benz) a;//小变大强制转换
		   b.run1();
		}else if(a instanceof baom){
			baom m=(baom) a;
			m.run2();
		}else if(a instanceof bsj){
			bsj j=(bsj) a;
			j.run3();
		}else 
			System.out.println("over");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car a=new benz();//大变小自动转换
		a.run();
		/*a.run1();//子类特有的方法不可调用*/
	
		System.out.println();
		dosomething(new benz());
		dosomething(new baom());
		dosomething(new bsj());
		
		}
}
