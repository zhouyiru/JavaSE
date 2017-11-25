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
菜单组件： 
	菜单条(JMenuBar)  菜单(JMenu)   菜单项(JMenuItem)
	
关系： 菜单条添加菜单 ， 菜单添加菜单项


复选菜单： 菜单添加菜单，  然后菜单再添加菜单项。

*/
public class Notepad {
	
	//窗体
	JFrame frame = new JFrame("记事本");
	
	
	//菜单条
	JMenuBar bar = new JMenuBar();
	
	//菜单
	JMenu fileMenu = new JMenu("文件");
	JMenu editMenu = new JMenu("编辑");
	JMenu helpMenu = new JMenu("帮助");
	
	//菜单项
	JMenuItem open = new JMenuItem("打开");
	JMenuItem save = new JMenuItem("保存");
	JMenuItem copy = new JMenuItem("拷贝");
	
	JMenuItem about = new JMenuItem("关于");
	JMenuItem version = new JMenuItem("升级");
	
	//文本域
	JTextArea area = new JTextArea(20,20); 
	
	
	public void init(){
		//把菜单添加到菜单条上
		bar.add(fileMenu);
		bar.add(editMenu);
		//把菜单项添加到菜单
		fileMenu.add(open);
		fileMenu.add(save);
		/*
		给保存菜单项目添加事件监听器
		 */
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fileDialog = new FileDialog(frame, "请输入保存的文件名", FileDialog.SAVE);
				fileDialog.setVisible(true);
				String path = fileDialog.getDirectory(); // 获取保存文件的路径
				String fileName = fileDialog.getFile(); //获取保存文件的名字
				File file = new File(path,fileName);
				try {
					//获取文本域的内容
					String content = area.getText().replaceAll("\n","\r\n"); // JTextArea的getText方法遇到\r\n的时候只要了\n,把\r给去除。
					
					FileWriter fileWriter 	= new FileWriter(file);
					fileWriter.write(content);
					fileWriter.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		editMenu.add(copy);
		
		//复选菜单， 菜单添加到菜单上。
		editMenu.add(helpMenu);
		//菜单添加菜单项
		helpMenu.add(about);
		helpMenu.add(version);
		

		
		//把菜单条添加到窗体上
		frame.add(bar,BorderLayout.NORTH);
		frame.add(area);
		FrameUtil.initFrame(frame, 500, 600);
	}
	
	public static void main(String[] args) {
		new Notepad().init();
		
	}
	
	
	
	
}
