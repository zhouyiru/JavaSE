package com.code.thread;

public class videoThread extends Thread {
	
     public videoThread(String name) {
	
    	 super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("��Ƶ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //talkThread t=new talkThread();
     // t.start();
      //t.getName();
      videoThread v=new videoThread("����");
      //v.start();
      v.getName();
	}

}
