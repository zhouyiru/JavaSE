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
			return new baom("����x6", "��ɫ");
		} else if (1 == x) {
			return new benz("����", "��ɫ");
		} else if (2 == x) {
			return new bsj("��ʱ��", "��ɫ");
		} else {
			return new benz("Smart", "��ɫ");
		}

	}

}
