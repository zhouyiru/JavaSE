package com.code.project;

public class saleTickets1 extends Thread{
	static int num=50;//重点
    //static Object o=new Object();//锁对象必须是static
public saleTickets1(String name) {
	// TODO Auto-generated constructor stub
	super(name);
}
public void run() {
	while(true){
		synchronized("锁"){//同步（锁）
		if(num>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖出了"+num+"号票");
			num--;
		}else{
			System.out.println("没了");
			break;
		}
	}
	}
}

public static void main(String[] args) {
	saleTickets1 s1 = new saleTickets1("一");
	saleTickets1 s2 = new saleTickets1("二");
	saleTickets1 s3 = new saleTickets1("三");
	s1.start();
	s2.start();
	s3.start();
}
}
