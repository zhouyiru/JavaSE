package com.code.exception;

public class throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Throwable able = new Throwable("想吐。。。");
		System.out.println(able.toString()); // 输出该异常的类名
		System.out.println(able.getMessage()); // 输出异常的信息
		able.printStackTrace(); // 打印栈信息
	}
}


