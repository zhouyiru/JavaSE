package com.code.Menu;

import java.awt.BorderLayout;

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




public class menu {
	
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
		new menu().init();
		
	}
	
	
	
	
}
