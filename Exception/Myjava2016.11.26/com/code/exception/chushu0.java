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
        //���д����yֵ������0,���������쳣��ֹͣ
		try{
			System.out.println(x / y);
		}
		catch (ArithmeticException e) { // �����쳣ƥ�䣬
             //�쳣��Ϣ
			System.out.println(e.toString());
			System.out.println(e.getMessage());	
		    e.printStackTrace();
			System.out.println("��������Ϊ0");
		}
		System.out.println("��������");
	
	}
}
