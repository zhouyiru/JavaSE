package com.code.exception;

public class duogeyichang {

	public static void main(String[] args) {

		System.out.println();
		int[] arr = { 1, 2 };
		arr = null;
		// print (1, 0, arr);
		print (1, 2, arr);
		System.out.println("over");
	}	
	public static void print(int x, int y, int[] arr) {
	try {
		System.out.println(arr[1]);
		System.out.println(x / y);
	} catch (ArithmeticException e) {
		e.toString();
		e.getMessage();
		e.printStackTrace();
		System.out.println("�����쳣������");
	} catch (ArrayIndexOutOfBoundsException e) {
		e.toString();
		e.getMessage();
		e.printStackTrace();
		System.out.println("����Ǳ�Խ�硣����");
	} catch (NullPointerException e) {
		e.toString();
		e.getMessage();
		e.printStackTrace();
		System.out.println("��ָ���쳣������");
	}
	System.out.println("����ִ�����");
}
}
