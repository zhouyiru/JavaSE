package com.code.recursive;

public class jiecheng {


	/*
	 �ݹ飺 ��һ���������ڲ����÷����ı�������ͳ���Ϊ�ݹ顣
	 
	 �ݹ��ʹ��ǰ�᣺ һ��Ҫ���������á� 
	 
	���� ���5�Ľ׳ˡ�  5! = 5*4*3*2*1
	 
	 */

		public static void main(String[] args) {
			int result = test2(5);
			System.out.println("�����"+ result);
		}
		
		
		//�����5�Ľ׳ˡ�
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
			System.out.println("�����"+ result);
		}


}
