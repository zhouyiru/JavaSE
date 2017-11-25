package com.code.communication;

/*
 �̵߳�ͨѶ: ��һ���߳������һ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������� �����顣
 
����1�� �۸����.. ���̰߳�ȫ���⣩

����2������һ��������һ����


�߳�ͨѶ�ķ�����
	
	wait()   ִ����wait�������̣߳����ø��߳̽����������������̳߳��еȴ���
	
	notify()  ���һ���߳�ִ����notify���������̻߳ỽ���������������̳߳��еȴ��߳��е�һ��.
	
	notifyAll();  �����е��̶߳����ѡ�()
 

�߳�ͨѶҪע������	
	1. wait�� notify�� notifyAll������������Object����ķ�����
	2. wait��notify��������Ҫ��ͬ������������ͬ�������е��á�
	3. wait��notify������������������ã����򱨴�
	
	4. һ���߳�ִ����wait�������ͷ�������ġ�
	
 */

//��Ʒ��
class Product{
	
	String name;
	
	int price;
	
	boolean flag ;  //��Ʒ�Ƿ�������ϵı�ʶ   falseΪ��û��������ϣ� true ���������.
	
}

//��������
class Producer extends Thread{
	
	//ά��һ����Ʒ
	Product p;
	
	public Producer(Product p){
		this.p = p;
	}
	
	@Override
	public void run() {
		int i = 0; 
		while(true){
			synchronized (p) {	
				if(p.flag==false){
					if(i%2==0){
						p.name = "Ħ�г�";
						p.price= 4000;
					}else{
						p.name = "���г�";
						p.price = 300;
					}
					System.out.println("������"+ p.name+" �۸�"+ p.price);
					i++;
					//������� --- �ı�ʶ
					p.flag = true; 
					//����������ȥ����
					p.notifyAll();;
				}else{
					//�����Ʒ�Ѿ�������ϣ�Ӧ�õȴ�������������
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}



//������
class Customer extends Thread{
	
	//��Ʒ
	Product p;
	
	public Customer(Product p){
		this.p = p;
	}
	
	
	@Override
	public void run() {
		while(true){
			synchronized (p) {
				if(p.flag==true){
					System.out.println("�����������ˣ�"+ p.name+" �۸�"+ p.price);
					//�ı�ʶ
					p.flag = false;
					p.notifyAll();
				}else{
					//�����Ʒ�Ѿ����������,Ӧ�û���������ȥ����
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		//����һ����Ʒ����
		Product p = new Product();
		//�����̶߳���
		Producer producer = new Producer(p);
		Customer customer = new Customer(p);
		//�����߳�
		producer.start();
		customer.start();
		
	}
	
}
