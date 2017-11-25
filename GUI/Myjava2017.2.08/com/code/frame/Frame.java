package com.code.frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
/*
 软件的交互方式：
 	1. dos命令的交互方式。
 	2. 图形化界面的交互方式
 
 在java中图形化界面编程中把所有 的图形类都称作为组件类。
 
 所有图形组件类都是位于： java.awt 和 javax.swing 包。
 	在awt包中存在图形类，在swing一样会存在，区别在于swing的图形都是以J开头的。
 
 
java.awt包的图形类与javax.swing 包的图形类的区别：
	1. java.awt包中的所有图形类的图形都是依赖系统的图形库的。javax.swing中的图形类的图形都是sun自己去实现的。
	
 所有的图形类都称作为组件：
				容器组件
				非容器组件
 */


public class Frame {

	public static void main(String[] args) {
		//创建了一个窗体对象
		JFrame frame = new JFrame("这个我第一个窗体软件");
		//设置窗体的大小(象素为单位)
//		frame.setSize(300, 400);
		//设置窗体左上角出现的位置
		//frame.setBounds((1366-300)/2, (768-400)/2, 300, 400);
		
		initFrame(frame, 300, 400);
		//设置窗体的可见性
		frame.setVisible(true);
		//设置窗体的关闭事件
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	//设置窗体出现在中间位置
	public static void initFrame(JFrame frame,int width,int height){
		//获取默认系统工具包
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//获取屏幕的分辨率。
		Dimension  d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		
	}
	
}
