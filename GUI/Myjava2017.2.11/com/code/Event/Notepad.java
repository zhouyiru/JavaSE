package com.code.Event;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class Notepad {
	
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
		/*
		������˵���Ŀ����¼�������
		 */
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fileDialog = new FileDialog(frame, "�����뱣����ļ���", FileDialog.SAVE);
				fileDialog.setVisible(true);
				String path = fileDialog.getDirectory(); // ��ȡ�����ļ���·��
				String fileName = fileDialog.getFile(); //��ȡ�����ļ�������
				File file = new File(path,fileName);
				try {
					//��ȡ�ı��������
					String content = area.getText().replaceAll("\n","\r\n"); // JTextArea��getText��������\r\n��ʱ��ֻҪ��\n,��\r��ȥ����
					
					FileWriter fileWriter 	= new FileWriter(file);
					fileWriter.write(content);
					fileWriter.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
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
		new Notepad().init();
		
	}
	
	
	
	
}
