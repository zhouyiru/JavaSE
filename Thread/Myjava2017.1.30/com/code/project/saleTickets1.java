package com.code.project;

public class saleTickets1 extends Thread{
	static int num=50;//�ص�
    //static Object o=new Object();//�����������static
public saleTickets1(String name) {
	// TODO Auto-generated constructor stub
	super(name);
}
public void run() {
	while(true){
		synchronized("��"){//ͬ��������
		if(num>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num+"��Ʊ");
			num--;
		}else{
			System.out.println("û��");
			break;
		}
	}
	}
}

public static void main(String[] args) {
	saleTickets1 s1 = new saleTickets1("һ");
	saleTickets1 s2 = new saleTickets1("��");
	saleTickets1 s3 = new saleTickets1("��");
	s1.start();
	s2.start();
	s3.start();
}
}
