package com.code.exception;

public class throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Throwable able = new Throwable("���¡�����");
		System.out.println(able.toString()); // ������쳣������
		System.out.println(able.getMessage()); // ����쳣����Ϣ
		able.printStackTrace(); // ��ӡջ��Ϣ
	}
}


