package com.code.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.code.util.FrameUtil;

/*
 Panel（面板）
 */
public class Panel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		//面板  
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		//把面板添加到窗体上。
		frame.add(panel);
		FrameUtil.initFrame(frame, 500, 400);		
	}
	
}
