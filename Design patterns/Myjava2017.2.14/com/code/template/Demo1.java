package com.code.template;

/*
ģ�����ģʽ : �����ڽ��ĳ�������ʱ����Щ�����ǹ̶��ģ�
		        ��Щ�����ǲ��̶��ģ���ʱ�����������ʹ��ģ�����ģʽ

���� ��дһ�������������ʱ���ģ�塣

ģ�����ģʽ�Ĳ��裺
	1. ��д����������������е�һ�����������
	2. �������룬�ѻᷢ���仯�Ĵ����ȡ����������һ������,Ȼ���ٰѸ÷���������һ������ķ�����
	3. �����Ҫʹ��ģ���ֻ࣬��Ҫ�̳м���ʹ�á�
	
*/
abstract class Runtime{
	
	public final void getRunTime(){
		long startTime = System.currentTimeMillis();	//��������֮ǰ��¼��ǰ��ϵͳʱ��
		code();
		long endTime  = System.currentTimeMillis();  //�������к��ʱ��
		System.out.println("���������ʱ�䣺"+ (endTime-startTime));
	}
	
	public abstract  void  code();
}


public class Demo1 extends Runtime {

	public static void main(String[] args) {
		Demo1 d= new Demo1();
		d.getRunTime();
	}

	
	
	@Override
	public void code() {
		int i = 0 ; 
		while(i<100){
			System.out.println("i="+ i);
			i++;
		}
	}
	
	

}
