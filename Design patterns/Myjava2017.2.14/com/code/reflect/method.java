package com.code.reflect;

import java.lang.reflect.Method;

/*
 ͨ��Class�����ȡ��Ա������ ------�� Method��
 
 */
@SuppressWarnings("unused")
public class method {


	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		
		//��ȡ���еķ���
/*		Method[] methods =  clazz.getMethods();  // ��ȡ���й��� �ķ����������̳������ķ�����
		Method[] methods = clazz.getDeclaredMethods(); //��ȡ���еķ���������˽�еģ����ǲ������̳������ķ����� 
		for(Method m : methods){
			System.out.println(m);
		}
*/	
		Person p =  new Person("����",12);
		//��ȡ��������
		/*Method m = clazz.getMethod("eat", int.class,String[].class) ; //��һ�������Ƿ������� �ڶ��������β��б���������͡�
		//ִ��һ������
		Person p =  new Person("����",12);
		m.invoke(p, 3,new String[]{"aa","bb"}); //��һ�������������ĵ����߶��� �ڶ������� ����ִ������Ҫ�Ĳ�����
		
		
		Method m = clazz.getMethod("sleep", int.class);
		m.invoke(null, 23);
		
		//˽�еķ���
		*/
		
		/*Method m  = clazz.getDeclaredMethod("study", null);
		//���÷����ķ���Ȩ���ǿ��Է���
		m.setAccessible(true);
		m.invoke(p, null);*/
	}

}

