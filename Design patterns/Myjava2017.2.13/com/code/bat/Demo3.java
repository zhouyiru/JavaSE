package com.code.bat;

/*
 主题： java基础加强+ 复习
 
 jar文件双击运行仅对于图形化界面的程序起作用，对于控制台程序是不起作用。

 bat处理文件： bat处理文件就是指一次性可以执行多个命令的文件。
 
 bat处理文件如何编写 ：
 	新建一个记事本，然后 把后缀名改成bat即可，然后把要执行的命令写在bat文件上。
 	
bat处理文件常用的命令：
	echo : 向控制台输出指定的语句.
	title ： 设置控制台标题。
	color: 设置控制台的颜色
	echo off  一个bat处理文件如果执行了echo off命令， 那么echo off以下的命令都会隐藏起来，只显示结果。
	@ :    隐藏当前行的命令。
	rem 表示此命令后的字符为解释行（注释），不执行，只是给自己今后参考用的（相当于程序中的注释） 或者%注释的内容%
	pause;  让控制台停留下来。
    %[1-9]   表示参数，变量。
 

 */


public class Demo3 {

	public static void main(String[] args) {
		System.out.println("hello world!!");
	}
	
}
