package com.code.stopThread;

/*
ֹͣ�̣߳�  

ֹͣ�߳�Ҫע���ʵ�֣�
	1. ����ֹͣһ���߳�һ�㶼�����һ������ȥ���ơ�
	2. �������ֹͣ����һ���ȴ�״̬�µ��̣߳���ô��Ҫ���interrupt����ȥʹ�á� 
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
				this.wait();  //   ���޵ȴ�...
			} catch (InterruptedException e) {
				System.out.println("���յ���һ��InterruptedException..");  //����
			}
			System.out.println(Thread.currentThread().getName()+":"+ i);
			i++;
		}
	}
	public  static void main(String[] args) {
		//�����̶߳���
		stopThread d = new stopThread("����");
		d.start();
		//�����̵߳�i��80��ʱ��ֹͣ�����̡߳�
		for(int i = 0 ; i<100 ; i++){
			if(i==80){
				d.flag = false; //interrupt() �޷�ֹͣһ���̣߳� 
				d.interrupt();  //ǿ�����һ���̵߳�wait�� sleep״̬��  ����ָ������Ǹ��̡߳�		
			}			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
