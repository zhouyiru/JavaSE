package com.code.stopThread;

/*
停止线程：  

停止线程要注意的实现：
	1. 我们停止一个线程一般都会配合一个变量去控制。
	2. 如果我们停止的是一个等待状态下的线程，那么需要配合interrupt方法去使用。 
 */
public class stopThread extends Thread {
	
	boolean flag = true;
	public stopThread(String name){
		super(name);
	}
	
	@Override
	public synchronized void run() {
		int i = 0; 
		while(flag){
			try {
				this.wait();  //   狗娃等待...
			} catch (InterruptedException e) {
				System.out.println("接收到了一个InterruptedException..");  //狗娃
			}
			System.out.println(Thread.currentThread().getName()+":"+ i);
			i++;
		}
	}
	public  static void main(String[] args) {
		//创建线程对象
		stopThread d = new stopThread("狗娃");
		d.start();
		//当主线程的i到80的时候，停止狗娃线程。
		for(int i = 0 ; i<100 ; i++){
			if(i==80){
				d.flag = false; //interrupt() 无法停止一个线程， 
				d.interrupt();  //强制清除一个线程的wait、 sleep状态。  可以指定清除那个线程。		
			}			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
