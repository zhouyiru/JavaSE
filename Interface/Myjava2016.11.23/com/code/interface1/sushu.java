package com.code.interface1;

public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,i,j;
		for(i=1;i<=10;i++){
			if(i%2==0)
				continue;
			sum=sum+i;
		}System.out.println(sum);
		
		for(j=2;j<=50;j++){
			for(i=2;i<=j/2;i++){
				if(j%i==0)
					break;
				//j=j+1;
			}
			if(i>j/2){
				//j+=i;
				System.out.println(""+j+"ÎªËØÊı");
			         }
		}
	}

}
