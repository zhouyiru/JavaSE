package com.code.extend;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		while(x<100){
			car c = carFactory();
			c.run();
			x++;
		}System.out.println();
	}
	public static car carFactory() {
		int x = (int) Math.round(Math.random() * 2);

		if (0 == x) {
			return new baom("宝马x6", "红色");
		} else if (1 == x) {
			return new benz("奔驰", "黑色");
		} else if (2 == x) {
			return new bsj("保时捷", "棕色");
		} else {
			return new benz("Smart", "红色");
		}

	}

}
