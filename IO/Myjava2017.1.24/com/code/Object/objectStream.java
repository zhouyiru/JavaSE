package com.code.Object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 ObjectOutputStream(������������)  : ������Ҫ�����ڰѶ�������д�����ļ��ϵġ�
 
 ObjectInputStream��������������� ��  : ��Ӳ���еĶ������ݶ�ȡ������
 
��������������Ҫע���ʵ�֣�
 	1. ʹ��ObjectOutputStream��writeObject����ʱ��ֻ��д��ʵ����Serializable�ӿڵĶ���  ��Serializable  �ӿ�û���κεķ��������ֽӿ����ǳ���Ϊ��ʶ�ӿڡ�
 	2. �������л���ʱ�򴴽������ǲ�����ù��췽���ġ�
	3. ���ǰѶ���д���ļ��ϵ�ʱ���ļ����˼�¼�����һЩ��Ϣ���⣬����¼��class�İ汾�ţ�serialVersionUID���� ����汾��
	��ͨ��һ����������� ������ ����������Աһ�������һ��id�š�	
	4. �ڷ����л���ʱ��jvm��ʹ�ñ���class�ļ����һ��id�����ļ���¼��id�Ž��жԱȣ������һ�£������л�ʧ�ܡ�
	5. ���һ����ĳ�Ա�����ں��ڻᷢ���Ķ�����ô���������л�֮ǰ��ָ��һ��serialVersionUID , ���һ����һ��ָ����һ��serialVersionUID
	��ôjava������򲻻��ټ����class�ļ���serialVersionUID�ˡ� 
	6 . ���һ�����ĳЩ��Ա���뱻���л���Ӳ���ϣ�����ʹ�ùؼ���transient���Ρ� 
	7. ���һ������ڲ�ά��������һ���������ô����һ����Ҳ���� Ҫʵ��Serializable�ӿڡ�
 */
//��ַ��
class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	String country;
	String city;
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
}
//�û���
class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	Address address = new Address("�й�","����");
	String userName;
	int password;
	transient int age;   //  transient  ͸��	
	public User(String userName, int password, int age) {
		this.userName = userName;
		this.password = password;
		this.age =age;
	} 
	@Override
	public String toString() {
		return "�û�����"+this.userName+" ���룺"+ this.password+" ���䣺"+ this.age;
	}
}
public class objectStream {
	public static void main(String[] args) throws Exception {
		writeObj();
		readObj();
	}
	//����ķ����л�-----> ��ȡӲ���еĶ����ڴ��С�
	public static void readObj() throws Exception{
		//�ҵ�Ŀ���ļ�
		File file = new File("f:\\obj.txt");
		//�������ݵ�����������
		FileInputStream fileInputStream = new FileInputStream(file);
		//���������������
	
		@SuppressWarnings("resource")
		ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream);
		//��ȡ���������
		User user = (User) objectInputStream.readObject();  //�����л���ʱ����Ҫ�������� ����������Ҫ����ʲô�� Class�ļ�
		System.out.println("�������Ϣ��"+ user);
	}

	//�Ѷ���д���ļ���------>��������л���
	public static void writeObj() throws IOException{
		User  user = new User("admin",123,18);
		//�ҵ�Ŀ��
		File file = new File("f:\\obj.txt");
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//������������������
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//�Ѷ���д�����������
		objectOutputStream.writeObject(user);	
		//�ر���Դ
		objectOutputStream.close();

	}
}
