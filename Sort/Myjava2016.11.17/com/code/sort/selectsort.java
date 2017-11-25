package com.code.sort;

public class selectsort {
	public static void selectSort(int[] a) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < a.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 5, 2, 5, 1, 4 };
		selectSort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
}
