package com.code.frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.code.util.FrameUtil;
/*
Dialog(�Ի���)
	Dialog(Dialog owner, String title, boolean modal) 
	owner  ������
	title: �Ի���ı���
	modal: ģʽ  true: �Ի���û�йرյ�ʱ�򣬲�׼���������ߡ�   false: �Ի���ʹû�йرգ����ǿ��Բ���������

JOptionPane(�Ի���)

	//��Ϣ�� ���桢 ����
	showMessageDialog(Component parentComponent, Object message, String title, int messageType) 
	
	parentComponent: ������
	message : ��ʾ����Ϣ
	title �� �Ի���ı��� 
	messageType : ָ���Ի�������� ����Ϣ�� ���桢 ����
 */

public class Dialog {

	public static void main(String[] args) {
		//����һ������
		JFrame frame = new JFrame("����");
		//����һ���Ի���
		/*JDialog dialog = new JDialog(frame,"�Ի���",false);
		FrameUtil.initFrame(frame, 500,400);
		dialog.setBounds(580, 250, 200, 200);
		dialog.setVisible(true);*/
		
		FrameUtil.initFrame(frame, 500,400);
		//JOptionPane.showMessageDialog(frame, "����ż��ˣ�ˬ����","֪ͨ:",JOptionPane.INFORMATION_MESSAGE);  //��Ϣ�Ի���
//		 JOptionPane.showMessageDialog(frame, "�������ҳ���","����:",JOptionPane.WARNING_MESSAGE);   //����Ի���
//		JOptionPane.showMessageDialog(frame, "��˯����..","����:",JOptionPane.ERROR_MESSAGE);   //����Ի���
		
		//ȷ�϶Ի���
		/*int num = JOptionPane.showConfirmDialog(frame, "���������װ��?");
		System.out.println("num:"+ num);
		*/
		
		//����Ի���
		String money = JOptionPane.showInputDialog(frame,"��������Ҫȡ�Ľ�");
		System.out.println("money��"+ money);
	}
	
}
