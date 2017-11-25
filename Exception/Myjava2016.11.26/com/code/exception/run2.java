package com.code.exception;

public class run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		try {
			eat(0);              
		} catch (nomoneyException e) {
			String x = "Array.toString()";
			System.out.println(x);}
	}
	public static void eat(double money) throws nomoneyException {
		if (money < 10) {
			throw new nomoneyException("Ç®²»¹»");
		}
		System.out.println("³Ô¹ðÁÖÃ×·Û");
	}

		
	}


