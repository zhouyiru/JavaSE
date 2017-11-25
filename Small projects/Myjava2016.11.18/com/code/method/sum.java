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
	       // 0. 定义一个结果变量
	        long sum = 0;
		   // 1. 拆开二维数组
		   for ( int i = 0 ; i < a.length ; i++ )
		   {
			   // 2. 拆开一维数组获取数据
			   for ( int j = 0 ; j < a[i].length ; j++ )
			   {
					sum+=a[i][j];
			   }
		   }
		   return sum;
		} 
	public static int getDataCount( int [][] a ){
		   // 0. 记录元素个数
		   int  count = 0;
		   // 1. 拆开二维数组
		   for ( int i = 0 ; i < a.length ; i++ )
		   {
			   // 2. 拆开一维数组获取数据
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
	System.out.println("累加和是： "+getSum( a ) );
	System.out.println("统计元素个数： "+getDataCount( a ) );
}
}

