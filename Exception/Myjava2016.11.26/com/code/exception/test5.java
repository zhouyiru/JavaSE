package com.code.exception;

public class test5 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
       try{print(null);
       }catch(Exception e){
       System.out.println("×½µ½Òì³£ÁË");
       }
		
	}

	public static void print(int[] arr) throws Exception{
		if(arr==null){
			throw new Exception();
		}
		
	}
}
