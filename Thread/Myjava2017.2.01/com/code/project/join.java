package com.code.project;

/*
 join����: �߳��ò���
 
 ����ģ��Сʱ�����.
 */

class Mother extends Thread{
	
	@Override
	public void run() {
		System.out.println("����ϴ��...");
		System.out.println("�����в�...");
		System.out.println("���跢��û�н�����...");
		//֪ͨ����ȥ����
		Son s = new Son();
		s.start();
		try {
			s.join();   //  join ����  : �����ǰ�߳�ִ����join��������ô��ǰ�߳̾ͻ��ò����¼�����߳����������Ȼ��ǰ�̲߳ż�����ִ���Լ�������
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("���賴��...");
		System.out.println("ȫ��һ��Է�...");
	}	
}

//�����߳�
class Son extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("������¥��");
			Thread.sleep(1000);
			System.out.println("����һֱ��ǰ��...");
			System.out.println("�������˽���...");
			System.out.println("�����ܻ���...");
			Thread.sleep(1000);
			System.out.println("���Ӱѽ��͸�����..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}



	
	public static void main(String[] args) {
		Mother m =  new Mother();
		m.start();
	}
}
