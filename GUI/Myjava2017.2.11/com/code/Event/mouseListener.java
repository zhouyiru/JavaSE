package com.code.Event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 鼠标监听器
 
 */
public class mouseListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		//创建一个按钮
		JButton button = new JButton("点我啊");
		//给按钮添加一个鼠标监听器
		/*button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("鼠标松开..");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("鼠标按下...");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("鼠标离开...");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("鼠标进入....");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标单击....");
			}
		});*/
		
		//  MouseAdapter适配器  ---- 该类已经实现了MouseListener接口，但是实现的方法全部都是空实现。
		button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					System.out.println("双击了...");
				}
			}
		});
		
		
		
		
		frame.add(button);
		FrameUtil.initFrame(frame, 200, 200);
		
	}
}
