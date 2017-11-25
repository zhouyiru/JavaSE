package com.code.debug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 debug调试： 可以让程序运行到断点的时候停止运行，然后查看当前变量或者是对象的数据。 方便我们分析错误。 
 
 step over(F6)  跳过本本条语句，进入下一个语句
 step  into(f5) 进入到指定的方法内部查看.
 step return :   结束当前方法。
 
 */

public class Demo1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("张三", "小红");
		map.put("李四", "小青");
		map.put("王五", "小白");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String  key =  it.next();
			System.out.println("键："+key+" 值："+ map.get(key));
		}
	
	
	}
	
}
