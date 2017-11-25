package com.code.test;

public class _continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a:for(int i=1;i<5;i++)
		{
			for(int j=1;j<4;)
			{
				System.out.print("*");
				continue a;
			}
		}System.out.print("\r\n");
	}

}
