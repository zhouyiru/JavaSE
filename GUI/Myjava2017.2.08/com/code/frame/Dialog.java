package com.code.frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.code.util.FrameUtil;
/*
Dialog(对话框)
	Dialog(Dialog owner, String title, boolean modal) 
	owner  所有者
	title: 对话框的标题
	modal: 模式  true: 对话框没有关闭的时候，不准操作所有者。   false: 对话框即使没有关闭，还是可以操作所有者

JOptionPane(对话框)

	//消息、 警告、 错误
	showMessageDialog(Component parentComponent, Object message, String title, int messageType) 
	
	parentComponent: 所有者
	message : 显示的消息
	title ： 对话框的标题 
	messageType : 指定对话框的类型 （消息、 警告、 错误）
 */

public class Dialog {

	public static void main(String[] args) {
		//创建一个窗体
		JFrame frame = new JFrame("窗体");
		//创建一个对话框
		/*JDialog dialog = new JDialog(frame,"对话框",false);
		FrameUtil.initFrame(frame, 500,400);
		dialog.setBounds(580, 250, 200, 200);
		dialog.setVisible(true);*/
		
		FrameUtil.initFrame(frame, 500,400);
		//JOptionPane.showMessageDialog(frame, "明天放假了！爽！！","通知:",JOptionPane.INFORMATION_MESSAGE);  //消息对话框
//		 JOptionPane.showMessageDialog(frame, "别在嫌我丑了","警告:",JOptionPane.WARNING_MESSAGE);   //警告对话框
//		JOptionPane.showMessageDialog(frame, "别睡觉了..","出局:",JOptionPane.ERROR_MESSAGE);   //错误对话框
		
		//确认对话框
		/*int num = JOptionPane.showConfirmDialog(frame, "软件继续安装吗?");
		System.out.println("num:"+ num);
		*/
		
		//输入对话框
		String money = JOptionPane.showInputDialog(frame,"请输入你要取的金额：");
		System.out.println("money："+ money);
	}
	
}
