package com.code.Event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.code.util.FrameUtil;

/*
 ���̼�����
 
 */
public class keyListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("����");
		//����һ����ť
		JButton button = new JButton("���Ұ�");
		//����ť���һ�����̼�����
	/*	button.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(" ����ĳ����...");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				 System.out.println("�ͷż� ...");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				 System.out.println("����ĳ����...");
			}
		});*/
		
		button.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				 System.out.println("���¼����ַ���"+ e.getKeyChar()+" ����code:"+ e.getKeyCode());
			}
		});
		
		
		
		frame.add(button);
		FrameUtil.initFrame(frame, 200, 200);
	}
	
}
