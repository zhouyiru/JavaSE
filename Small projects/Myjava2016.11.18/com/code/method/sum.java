package com.code.method;

public class sum {

	public static void printarr1(int[][] arr1){
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ,");
			}
		}
	}
	public static long getSum( int [][] a ){
	       // 0. ����һ���������
	        long sum = 0;
		   // 1. �𿪶�ά����
		   for ( int i = 0 ; i < a.length ; i++ )
		   {
			   // 2. ��һά�����ȡ����
			   for ( int j = 0 ; j < a[i].length ; j++ )
			   {
					sum+=a[i][j];
			   }
		   }
		   return sum;
		} 
	public static int getDataCount( int [][] a ){
		   // 0. ��¼Ԫ�ظ���
		   int  count = 0;
		   // 1. �𿪶�ά����
		   for ( int i = 0 ; i < a.length ; i++ )
		   {
			   // 2. ��һά�����ȡ����
			   for ( int j = 0 ; j < a[i].length ; j++ )
			   {
					count++;
			   }
		   }
		  return count;
		} 

public static void main(String[] args) 
{
	
	int [][] a = new int[][]{ {23,4,5},{2},{4,5,78,56,90} };
	printarr1( a );
    System.out.println();
	System.out.println("�ۼӺ��ǣ� "+getSum( a ) );
	System.out.println("ͳ��Ԫ�ظ����� "+getDataCount( a ) );
}
}

