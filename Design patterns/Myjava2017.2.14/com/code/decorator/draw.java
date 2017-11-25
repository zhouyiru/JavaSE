package com.code.decorator;
/*
需求：    一家三口都要工作， 儿子工作负责绘画, 妈妈可以在儿子的工作上进行增强---》上涂料， 爸爸的工作就是在妈妈的基础上增强--->上画框 
 */
interface Work{
	public  void work();
}
class Son implements Work{
	@Override
	public void work() {
		System.out.println("在画画...");
	}
}
class  Mother implements Work{
	//在内部维护一个 需要被增强的类
	Work w;  // work w = new Son();

	public Mother(Work w){
		this.w = w;
	}
	@Override
	public void work() {
		w.work();
		System.out.println("妈妈上涂料...");
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
		System.out.println("爸爸上画框...");
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
