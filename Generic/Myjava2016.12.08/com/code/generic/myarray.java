package com.code.generic;

public class myarray<T> {

	

	public void reverse(T[] arr){
		for (int startindex=0,endindex=arr.length -1;startindex<endindex;endindex--){
			T temp=arr[startindex];
			arr[startindex]=arr[endindex];
			arr[endindex]=temp;
		}
	}

	public String toString(T[] arr) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			if(i==0){
				sb.append("["+arr[i]+",");
			}
			else if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}
			else
				sb.append(arr[i]+",");
		}
		return sb.toString();
	}
}
