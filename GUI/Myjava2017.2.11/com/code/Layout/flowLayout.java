package com.code.Layout;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.code.util.FrameUtil;

/*
FlowLayout 流式布局管理器

FlowLayout要注意的事项：
	1. 使用FlowLayout的时候默认是居中对齐的。
	2. panel默认使用的布局管理器就是FlowLayout. 
	
 
 */
public class flowLayout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		//面板
		JPanel panel = new JPanel();
		//创建一个流式布局管理器
		@SuppressWarnings("unused")
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,10,0);
		//让面板使用流式布局管理器
//		panel.setLayout(flowLayout);
		frame.add(panel);
		
		panel.add(new JButton("one"));
		panel.add(new JButton("two"));
		panel.add(new JButton("three"));
		panel.add(new JButton("four"));
		
		FrameUtil.initFrame(frame, 300, 300);
		
	}
	

}
