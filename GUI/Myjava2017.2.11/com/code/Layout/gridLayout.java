package com.code.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
GridLayout  表格布局管理器

如果添加的组件超过了表格的个数，那么会添加多一列处理。
 */

public class gridLayout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("计算器");
		//创建一个表格布局管理器
		GridLayout gridLayout = new GridLayout(4, 4);
		frame.setLayout(gridLayout);
		
		for(int i = 0 ; i < 10 ; i++){
			frame.add(new JButton(i+""));
		}
		
		frame.add(new JButton("+"));
		frame.add(new JButton("-"));
		frame.add(new JButton("*"));
		frame.add(new JButton("/"));
		frame.add(new JButton("="));
		frame.add(new JButton("."));
		frame.add(new JButton("he"));
		
		FrameUtil.initFrame(frame, 300, 300);
		
		
		
	}
	
	
}
