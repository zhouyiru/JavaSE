package com.code.observer;

public class Emp implements Weather{
	
	String name;

	public Emp(String name) {
		super();
		this.name = name;
	}
	
	
	//人要根据天气做出相应的处理方案
	public void notifyWeather(String weather){
		// "暴雨","雾霾","冰雹","台风","霜冻","晴天"
		if("暴雨".equals(weather)){
			System.out.println(name+"带着雨伞上班！！");
		}else if("雾霾".equals(weather)){
			System.out.println(name+"带着防毒面具上班！！");
		}else if("冰雹".equals(weather)){
			System.out.println(name+"带着头盔上班！！");
		}else if("台风".equals(weather)){
			System.out.println(name+"拖着一块大石头上班！！");
		}else if("霜冻".equals(weather)){
			System.out.println(name+"带着棉被上班！！");
		}else if("晴天".equals(weather)){
			System.out.println(name+"开开心心上班！！");
		}
		
		
	}

}
