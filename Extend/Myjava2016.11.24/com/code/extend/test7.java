package com.code.extend;

public class test7 {
	public static void dosomething(car a){
		if(a instanceof benz){
			benz b=(benz) a;//С���ǿ��ת��
		   b.run1();
		}else if(a instanceof baom){
			baom m=(baom) a;
			m.run2();
		}else if(a instanceof bsj){
			bsj j=(bsj) a;
			j.run3();
		}else 
			System.out.println("over");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car a=new benz();//���С�Զ�ת��
		a.run();
		/*a.run1();//�������еķ������ɵ���*/
	
		System.out.println();
		dosomething(new benz());
		dosomething(new baom());
		dosomething(new bsj());
		
		}
}
