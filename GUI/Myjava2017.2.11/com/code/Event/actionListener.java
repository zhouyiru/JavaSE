package com.code.Event;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 事件： 当某个组件发生了指定的动作事，会有相应的处理方案。
 
 事件：
 	事件源   、  监听器   、 	 事件  、  处理方式 

动作监听器： 动作监听器对于鼠标点击、和空格键都是起作用 的。
 */

public class actionListener {

	public static void main(String[] args) {
		//创建窗体
		JFrame frame = new JFrame("窗体");
		//创建一个按钮
		JButton button = new JButton("点我啊");
		//个按钮添加一个监听器
		button.addActionListener(new ActionListener() {
			
			//如果发生鼠标点击、按下空格键就会调用actionPerformed方法
			public void actionPerformed(ActionEvent e) {  // ActionEvent 事件..
				JButton button = (JButton) e.getSource(); //获取事件源对象
				String content = button.getText();
				if("点我啊".equals(content)){
					button.setText("点他吧！");
				}else{
					button.setText("点我啊");
				}
				
			}
		});
		
		frame.add(button);
		
		FrameUtil.initFrame(frame, 200,200);
		
		
	}
	
}
