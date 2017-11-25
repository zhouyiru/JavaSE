package com.code.Layout;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
布局管理器 : 

布局管理器的作用就是用于摆放组件。

每种不同的布局管理器都有不同的风格。

BorderLaytout(边框布局管理器): 

borderLayout 要注意的事项：
	1. 如果一个容器使用了BorderLayout布局 管理器，那么往该容器添加组件的时候如果没有指定具体的方位，那么默认在中间。
	2。 Frame默认使用的就是BorderLayout布局管理器.
	3. 东南西北那个组件是缺少的，那么中间的组件都会占据其空缺位置。
	

 */
public class BorderLaytout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("边框布局管理器");
		//创建边框布局管理器
		BorderLayout borderLayout = new BorderLayout();
		//让窗体使用边框布局管理器
		frame.setLayout(borderLayout);
		
		frame.add(new JButton("北"),BorderLayout.NORTH);
		frame.add(new JButton("南"),BorderLayout.SOUTH);
		frame.add(new JButton("西"),BorderLayout.WEST);
		frame.add(new JButton("东"),BorderLayout.EAST);
	//	frame.add(new JButton("中"),BorderLayout.CENTER);
		
		//初始化窗体
		FrameUtil.initFrame(frame, 300, 300);
		
		
	}
	
}
