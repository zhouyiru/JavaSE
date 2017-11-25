package com.code.exception;

public class throwException {

	public static void main(String[] args)  throws Exception  {
		// TODO Auto-generated method stub
		try {
			div(2, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("over");

	}
public static void div(int x, int y)  throws Exception  { // 声明异常，通知方法调用者。

	if (y == 0) {
       throw new Exception("除数为0"); // throw关键字后面接受的是具体的异常的对象
	}
	System.out.println(x / y);
	System.out.println("除法运算");
}
}
