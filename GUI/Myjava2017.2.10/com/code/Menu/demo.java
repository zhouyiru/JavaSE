package com.code.Menu;


import javax.swing.*;

import com.code.util.FrameUtil;

/*
 ���������
 
 */
public class demo {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("ע��");
		//����һ�����
		JPanel panel = new JPanel();
		//����һ����ǩ����
		JLabel nameLabel = new JLabel("�û���:");
		//�����
		JTextField nameField = new JTextField(12);
		//�����������
		panel.add(nameLabel);
		panel.add(nameField);
		
		//����
		JLabel passLabel = new JLabel("����:");
		//�����
		JPasswordField passField = new JPasswordField(12);
		panel.add(passLabel);
		panel.add(passField);
		
		//�Ա�  ��ѡ��
		JLabel sexLabel = new JLabel("�Ա�:");
		
		//��ѡ��    ע�⣺ ��ѡ��һ��Ҫ���з��飬��ͬһ��ĵ�ѡ����ֻ��ѡ�����е�һ����
		JRadioButton man = new JRadioButton("��", true);
		JRadioButton woman = new JRadioButton("Ů");
		//����
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);
		
		panel.add(sexLabel);
		panel.add(man);
		panel.add(woman);
		
		//���� --- ������
		JLabel cityLabel = new JLabel("���Եĳ���");
		Object[] citys = {"����","�Ϻ�","����","����"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox cityBox = new JComboBox(citys);
		panel.add(cityLabel);
		panel.add(cityBox);
		
		//����---��ѡ��
		JLabel hobitLabel = new JLabel("����");
		JCheckBox java  = new JCheckBox("java");
		JCheckBox javascript  = new JCheckBox("javascript");
		JCheckBox write  = new JCheckBox("��java");
		
		panel.add(hobitLabel);
		panel.add(java);
		panel.add(javascript);
		panel.add(write);
		
		
		//���Ҽ��
		JLabel introLabel = new JLabel("���Ҽ��:");
		JTextArea area = new JTextArea(15, 15);
		panel.add(introLabel);
		panel.add(area);
		
		
		frame.add(panel);
		FrameUtil.initFrame(frame, 830, 500);
		
		
		
	}

}
