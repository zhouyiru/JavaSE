package com.code.decorator;
/*
����    һ�����ڶ�Ҫ������ ���ӹ�������滭, ��������ڶ��ӵĹ����Ͻ�����ǿ---����Ϳ�ϣ� �ְֵĹ�������������Ļ�������ǿ--->�ϻ��� 
 */
interface Work{
	public  void work();
}
class Son implements Work{
	@Override
	public void work() {
		System.out.println("�ڻ���...");
	}
}
class  Mother implements Work{
	//���ڲ�ά��һ�� ��Ҫ����ǿ����
	Work w;  // work w = new Son();

	public Mother(Work w){
		this.w = w;
	}
	@Override
	public void work() {
		w.work();
		System.out.println("������Ϳ��...");
	}
}
class Father implements Work{
	Work w;
	public Father(Work w){
		this.w = w;
	}
	@Override
	public void work() {
		w.work();
		System.out.println("�ְ��ϻ���...");
	}
}
public class draw {
	public static void main(String[] args) {
		Son s = new Son();
		Mother m = new Mother(s);
		Father f  = new Father(m);
		f.work(); 
	}
}
