package com.code.reflect;

/*
������ô��������һЩ�Ƚ�ͨ�õĹ�����Ŀ�����ʱ�򣬾ͷǳ������ˡ�

 ���䣺 ��һ��class�ļ������ص��ڴ��е�ʱ����ôjvm�ͻ����϶Ը�class�ļ��ĳ�Ա���н��ʣ�Ȼ��class�ļ��ĳ�Ա���ݷ�װ��һ��Class������
 ������������Ի�ȡ��Class������ô���ǾͿ���ͨ����Class������������������г�Ա��
 
ע�⣺�ڷ��似����һ������κγ�Ա��ʹ����һ������������
 
Class����Ļ�ȡ��ʽ�� 
 
 �Ƽ�ʹ�ã� ��һ�֡�ͨ��Class.forName��ȡClass����.
 
 */
public class forname {
	
	Person p ; 
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		//��ʽ1��ͨ��Class.forName��ȡClass����.
		
		Class clazz1 = 	Class.forName("cn.itcast.reflect.Person");
//		System.out.println("clazz1:"+clazz1.getSimpleName());
		
		//��ʽ2������ͨ��������ȡClass����
		Class clazz2 = Person.class;
		System.out.println("��ͬһ��������"+(clazz1==clazz2));
		
		//��ʽ3�� ����ͨ�������ȡClass����
	/*	Class clazz3 = new Person().getClass();
		System.out.println("��ͬһ��������"+ (clazz2 == clazz3));
		*/
	}

}

