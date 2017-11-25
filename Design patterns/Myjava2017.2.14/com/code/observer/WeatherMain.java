package com.code.observer;

import java.util.Random;

@SuppressWarnings("unused")
public class WeatherMain {

	public static void main(String[] args) throws Exception {
		Emp e = new Emp("狗娃");
		Emp e2 = new Emp("如花");
		
		
		Student s = new Student("小明");
		
		WeatherStation station = new WeatherStation();
		station.addListener(e2);
		station.addListener(e);
		station.addListener(s);
		
		station.startWork();
		
	
		
	}
	
}
