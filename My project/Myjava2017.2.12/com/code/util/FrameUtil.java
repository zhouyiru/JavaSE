package com.code.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

//ͼ�λ�����Ĺ�����
public class FrameUtil {

	//���ô���������м�λ��
	public static void initFrame(JFrame frame,int width,int height){
		//��ȡĬ��ϵͳ���߰�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//��ȡ��Ļ�ķֱ��ʡ�
		Dimension  d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		//���ô���Ŀɼ���
		frame.setVisible(true);
		//���ô���ر�ʱ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
