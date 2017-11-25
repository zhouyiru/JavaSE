package com.code.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {

	public static void main(String[] args) {
		ArrayList<Sheep> arr = new ArrayList<Sheep>();
		//arr.add(new Tiger("���ϻ�"));
		//arr.add(new Tiger("������"));
		arr.add(new Sheep("ϲ����"));
		System.out.println(arr);
		Iterator<Sheep> it = arr.iterator();
		while (it.hasNext()) {
			Sheep next = it.next(); 
			next.eat();
		}

	}
}
