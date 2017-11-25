package com.code.single;

/*
单例设计模式：保证一个类在内存中只有一个对象。

模式：解决一类问题的固定步骤。

模式最早是源于建筑行业， 盖房子的步骤都是固定的：
	
	打地基------>浇柱子 --------> 楼面 --------->砌墙  --------->封顶 ------> 装修 


软件行业23种设计模式：
	1. 单例设计模式
	2. 模板设计模式
	3. 观察者设计模式。
	4. 工厂设计模式
	5. 代理设计模式
	...

	192.168.1.32:8080/test/2.jpg


饿汉单例设计模式的步骤:
	1. 私有化构造函数。
	2. 声明本类的引用类型变量，并且创建本类的对象。
	3. 提供一个公共的方法获取本类的对象。 

懒汉单例设计模式：
	1. 私有化构造函数。
	2. 声明变量的引用类型变量，但是先不要创建 本类的对象。
	3. 提供一个公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类的对象，
		如果没有创建，那么先创建本类的对象，然后再返回。否则直接返回即可。


推荐使用：饿汉单例设计模式。懒汉单例设计模式存在线程安全问题。


*/

//懒汉单例设计模式
class Single2{

	//声明变量的引用类型变量，但是先不要创建 本类的对象。
	private  static Single2 s;

	//私有化构造函数
	private Single2(){}

	//提供一个公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类的对象，如果没有创建，那么先创建本类的对象，然后再返回。否则直接返回即可。
	public static Single2 getInstance(){
		if(s==null){
			synchronized ("锁") {
				if(s==null){
					s =  new Single2();
				}
			}
		}
		return s;
		
	}


//饿汉单例设计模式
static class Single{
	
	//创建本类的对象。
	private static Single s  = new Single();

	//私有化构造函数
	private Single(){}
	


	//提供一个公共的方法获取本类的对象。
	public static  Single getInstance(){
		return s;
	}
}


static class Demo5 
{
	public static void main(String[] args) 
	{
	
		Single2 s1 = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		System.out.println("是同一个对象吗？"+(s1==s2));
	}
}
}

