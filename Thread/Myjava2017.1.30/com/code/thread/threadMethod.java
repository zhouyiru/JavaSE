package com.code.thread;

public class threadMethod extends Thread {


	public threadMethod(String name) {//��ʼ���߳���
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	
		
		for(int i=0;i<10;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		threadMethod d=new threadMethod("123");
		d.start(); 
		d.setPriority(1);//�������ȼ�
		//Thread.sleep(1000);//���߳�˯��
		Thread mainThread=Thread.currentThread();
		System.out.println("���ȼ���"+mainThread.getPriority());
		mainThread.setPriority(10);
		for(int i=0;i<10;i++){
			System.out.println(mainThread.getName()+":"+i);//��ȡ��ǰִ���̶߳�����
		}
	}

}
