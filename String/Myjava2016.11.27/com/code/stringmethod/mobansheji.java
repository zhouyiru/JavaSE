package com.code.stringmethod;

abstract class runtime{
	public final void getruntime() { long starttime=System.currentTimeMillis();
		code();
		long endtime=System.currentTimeMillis();
		System.out.println("ϵͳ����ʱ���ǣ�"+(endtime-starttime));
	}


	public abstract void code();

}

public class mobansheji extends runtime{

	public static void main(String[] args) {
		mobansheji m=new mobansheji(); 
		m.getruntime(); 
		} 
	@Override public void code() { 
		// TODO Auto-generated method stub
			for(int i=0;i<100;i++){
				System.out.println("i="+i);
			}
		}
}
