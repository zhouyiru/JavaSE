package com.code.factory;
/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

 工厂设计模式： 工厂设计模式就是专门用于产生对象的方法。
 
 需求： 定义一个工厂方法可以产生任何类型的对象，产生的对象是根据配置文件而定。
 
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.code.reflect.Person;


public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		Person p =	(Person) newInstance();
		System.out.println("人对象："+ p);
	}
	
	
	public static Object newInstance() throws Exception{
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("obj.txt"));
		//读取到完整的类名
		String className = bufferedReader.readLine();
		//根据类名获取Class对象
		Class clazz = Class.forName(className);
		//获取无参的构造函数
		
		Constructor constructor = clazz.getConstructor(null);
		//创建对象。
		Object  o = constructor.newInstance(null);
		
		

		//读取配置文件，然后对象的属性数据 封装到对象中。
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			String[] datas = line.split("=");
			Field field = clazz.getDeclaredField(datas[0]);
			field.setAccessible(true);
			if(field.getType()==int.class){
				field.set(o, Integer.parseInt(datas[1]));
			}else{
				field.set(o, datas[1]);
			}
			
		}
		return o;
		
	}
	
}*/

