package com.code.Event;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

/*
 �¼��� ��ĳ�����������ָ���Ķ����£�������Ӧ�Ĵ�������
 
 �¼���
 	�¼�Դ   ��  ������   �� 	 �¼�  ��  ����ʽ 

������������ ����������������������Ϳո������������ �ġ�
 */

public class actionListener {

	public static void main(String[] args) {
		//��������
		JFrame frame = new JFrame("����");
		//����һ����ť
		JButton button = new JButton("���Ұ�");
		//����ť���һ��������
		button.addActionListener(new ActionListener() {
			
			//�����������������¿ո���ͻ����actionPerformed����
			public void actionPerformed(ActionEvent e) {  // ActionEvent �¼�..
				JButton button = (JButton) e.getSource(); //��ȡ�¼�Դ����
				String content = button.getText();
				if("���Ұ�".equals(content)){
					button.setText("�����ɣ�");
				}else{
					button.setText("���Ұ�");
				}
				
			}
		});
		
		frame.add(button);
		
		FrameUtil.initFrame(frame, 200,200);
		
		
	}
	
}
