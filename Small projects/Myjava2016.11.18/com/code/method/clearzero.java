package com.code.method;
import java.util.*;
public class clearzero {


/*
3. ���������µ�һ�����飺int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ��
Ҫ�����������Ϊ0��Ԫ�أ�Ȼ��洢��������ݴ洢��һ���������С�����Ҫ���µ����鲻���˷ѳ��ȡ�

*/
	public static void main(String[] args) 
	{
		int oldArr[]={0,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

		int[] newArr = clearZero(oldArr);
		System.out.println("�������Ԫ�أ�"+ Arrays.toString(newArr));
	}
//
	


	public static int[] clearZero(int[] oldArr){
		//��ͳ��0�ĸ���
		int count = 0; //����ñ������ڼ�¼0�ĸ���
		for(int i = 0 ; i<oldArr.length ; i++){
			if(oldArr[i]==0){
				count++;
			}
		}
		//�����µ�����
		int[] newArr = new int[oldArr.length-count];

		
		int index = 0; //������ʹ�õ�����ֵ��

		//�����ɵ����飬�ѷ�0�����ݴ洢���������С�
		for(int i = 0 ; i<oldArr.length ; i++){
			if(oldArr[i]!=0){ //����Ƿ�0�����ݣ���Ӧ�ô洢���µ�������.
				newArr[index++] = oldArr[i];
			}
		}

		return newArr;
	}
}


