package com.code.observer;


public class Student implements Weather {

	String name;

	public Student(String name) {
		this.name = name;
	}
	
	
	public void notifyWeather(String weather){
		if("暴雨".equals(weather)){
			System.out.println(name+"在宿舍休息！！");
		}else if("雾霾".equals(weather)){
			System.out.println(name+"心情不好，休息！！");
		}else if("冰雹".equals(weather)){
			System.out.println(name+"在宿舍休息！！");
		}else if("台风".equals(weather)){
			System.out.println(name+"在宿舍休息！！");
		}else if("霜冻".equals(weather)){
			System.out.println(name+"盖棉被休息！！");
		}else if("晴天".equals(weather)){
			System.out.println(name+"去教室休息！！");
		}
	}

}
