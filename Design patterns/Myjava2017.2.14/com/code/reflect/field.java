package com.code.reflect;

import java.lang.reflect.Field;

/*
 ͨ��Class�����ȡһ����ĳ�Ա����------- Field

 */
public class field {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		//��ȡ��������г�Ա����
		/*Field[]	 fields = clazz.getDeclaredFields();
		for(Field field : fields){
			System.out.println(field);
		}
		
*/	
		Person p = new Person("��ʣ",12);
		Field nameField = clazz.getDeclaredField("name");
		nameField.set(p, "����");  // ��һ�������� ���� �ڶ���������Ա������ֵ��
		System.out.println(p);
	}
}
