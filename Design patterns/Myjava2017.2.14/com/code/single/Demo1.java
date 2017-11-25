package com.code.single;
/*
 单例设计模式：  保证一个在内存中只存在一个对象。
 
 饿汉单例设计模式: 
 
 
 懒汉单例设计模式：（存在一个线程安全问题）
 	1. 私有化构造函数。
 	2. 声明本类的引用类型变量，但是不创建对象。
 	3. 提供 一个公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类的对象，如果已经创建了直接返回即可，如果还没有
 	创建，那么先创建本类的对象，然后再返回。
 */

class Single{
	
	//声明本类的引用类型变量，但是不创建对象。
	private static Single s = null;
	 
	//私有化构造函数
	private Single(){}
	
	public static Single getInstance(){
		if(s==null){
			synchronized ("锁") {
				if(s==null){
					s =  new Single();
				}
			}
		}
		return s;
		
	}
	
}

public class Demo1 {

}
