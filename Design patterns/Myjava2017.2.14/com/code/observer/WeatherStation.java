package com.code.observer;

import java.util.ArrayList;
import java.util.Random;

/*
 �۲������ģʽ:��һ�����﷢����ָ���Ķ�����ʱ��Ҫ ֪ͨ����һ������������Ӧ�Ĵ���
 
���󣺱�дһ������վ������վҪ���ϵĸ��������� ��Ҫ����Ҫ���ݵ�ǰ������������Ӧ�Ĵ���


����1�� ���������˶�Σ�Ȼ���˲�����һ�εķ�Ӧ��

����2��Ŀǰ����վֻ��Ϊһ���˷��� �� 
	����
	
����3�� ����ʵ�����У�����Ա��Ҫ��ע�������⣬������Ⱥ��ҲҪ��ע�����ģ���


�۲������ģʽ��ʵ�ֲ��裺  ��Ҫ֪ͨ�Է�����Ϊ��ȡ����������һ���ӿ��ϣ�Ȼ���ٱ�����ά���ýӿڵĳ�Ա��


 */

//����վ
public class WeatherStation {
	
	String[] weathers = {"����","����","����","̨��","˪��","����"};
	
	String weather;//��ǰ������
	
	Random  random = new Random();
	
	ArrayList<Weather> list = new ArrayList<Weather>(); // ����Ľ��  ������ƽ��������, ������֮�䲻Ҫ����������
	
	
	
	public void addListener(Weather e){ //
		list.add(e);
	}
	
	
	//����
	public void startWork(){	
		new Thread(){
			@Override
			public void run() {
				while(true){
					updateWeather(); 
					//ÿ ��1~1.5�����һ������
					for(Weather e:list){
						e.notifyWeather(weather);
					}
					
					int millis = random.nextInt(501)+1000;
					try {
						Thread.sleep(millis);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	
	}
	
	
	
	
	//���������ķ���
	public void updateWeather(){
		
		int index = random.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("��ǰ��������"+ weather);
	}
	
}

