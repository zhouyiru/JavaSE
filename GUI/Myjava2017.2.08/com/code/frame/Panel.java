package com.code.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.code.util.FrameUtil;

/*
 Panel����壩
 */
public class Panel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		//���  
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		//�������ӵ������ϡ�
		frame.add(panel);
		FrameUtil.initFrame(frame, 500, 400);		
	}
	
}
