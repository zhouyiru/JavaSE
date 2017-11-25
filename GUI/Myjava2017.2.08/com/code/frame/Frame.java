package com.code.frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
/*
 ����Ľ�����ʽ��
 	1. dos����Ľ�����ʽ��
 	2. ͼ�λ�����Ľ�����ʽ
 
 ��java��ͼ�λ��������а����� ��ͼ���඼����Ϊ����ࡣ
 
 ����ͼ������඼��λ�ڣ� java.awt �� javax.swing ����
 	��awt���д���ͼ���࣬��swingһ������ڣ���������swing��ͼ�ζ�����J��ͷ�ġ�
 
 
java.awt����ͼ������javax.swing ����ͼ���������
	1. java.awt���е�����ͼ�����ͼ�ζ�������ϵͳ��ͼ�ο�ġ�javax.swing�е�ͼ�����ͼ�ζ���sun�Լ�ȥʵ�ֵġ�
	
 ���е�ͼ���඼����Ϊ�����
				�������
				���������
 */


public class Frame {

	public static void main(String[] args) {
		//������һ���������
		JFrame frame = new JFrame("����ҵ�һ���������");
		//���ô���Ĵ�С(����Ϊ��λ)
//		frame.setSize(300, 400);
		//���ô������Ͻǳ��ֵ�λ��
		//frame.setBounds((1366-300)/2, (768-400)/2, 300, 400);
		
		initFrame(frame, 300, 400);
		//���ô���Ŀɼ���
		frame.setVisible(true);
		//���ô���Ĺر��¼�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	//���ô���������м�λ��
	public static void initFrame(JFrame frame,int width,int height){
		//��ȡĬ��ϵͳ���߰�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//��ȡ��Ļ�ķֱ��ʡ�
		Dimension  d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		
	}
	
}
