package com.code.Layout;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.code.util.FrameUtil;

/*
FlowLayout ��ʽ���ֹ�����

FlowLayoutҪע������
	1. ʹ��FlowLayout��ʱ��Ĭ���Ǿ��ж���ġ�
	2. panelĬ��ʹ�õĲ��ֹ���������FlowLayout. 
	
 
 */
public class flowLayout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		//���
		JPanel panel = new JPanel();
		//����һ����ʽ���ֹ�����
		@SuppressWarnings("unused")
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,10,0);
		//�����ʹ����ʽ���ֹ�����
//		panel.setLayout(flowLayout);
		frame.add(panel);
		
		panel.add(new JButton("one"));
		panel.add(new JButton("two"));
		panel.add(new JButton("three"));
		panel.add(new JButton("four"));
		
		FrameUtil.initFrame(frame, 300, 300);
		
	}
	

}
