package com.code.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
GridLayout  ��񲼾ֹ�����

�����ӵ���������˱��ĸ�������ô����Ӷ�һ�д���
 */

public class gridLayout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
		//����һ����񲼾ֹ�����
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
