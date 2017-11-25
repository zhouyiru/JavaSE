package com.code.ifelse;


public class test1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scar s=new scar();
		s.num=3;
		s.run();
		System.out.println();
		
		carfactory c=new carfactory();
	    if(s.num<4){
		c.xiuli(s);
		}else{
		s.run();
		System.out.println();
	}
	    }

}
