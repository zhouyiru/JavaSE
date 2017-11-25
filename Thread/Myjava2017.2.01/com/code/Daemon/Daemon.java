package com.code.Daemon;

/*
�ػ��߳�(��̨�߳�) : ��ǰһ��javaӦ��ֻʣ���ػ��̵߳�ʱ����ô�ػ��߳����Ͻ�����

�ػ��߳�Ӧ�ó�����
	1. �µ�����汾���ء�
 
 ����ģ��QQ�����ظ��°�. 
 
 �ػ��߳�Ҫע������
 	1. ���е��߳�Ĭ�϶������ػ��̡߳�
 	
 */
public class Daemon extends Thread {
	
	
	public Daemon(String name){
		super(name);
	}
	
	@Override
	public void run()  { // �����׳����쳣���ͱ���ҪС�ڻ��ߵ��ڸ����׳� ���쳣���͡�
		for(int i = 1 ;  i<100 ; i++){
			System.out.println(this.getName()+"�Ѿ������ˣ�"+i+"%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������ϣ����ڰ�װ���°�������");
	}
	
	
	
	
	public static void main(String[] args) {
		//����һ���̶߳���
		Daemon d = new Daemon("�ػ��߳�");
		
		d.setDaemon(true); //����һ���߳�Ϊ�ػ��̡߳�
//		System.out.println("���ػ��߳���"+d.isDaemon());  // isDaemon �ж�һ���߳��Ƿ�Ϊ�ػ��̡߳�
		//�����߳�
		d.start();
		
		for(int i = 0; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
