package com.code.deadlock;

public class deadlockThread extends Thread{
	
	/*
	 java同步机制解决了线程安全问题，但是同时也引发了死锁现象。
	 
	 死锁现象如何解决呢： 没法解决。 只能尽量的避免死锁现象。
	 
	 死锁现象出现 的根本原因：
	 	1. 存在两个或者两个以上的线程存在。
	 	2. 多个线程必须共享两个或者两个以上的资源。


	 */	
		public deadlockThread(String name){
			super(name);
		}
		
		
		@Override
		public void run() {
			if("张三".equals(this.getName())){
				synchronized ("遥控器") {
					System.out.println(this.getName()+"取走了遥控器，准备取电池");
					synchronized ("电池") {
						System.out.println(this.getName()+"取到了电池，开着空调爽歪歪的吹着 ！！");
					}
				}
				
				
			}else if("李四".equals(this.getName())){
				synchronized ("电池") {
					System.out.println(this.getName()+"取走了电池，准备取取遥控器");
					synchronized ("遥控器") {
						System.out.println(this.getName()+"取走了遥控器，开着空调爽歪歪的吹着 ！！");
					}
				}
			}
		}
 
		public static void main(String[] args) {
			//创建了线程对象
			deadlockThread thread1 = new deadlockThread("张三");
			deadlockThread thread2 = new deadlockThread("李四");
			thread1.setPriority(10);
			thread2.setPriority(1);
			//调用start方法启动线程
			thread1.start();
			thread2.start();
			
		}
	}


