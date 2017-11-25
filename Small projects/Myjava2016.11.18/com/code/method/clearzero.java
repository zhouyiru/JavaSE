package com.code.method;
import java.util.*;
public class clearzero {


/*
3. 现在有如下的一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ，
要求清除数组中为0的元素，然后存储非零的数据存储到一个新数组中。而且要求新的数组不能浪费长度。

*/
	public static void main(String[] args) 
	{
		int oldArr[]={0,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

		int[] newArr = clearZero(oldArr);
		System.out.println("新数组的元素："+ Arrays.toString(newArr));
	}
//
	


	public static int[] clearZero(int[] oldArr){
		//先统计0的个数
		int count = 0; //定义该变量用于记录0的个数
		for(int i = 0 ; i<oldArr.length ; i++){
			if(oldArr[i]==0){
				count++;
			}
		}
		//创建新的数组
		int[] newArr = new int[oldArr.length-count];

		
		int index = 0; //新数组使用的索引值。

		//遍历旧的数组，把非0的数据存储到新数组中。
		for(int i = 0 ; i<oldArr.length ; i++){
			if(oldArr[i]!=0){ //如果是非0的数据，就应该存储到新的数组中.
				newArr[index++] = oldArr[i];
			}
		}

		return newArr;
	}
}


