package com.code.overriding;

public class MyArray {

	public static String toString(int[] arr){
		String result="";
		for(int i=0;i<arr.length;i++){
			if(i==0){
				result+="["+arr[i]+",";
			}else if(i==arr.length-1){
				result+=arr[i]+"]";
			}else{
				result+=arr[i]+",";
			}
		} return result; 
	}
	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr={2,45,6,31,12,25};
		MyArray.sort(arr);
		String t=MyArray.toString(arr);
		System.out.println("สýื้ฃบ"+t);
		
	}
}
