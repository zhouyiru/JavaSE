package com.code.Menu;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import com.code.util.FrameUtil;
/*
�˵������ 
	�˵���(JMenuBar)  �˵�(JMenu)   �˵���(JMenuItem)
	
��ϵ�� �˵�����Ӳ˵� �� �˵���Ӳ˵���


��ѡ�˵��� �˵���Ӳ˵���  Ȼ��˵�����Ӳ˵��

*/




public class menu {
	
	//����
	JFrame frame = new JFrame("���±�");
	
	
	//�˵���
	JMenuBar bar = new JMenuBar();
	
	//�˵�
	JMenu fileMenu = new JMenu("�ļ�");
	JMenu editMenu = new JMenu("�༭");
	JMenu helpMenu = new JMenu("����");
	
	//�˵���
	JMenuItem open = new JMenuItem("��");
	JMenuItem save = new JMenuItem("����");
	JMenuItem copy = new JMenuItem("����");
	
	JMenuItem about = new JMenuItem("����");
	JMenuItem version = new JMenuItem("����");
	
	
	
	//�ı���
	JTextArea area = new JTextArea(20,20); 
	
	
	public void init(){
		//�Ѳ˵���ӵ��˵�����
		bar.add(fileMenu);
		bar.add(editMenu);
		//�Ѳ˵�����ӵ��˵�
		fileMenu.add(open);
		fileMenu.add(save);
		editMenu.add(copy);
		
		//��ѡ�˵��� �˵���ӵ��˵��ϡ�
		editMenu.add(helpMenu);
		//�˵���Ӳ˵���
		helpMenu.add(about);
		helpMenu.add(version);
		
		
		
		
		//�Ѳ˵�����ӵ�������
		frame.add(bar,BorderLayout.NORTH);
		frame.add(area);
		FrameUtil.initFrame(frame, 500, 600);
	}
	
	public static void main(String[] args) {
		new menu().init();
		
	}
	
	
	
	
}
