package com.code.project;

public class bankThread extends Thread {
	static int num=5000;
	static int count=1;

	public bankThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized("��"){
				if(num>0){
					num=num-100;
					System.out.println(Thread.currentThread().getName()+"ȡ��"+count+"��,��ʣ"+num+"Ԫ");
					count++;

				}else{
					System.out.println("û��");
					break;
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankThread d1=new bankThread("�Ϲ�");
		bankThread d2=new bankThread("����");
		d1.start();
		d2.start();
	}

}
