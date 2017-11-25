package com.code.observer;

//如果要订阅天气的群体必须也要实现Weather接口。
public interface Weather {

	public void notifyWeather(String weather);
	
}
