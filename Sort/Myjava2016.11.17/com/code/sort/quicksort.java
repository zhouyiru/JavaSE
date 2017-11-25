package com.code.sort;

public class quicksort {

	public static void quickSort(int[] arr1,int start,int end){
		if(start<end){
			int base=arr1[start];
			int i=start,j=end;
			do{
				while((arr1[i]<base)&&(i<end)){
					i++;
				}
				while((arr1[j]>base)&&(j>start)){
					j--;
				}
				if(i<=j){
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					i++;
					j--;
				}
			}
			while(i<=j);
			{
				if(start<j){
					quickSort(arr1,start,j);
				}
				if(end>i){
					quickSort(arr1,i,end);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1=new int[]{3,5,2,5,1,4};
		int n=5;
		quickSort(arr1,0,n);
	for (int i= 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i]);
	}
	}
}
