package com.code.project;

	
	/*
	 ����ʹ���̵߳ĵڶ��ִ�����ʽʵ����Ʊ������
	 */
public class saleTickets2 implements Runnable{
		
		 int num = 50;  //�Ǿ�̬��Ա����

		@Override
		public  void run() {  //this
			
			while(true){	
				synchronized ("��") {
					if(num>0){
						System.out.println(Thread.currentThread().getName()+"�����˵�"+ num+"��Ʊ");
						num--;
					}else{
						System.out.println("������...");
						break;
					}
				
			}
		}			
	}	
		public static void main(String[] args) {
			//����Runnableʵ����Ķ���
			saleTickets2 s = new saleTickets2();
			//���������̶߳���
			Thread t1 = new Thread(s,"����1");
			Thread t2 = new Thread(s,"����2");
			Thread t3 = new Thread(s,"����3");
			//����start���������߳�
			t1.start();
			t2.start();
			t3.start();
		}
		
		
	}

