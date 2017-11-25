package com.code.frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 FileDialog(文件对话框)

 构造方法：
 	FileDialog(Dialog parent, String title, int mode) 
	parent : 所有者
	title: 标题
	mode: FileDialog.LOAD(加载) 或 FileDialog.SAVE(保存) 
 */
public class fileDialog {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		FileDialog dialog = new FileDialog(frame, "请打开文件", FileDialog.SAVE);
		//设置显示dialog
		FrameUtil.initFrame(frame, 500, 400);
		dialog.setVisible(true);
		System.out.println("文件的路径：" + dialog.getDirectory());  //获取文件的路径
		System.out.println("文件名："+ dialog.getFile());  //getFile() 获取文件名。
	}

}
