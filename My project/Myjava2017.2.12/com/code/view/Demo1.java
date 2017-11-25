package com.code.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.code.util.FrameUtil;

/*
 如果需要画图，要使用到jpanel 
 */

@SuppressWarnings("serial")
public class Demo1 extends JPanel {

	
	@Override
	public void paint(Graphics g) {  // Graphics 是一个画笔, 该画笔可以画图形，也可以写文字。
		//设置画笔的颜色
		g.setColor(Color.GRAY);
		//使用画笔画矩形
		g.fill3DRect(0, 0, 20,  20, true);
		g.fill3DRect(20, 0, 20, 20, true);
		g.setColor(Color.red);
		g.setFont(new Font("宋体", Font.BOLD, 36));
		g.drawString("GAME OVER!", 200, 250);
	} 
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("画笔");
		Demo1 d = new Demo1();
		frame.add(d);
		FrameUtil.initFrame(frame, 600, 600);
	}
}

