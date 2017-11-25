package com.code.exception;

public class chushu0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		div(2, 0);
		System.out.println("over");
		Throwable able = new Throwable();
		able.printStackTrace();
	}


	public static void div(int x, int y) {
        //该行代码的y值可能是0,程序会出现异常并停止
		try{
			System.out.println(x / y);
		}
		catch (ArithmeticException e) { // 进行异常匹配，
             //异常信息
			System.out.println(e.toString());
			System.out.println(e.getMessage());	
		    e.printStackTrace();
			System.out.println("除数不能为0");
		}
		System.out.println("除法运算");
	
	}
}
