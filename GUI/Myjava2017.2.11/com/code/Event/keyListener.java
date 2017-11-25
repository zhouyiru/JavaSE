package com.code.Event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.code.util.FrameUtil;

/*
 键盘监听器
 
 */
public class keyListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("窗体");
		//创建一个按钮
		JButton button = new JButton("点我啊");
		//给按钮添加一个键盘监听器
	/*	button.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(" 键入某个键...");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				 System.out.println("释放键 ...");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				 System.out.println("按下某个键...");
			}
		});*/
		
		button.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				 System.out.println("按下键的字符："+ e.getKeyChar()+" 键的code:"+ e.getKeyCode());
			}
		});
		
		
		
		frame.add(button);
		FrameUtil.initFrame(frame, 200, 200);
	}
	
}
