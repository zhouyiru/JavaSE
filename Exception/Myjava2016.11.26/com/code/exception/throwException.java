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
public static void div(int x, int y)  throws Exception  { // �����쳣��֪ͨ���������ߡ�

	if (y == 0) {
       throw new Exception("����Ϊ0"); // throw�ؼ��ֺ�����ܵ��Ǿ�����쳣�Ķ���
	}
	System.out.println(x / y);
	System.out.println("��������");
}
}
