package com.code.Menu;


import javax.swing.*;

import com.code.util.FrameUtil;

/*
 非容器组件
 
 */
public class demo {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("注册");
		//创建一个面板
		JPanel panel = new JPanel();
		//创建一个标签对象
		JLabel nameLabel = new JLabel("用户名:");
		//输入框
		JTextField nameField = new JTextField(12);
		//把组件添加面板
		panel.add(nameLabel);
		panel.add(nameField);
		
		//密码
		JLabel passLabel = new JLabel("密码:");
		//密码框
		JPasswordField passField = new JPasswordField(12);
		panel.add(passLabel);
		panel.add(passField);
		
		//性别：  单选框
		JLabel sexLabel = new JLabel("性别:");
		
		//单选框    注意： 单选框一定要进行分组，在同一组的单选框中只能选择其中的一个。
		JRadioButton man = new JRadioButton("男", true);
		JRadioButton woman = new JRadioButton("女");
		//分组
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);
		
		panel.add(sexLabel);
		panel.add(man);
		panel.add(woman);
		
		//城市 --- 下拉框
		JLabel cityLabel = new JLabel("来自的城市");
		Object[] citys = {"北京","上海","广州","深圳"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox cityBox = new JComboBox(citys);
		panel.add(cityLabel);
		panel.add(cityBox);
		
		//爱好---复选框
		JLabel hobitLabel = new JLabel("爱好");
		JCheckBox java  = new JCheckBox("java");
		JCheckBox javascript  = new JCheckBox("javascript");
		JCheckBox write  = new JCheckBox("敲java");
		
		panel.add(hobitLabel);
		panel.add(java);
		panel.add(javascript);
		panel.add(write);
		
		
		//自我简介
		JLabel introLabel = new JLabel("自我简介:");
		JTextArea area = new JTextArea(15, 15);
		panel.add(introLabel);
		panel.add(area);
		
		
		frame.add(panel);
		FrameUtil.initFrame(frame, 830, 500);
		
		
		
	}

}
