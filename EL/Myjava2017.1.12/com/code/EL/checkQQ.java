package com.code.EL;

public class checkQQ {
	public static void checkQQ1(String qq){
	int len = qq.length();
	if(len>=5 && len <=15)
	{
		if(!qq.startsWith("0"))
		{
			try
			{
				long l = Long.parseLong(qq);
				System.out.println("qq:"+l);
			}		
			catch (NumberFormatException e)
			{
				System.out.println("���ַǷ��ַ�");
			}
		}
		else
			System.out.println("������0��ͷ");
	}
	else
		System.out.println("QQ�ų��ȴ���");
}
	public static void main(String[] args) {
		String str="1234567";
		checkQQ1(str);
		
	}
}
