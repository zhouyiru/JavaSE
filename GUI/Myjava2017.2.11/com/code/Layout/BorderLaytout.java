package com.code.Layout;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
���ֹ����� : 

���ֹ����������þ������ڰڷ������

ÿ�ֲ�ͬ�Ĳ��ֹ��������в�ͬ�ķ��

BorderLaytout(�߿򲼾ֹ�����): 

borderLayout Ҫע������
	1. ���һ������ʹ����BorderLayout���� ����������ô����������������ʱ�����û��ָ������ķ�λ����ôĬ�����м䡣
	2�� FrameĬ��ʹ�õľ���BorderLayout���ֹ�����.
	3. ���������Ǹ������ȱ�ٵģ���ô�м���������ռ�����ȱλ�á�
	

 */
public class BorderLaytout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("�߿򲼾ֹ�����");
		//�����߿򲼾ֹ�����
		BorderLayout borderLayout = new BorderLayout();
		//�ô���ʹ�ñ߿򲼾ֹ�����
		frame.setLayout(borderLayout);
		
		frame.add(new JButton("��"),BorderLayout.NORTH);
		frame.add(new JButton("��"),BorderLayout.SOUTH);
		frame.add(new JButton("��"),BorderLayout.WEST);
		frame.add(new JButton("��"),BorderLayout.EAST);
	//	frame.add(new JButton("��"),BorderLayout.CENTER);
		
		//��ʼ������
		FrameUtil.initFrame(frame, 300, 300);
		
		
	}
	
}
