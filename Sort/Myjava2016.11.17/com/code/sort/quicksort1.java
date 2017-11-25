package com.code.sort;

import java.util.Scanner;

public class quicksort1 {


	private static Scanner s;
	public static int partition(int a[],int p,int q)
	{
		int x=a[p];
		int temp;
		int i=p;
		int j;
		for(j=p+1;j<=q;j++)
		{
			if(a[j]<=x)
			{
				i=i+1;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[p];
		a[p]=a[i];
		a[i]=temp;
		return i;
	}
	public static void quicksort(int[] a,int p,int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			quicksort(a,p,q-1);
			quicksort(a,q+1,r);
		}
	}
	public static void main(String[] args) {
		int[] arr1=new int[]{3,5,2,5,1,4};
		System.out.println("�����������ģ��");
		s = new Scanner(System.in);
		int n=s.nextInt();

		quicksort(arr1,0,n);
		for (int i= 0; i < arr1.length; i++) {

			System.out.print(arr1[i]);
		}
	}
}
