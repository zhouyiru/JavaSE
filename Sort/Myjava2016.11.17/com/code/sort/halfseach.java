package com.code.sort;

public class halfseach {

	public static int halfSeach(int[]arr,int key) {
		// TODO Auto-generated method stub

		int min,mid,max;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(arr[mid]!=key){
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[max])
				max=mid-1;
			if(min>max)
				return -1;
		}   mid=(min+max)/2;
		
	  return mid;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[]{3,5,1,4};
		 halfSeach(arr1,3);
		
		for (int i= 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i]);
	
     	}
	}
}
