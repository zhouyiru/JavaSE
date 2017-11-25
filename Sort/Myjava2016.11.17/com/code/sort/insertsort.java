package com.code.sort;

public class insertsort {

	public static void zhijiesort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[]{3,5,1,4};
		 zhijiesort(arr1);
		
		for (int i= 0; i < arr1.length; i++) {   
			
			System.out.print(arr1[i]);
	
     	}
	}
}
