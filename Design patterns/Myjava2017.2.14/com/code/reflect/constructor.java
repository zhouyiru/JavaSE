package com.code.reflect;


import java.lang.reflect.Constructor;

/*
ͨ��Class�����ȡ���췽��

Constructor ���������ڱ���һ�����췽���ġ�

 */
@SuppressWarnings("unused")
public class constructor {

	

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clazz = 	Class.forName("cn.itcast.reflect.Person");
		//ͨ��class�����ҵ����еĹ��췽����
		
		/*
		Constructor[] constructors = clazz1.getConstructors();  //ֻ��ȡ�˹����Ĺ��췽����
		Constructor[] constructors  =	clazz1.getDeclaredConstructors();  //��ȡһ���� �����й��췽�����������еġ�
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		
		//��ȡ�������췽��
	
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		//ͨ��Constructor���󴴽�����
		Person  p = (Person) constructor.newInstance("����",12);
		System.out.println(p);
		
		// ��ȡ˽�еĹ��캯��
		*/
		/*Constructor constructor = clazz.getDeclaredConstructor(null);
		//���ù��췽���ķ���Ȩ�ޣ��������䣩
		constructor.setAccessible(true);
		Person p = (Person)	constructor.newInstance(null);
		System.out.println(p);*/
		
		
	}
	
}

