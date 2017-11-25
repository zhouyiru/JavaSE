package com.code.template;

/*
模板设计模式 : 我们在解决某类问题的时候，有些步骤是固定的，
		        有些步骤是不固定的，这时候我们则可以使用模板设计模式

需求： 编写一个计算代码运行时间的模板。

模板设计模式的步骤：
	1. 先写出解决该类问题其中的一件解决方案。
	2. 分析代码，把会发生变化的代码抽取出来独立成一个方法,然后再把该方法描述成一个抽象的方法。
	3. 如果需要使用模板类，只需要继承即可使用。
	
*/
abstract class Runtime{
	
	public final void getRunTime(){
		long startTime = System.currentTimeMillis();	//代码运行之前记录当前的系统时间
		code();
		long endTime  = System.currentTimeMillis();  //代码运行后的时间
		System.out.println("程序的运行时间："+ (endTime-startTime));
	}
	
	public abstract  void  code();
}


public class Demo1 extends Runtime {

	public static void main(String[] args) {
		Demo1 d= new Demo1();
		d.getRunTime();
	}

	
	
	@Override
	public void code() {
		int i = 0 ; 
		while(i<100){
			System.out.println("i="+ i);
			i++;
		}
	}
	
	

}
