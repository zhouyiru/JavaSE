package com.code.sort;

public class bubblingsort {

	public static void maopaosort(int[] arr){
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
				     arr[j]=arr[j+1];
				     arr[j+1]=t;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[]{3,5,2,5,1,4};
		 maopaosort(arr1);
		
		for (int i= 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i]);
	
     	}
	}
}
