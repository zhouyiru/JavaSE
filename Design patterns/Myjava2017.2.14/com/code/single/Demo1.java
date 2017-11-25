package com.code.single;
/*
 �������ģʽ��  ��֤һ�����ڴ���ֻ����һ������
 
 �����������ģʽ: 
 
 
 �����������ģʽ��������һ���̰߳�ȫ���⣩
 	1. ˽�л����캯����
 	2. ����������������ͱ��������ǲ���������
 	3. �ṩ һ��������̬�ķ�����ȡ����Ķ��󣬻�ȡ֮ǰ���ж��Ƿ��Ѿ������˱���Ķ�������Ѿ�������ֱ�ӷ��ؼ��ɣ������û��
 	��������ô�ȴ�������Ķ���Ȼ���ٷ��ء�
 */

class Single{
	
	//����������������ͱ��������ǲ���������
	private static Single s = null;
	 
	//˽�л����캯��
	private Single(){}
	
	public static Single getInstance(){
		if(s==null){
			synchronized ("��") {
				if(s==null){
					s =  new Single();
				}
			}
		}
		return s;
		
	}
	
}

public class Demo1 {

}
