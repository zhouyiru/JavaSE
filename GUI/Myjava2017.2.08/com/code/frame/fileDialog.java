package com.code.frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 FileDialog(�ļ��Ի���)

 ���췽����
 	FileDialog(Dialog parent, String title, int mode) 
	parent : ������
	title: ����
	mode: FileDialog.LOAD(����) �� FileDialog.SAVE(����) 
 */
public class fileDialog {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		FileDialog dialog = new FileDialog(frame, "����ļ�", FileDialog.SAVE);
		//������ʾdialog
		FrameUtil.initFrame(frame, 500, 400);
		dialog.setVisible(true);
		System.out.println("�ļ���·����" + dialog.getDirectory());  //��ȡ�ļ���·��
		System.out.println("�ļ�����"+ dialog.getFile());  //getFile() ��ȡ�ļ�����
	}

}
