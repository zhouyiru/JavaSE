package com.code.Event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 ��������
 
 */
public class mouseListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		//����һ����ť
		JButton button = new JButton("���Ұ�");
		//����ť���һ����������
		/*button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("����ɿ�..");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("��갴��...");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("����뿪...");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("������....");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��굥��....");
			}
		});*/
		
		//  MouseAdapter������  ---- �����Ѿ�ʵ����MouseListener�ӿڣ�����ʵ�ֵķ���ȫ�����ǿ�ʵ�֡�
		button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					System.out.println("˫����...");
				}
			}
		});
		
		
		
		
		frame.add(button);
		FrameUtil.initFrame(frame, 200, 200);
		
	}
}
