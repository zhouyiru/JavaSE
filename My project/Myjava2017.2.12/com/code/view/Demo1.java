package com.code.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.code.util.FrameUtil;

/*
 �����Ҫ��ͼ��Ҫʹ�õ�jpanel 
 */

@SuppressWarnings("serial")
public class Demo1 extends JPanel {

	
	@Override
	public void paint(Graphics g) {  // Graphics ��һ������, �û��ʿ��Ի�ͼ�Σ�Ҳ����д���֡�
		//���û��ʵ���ɫ
		g.setColor(Color.GRAY);
		//ʹ�û��ʻ�����
		g.fill3DRect(0, 0, 20,  20, true);
		g.fill3DRect(20, 0, 20, 20, true);
		g.setColor(Color.red);
		g.setFont(new Font("����", Font.BOLD, 36));
		g.drawString("GAME OVER!", 200, 250);
	} 
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		Demo1 d = new Demo1();
		frame.add(d);
		FrameUtil.initFrame(frame, 600, 600);
	}
}

