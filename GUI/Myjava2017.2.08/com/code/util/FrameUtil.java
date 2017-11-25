package com.code.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

//图形化界面的工具类
public class FrameUtil {

	//设置窗体出现在中间位置
	public static void initFrame(JFrame frame,int width,int height){
		//获取默认系统工具包
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//获取屏幕的分辨率。
		Dimension  d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		//设置窗体的可见性
		frame.setVisible(true);
		//设置窗体关闭时间
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
