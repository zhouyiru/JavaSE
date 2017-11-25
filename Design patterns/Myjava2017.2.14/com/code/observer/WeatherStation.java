package com.code.observer;

import java.util.ArrayList;
import java.util.Random;

/*
 观察者设计模式:当一个事物发生了指定的动作的时候，要 通知另外一个事物做出相应的处理。
 
需求：编写一个气象站、气象站要不断的更新天气， 人要根据要根据当前的天气作用相应的处理。


问题1： 天气更新了多次，然后人才做出一次的反应。

问题2：目前气象站只能为一个人服务 ？ 
	集合
	
问题3： 在现实生活中，出了员工要关注天气以外，其他的群体也要关注天气的？？


观察者设计模式的实现步骤：  把要通知对方的行为抽取出来定义在一个接口上，然后再本类中维护该接口的成员。


 */

//气象站
public class WeatherStation {
	
	String[] weathers = {"暴雨","雾霾","冰雹","台风","霜冻","晴天"};
	
	String weather;//当前的天气
	
	Random  random = new Random();
	
	ArrayList<Weather> list = new ArrayList<Weather>(); // 程序的解耦。  程序设计讲究低耦合, 类与类之间不要过分依赖。
	
	
	
	public void addListener(Weather e){ //
		list.add(e);
	}
	
	
	//工作
	public void startWork(){	
		new Thread(){
			@Override
			public void run() {
				while(true){
					updateWeather(); 
					//每 隔1~1.5秒更新一次天气
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
	
	
	
	
	//更新天气的方法
	public void updateWeather(){
		
		int index = random.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("当前的天气："+ weather);
	}
	
}

