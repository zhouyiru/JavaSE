package com.code.project;

	
	/*
	 需求：使用线程的第二种创建方式实现买票的例子
	 */
public class saleTickets2 implements Runnable{
		
		 int num = 50;  //非静态成员变量

		@Override
		public  void run() {  //this
			
			while(true){	
				synchronized ("锁") {
					if(num>0){
						System.out.println(Thread.currentThread().getName()+"卖出了第"+ num+"号票");
						num--;
					}else{
						System.out.println("售罄了...");
						break;
					}
				
			}
		}			
	}	
		public static void main(String[] args) {
			//创建Runnable实现类的对象
			saleTickets2 s = new saleTickets2();
			//创建三个线程对象
			Thread t1 = new Thread(s,"窗口1");
			Thread t2 = new Thread(s,"窗口2");
			Thread t3 = new Thread(s,"窗口3");
			//调用start方法开启线程
			t1.start();
			t2.start();
			t3.start();
		}
		
		
	}

