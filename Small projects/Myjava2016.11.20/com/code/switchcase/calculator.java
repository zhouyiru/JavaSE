package com.code.switchcase;

public class calculator {

	public String name="���������";
	public double num1;
	public double num2;
	public char option;
	public void init(double a,char op,double b){
		num1=a;
		option=op;
		num2=b;
	}
	public void calculate(double a,char op,double b){
		switch (op) {
		case '+': System.out.println(  name + " : " + num1 + " + " + num2 + " = " + ( num1 + num2 ) );
        break;
        case '-': System.out.println(  name + " : " + num1 + " - " + num2 + " = " + ( num1 - num2 ) );
        break;
        case '*': System.out.println(  name + " : " + num1 + " * " + num2 + " = " + ( num1 * num2 ) );
        break;
        case '/': {
           if( num2 != 0 ) 
           System.out.println(  name + " : " + num1 + " / " + num2 + " = " + ( num1 / num2 ) );
		   else
           System.out.println("��������Ϊ0!");
           break;
        }
        case '%': {
        // 1.�������ķ������⣬ʹ�ý���ķ���������ѧ��Ҫ��
		 // 2.���NaN������
        System.out.println(  name + " : " + num1 + " % " + num2 + " = " + ( num1 % num2 ) );
        break;
        }
        default : System.out.println("����");
        }
	}
	}
	
