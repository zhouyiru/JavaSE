package com.code.factory;
/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

 �������ģʽ�� �������ģʽ����ר�����ڲ�������ķ�����
 
 ���� ����һ�������������Բ����κ����͵Ķ��󣬲����Ķ����Ǹ��������ļ�������
 
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.code.reflect.Person;


public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		Person p =	(Person) newInstance();
		System.out.println("�˶���"+ p);
	}
	
	
	public static Object newInstance() throws Exception{
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("obj.txt"));
		//��ȡ������������
		String className = bufferedReader.readLine();
		//����������ȡClass����
		Class clazz = Class.forName(className);
		//��ȡ�޲εĹ��캯��
		
		Constructor constructor = clazz.getConstructor(null);
		//��������
		Object  o = constructor.newInstance(null);
		
		

		//��ȡ�����ļ���Ȼ�������������� ��װ�������С�
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

