package com.code.deadlock;

public class deadlockThread extends Thread{
	
	/*
	 javaͬ�����ƽ�����̰߳�ȫ���⣬����ͬʱҲ��������������
	 
	 ����������ν���أ� û������� ֻ�ܾ����ı�����������
	 
	 ����������� �ĸ���ԭ��
	 	1. �������������������ϵ��̴߳��ڡ�
	 	2. ����̱߳��빲�����������������ϵ���Դ��


	 */	
		public deadlockThread(String name){
			super(name);
		}
		
		
		@Override
		public void run() {
			if("����".equals(this.getName())){
				synchronized ("ң����") {
					System.out.println(this.getName()+"ȡ����ң������׼��ȡ���");
					synchronized ("���") {
						System.out.println(this.getName()+"ȡ���˵�أ����ſյ�ˬ����Ĵ��� ����");
					}
				}
				
				
			}else if("����".equals(this.getName())){
				synchronized ("���") {
					System.out.println(this.getName()+"ȡ���˵�أ�׼��ȡȡң����");
					synchronized ("ң����") {
						System.out.println(this.getName()+"ȡ����ң���������ſյ�ˬ����Ĵ��� ����");
					}
				}
			}
		}
 
		public static void main(String[] args) {
			//�������̶߳���
			deadlockThread thread1 = new deadlockThread("����");
			deadlockThread thread2 = new deadlockThread("����");
			thread1.setPriority(10);
			thread2.setPriority(1);
			//����start���������߳�
			thread1.start();
			thread2.start();
			
		}
	}


