package com.code.debug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 debug���ԣ� �����ó������е��ϵ��ʱ��ֹͣ���У�Ȼ��鿴��ǰ���������Ƕ�������ݡ� �������Ƿ������� 
 
 step over(F6)  ������������䣬������һ�����
 step  into(f5) ���뵽ָ���ķ����ڲ��鿴.
 step return :   ������ǰ������
 
 */

public class Demo1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("����", "С��");
		map.put("����", "С��");
		map.put("����", "С��");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String  key =  it.next();
			System.out.println("����"+key+" ֵ��"+ map.get(key));
		}
	
	
	}
	
}
