package com.code.project;

public class bankThread extends Thread {
	static int num=5000;
	static int count=1;

	public bankThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized("锁"){
				if(num>0){
					num=num-100;
					System.out.println(Thread.currentThread().getName()+"取了"+count+"次,还剩"+num+"元");
					count++;

				}else{
					System.out.println("没了");
					break;
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankThread d1=new bankThread("老公");
		bankThread d2=new bankThread("老婆");
		d1.start();
		d2.start();
	}

}
