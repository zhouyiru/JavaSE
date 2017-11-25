package com.code.recursive;

public class jiecheng {


	/*
	 递归： 在一个方法的内部调用方法的本身，这个就称作为递归。
	 
	 递归的使用前提： 一定要有条件调用。 
	 
	需求： 算出5的阶乘。  5! = 5*4*3*2*1
	 
	 */

		public static void main(String[] args) {
			int result = test2(5);
			System.out.println("结果："+ result);
		}
		
		
		//算出了5的阶乘。
		public static int test2(int num){
			if(num==1){
				return 1;
			}else{
				return num*test2(num-1);
			}
		}
		
		
		public static void test(int num){
			int result = 1 ; 
			while(num>0){
				result = result*num;
				num--;
			}
			System.out.println("结果："+ result);
		}


}
