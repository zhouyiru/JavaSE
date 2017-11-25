package com.code.switchcase;

public class calculator {

	public String name="奕儒计算器";
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
           System.out.println("除数不能为0!");
           break;
        }
        case '%': {
        // 1.处理结果的符号问题，使得结果的符号满足数学的要求
		 // 2.解决NaN的问题
        System.out.println(  name + " : " + num1 + " % " + num2 + " = " + ( num1 % num2 ) );
        break;
        }
        default : System.out.println("放肆");
        }
	}
	}
	
