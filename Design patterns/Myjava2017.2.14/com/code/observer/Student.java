package com.code.observer;


public class Student implements Weather {

	String name;

	public Student(String name) {
		this.name = name;
	}
	
	
	public void notifyWeather(String weather){
		if("����".equals(weather)){
			System.out.println(name+"��������Ϣ����");
		}else if("����".equals(weather)){
			System.out.println(name+"���鲻�ã���Ϣ����");
		}else if("����".equals(weather)){
			System.out.println(name+"��������Ϣ����");
		}else if("̨��".equals(weather)){
			System.out.println(name+"��������Ϣ����");
		}else if("˪��".equals(weather)){
			System.out.println(name+"���ޱ���Ϣ����");
		}else if("����".equals(weather)){
			System.out.println(name+"ȥ������Ϣ����");
		}
	}

}
