package com.code.observer;

public class Emp implements Weather{
	
	String name;

	public Emp(String name) {
		super();
		this.name = name;
	}
	
	
	//��Ҫ��������������Ӧ�Ĵ�����
	public void notifyWeather(String weather){
		// "����","����","����","̨��","˪��","����"
		if("����".equals(weather)){
			System.out.println(name+"������ɡ�ϰ࣡��");
		}else if("����".equals(weather)){
			System.out.println(name+"���ŷ�������ϰ࣡��");
		}else if("����".equals(weather)){
			System.out.println(name+"����ͷ���ϰ࣡��");
		}else if("̨��".equals(weather)){
			System.out.println(name+"����һ���ʯͷ�ϰ࣡��");
		}else if("˪��".equals(weather)){
			System.out.println(name+"�����ޱ��ϰ࣡��");
		}else if("����".equals(weather)){
			System.out.println(name+"���������ϰ࣡��");
		}
		
		
	}

}
