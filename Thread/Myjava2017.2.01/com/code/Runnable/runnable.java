package com.code.Runnable;

	/*

	 �Զ����̵߳Ĵ�����ʽ��
	 	
	 	��ʽһ�� 
	 		1. �Զ���һ����̳�Thread.
	 		2. ������дrun���������Զ����̵߳���������run�����ϡ�
	 		3. ����thread����Ķ��󣬲��ҵ���start���������̡߳�
	 	
	 	��ʽ����
	 		1. �Զ���һ����ȥʵ��Runnable�ӿڡ�
	 		2. ʵ����Runnable�ӿڵ�run������ ���Զ����̵߳���������run�����ϡ�
	 		3. ����Runnableʵ����Ķ���
	 		4. ����Thread���󣬲��Ұ�Runnableʵ���������Ϊ�������ݽ�ȥ��
	 		5. ����thread�����start���������̡߳�
	 		
	����1�� Runnableʵ����������̶߳�����
	 		runnableʵ����Ķ��󲢲���һ���̶߳���ֻ������ʵ����Runnable�ӿڵĶ�����ѡ�
	 
	����2��  ΪʲôҪ��Runnableʵ����Ķ�����Ϊ�������ݸ�thread�����أ�������ʲô��
			 ���ã� �ǰ�Runnableʵ����Ķ����run������Ϊ���������ȥִ���ˡ�
			 
	�Ƽ�ʹ�ã� �Ƽ�ʹ�õڶ��֡�  ��Ϊjava�ǵ��̳еġ�
 
	 */
	public class runnable implements Runnable{
		@Override
		public void run() {
			for(int i = 0 ; i< 100 ; i++){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}		
			System.out.println("��ǰ�̶߳���"+Thread.currentThread());  // ��ǰ�̶߳����ǣ� Thread  
			System.out.println("��ǰ����"+ this);   //this���� Demo3�Ķ���
		}	
		public static void main(String[] args) {
			//����Runnableʵ����Ķ���
			runnable d = new runnable();
			//����Thread���󣬲��Ұ�Runnableʵ���������Ϊ�������ݽ�ȥ
			Thread t = new Thread(d,"����");
			//����thead�����start���������̡߳�
			t.start();
			/*
			 	1. Thread��ʹ����target������¼��Runnableʵ�������
			 	
			 	
			 	 public void run() {  //run�����Ĵ����������̵߳��������
			        if (target != null) {  
			            target.run();    // ������Runanbleʵ��������run������ �����൱�ڰ�Runnableʵ�����run������Ϊ���̵߳��������ȥִ���ˡ�
			        }
			     }			 
			 */
						
			//���߳�ִ�еġ�
			for(int i = 0 ; i< 100 ; i++){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}

	}

