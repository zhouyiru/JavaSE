package com.code.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {

	public static void main(String[] args) {
		ArrayList<Sheep> arr = new ArrayList<Sheep>();
		//arr.add(new Tiger("华南虎"));
		//arr.add(new Tiger("东北虎"));
		arr.add(new Sheep("喜羊羊"));
		System.out.println(arr);
		Iterator<Sheep> it = arr.iterator();
		while (it.hasNext()) {
			Sheep next = it.next(); 
			next.eat();
		}

	}
}
