package com.code.inclass;

public class outer2 {//�ֲ��ڲ���

	int y=100;
	public void print(){
		final int z=200;//�ڷ����������final�ؼ���
		class inner2{
			public void show(){
			System.out.println("�ڲ���"+y+z);
			}
		}
	inner2 i=new inner2();
	i.show();
	}
}
