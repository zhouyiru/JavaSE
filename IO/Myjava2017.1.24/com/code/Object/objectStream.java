package com.code.Object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 ObjectOutputStream(对象的输出流类)  : 该类主要是用于把对象数据写出到文件上的。
 
 ObjectInputStream（对象的输入流类 ）  : 把硬盘中的对象数据读取回来。
 
对象的输入输出流要注意的实现：
 	1. 使用ObjectOutputStream的writeObject方法时候，只能写出实现了Serializable接口的对象  。Serializable  接口没有任何的方法，这种接口我们称作为标识接口。
 	2. 对象反序列化的时候创建对象是不会调用构造方法的。
	3. 我们把对象写到文件上的时候，文件除了记录对象的一些信息以外，还记录了class的版本号（serialVersionUID）， 这个版本号
	是通过一个类的类名、 包名、 工程名、成员一起算出的一个id号。	
	4. 在反序列化的时候，jvm会使用本地class文件算出一个id号与文件记录的id号进行对比，如果不一致，反序列化失败。
	5. 如果一个类的成员可能在后期会发生改动，那么可以在序列化之前就指定一个serialVersionUID , 如果一个类一家指定了一个serialVersionUID
	那么java虚拟机则不会再计算该class文件的serialVersionUID了。 
	6 . 如果一个类的某些成员不想被序列化到硬盘上，可以使用关键字transient修饰。 
	7. 如果一个类的内部维护了另外一个类对象，那么另外一个类也必须 要实现Serializable接口。
 */
//地址类
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
//用户类
class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	Address address = new Address("中国","广州");
	String userName;
	int password;
	transient int age;   //  transient  透明	
	public User(String userName, int password, int age) {
		this.userName = userName;
		this.password = password;
		this.age =age;
	} 
	@Override
	public String toString() {
		return "用户名："+this.userName+" 密码："+ this.password+" 年龄："+ this.age;
	}
}
public class objectStream {
	public static void main(String[] args) throws Exception {
		writeObj();
		readObj();
	}
	//对象的反序列化-----> 读取硬盘中的对象到内存中。
	public static void readObj() throws Exception{
		//找到目标文件
		File file = new File("f:\\obj.txt");
		//建立数据的输入流对象
		FileInputStream fileInputStream = new FileInputStream(file);
		//建立对象的输入流
	
		@SuppressWarnings("resource")
		ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream);
		//读取对象的数据
		User user = (User) objectInputStream.readObject();  //反序列化的时候需要创建对象， 创建对象需要依赖什么？ Class文件
		System.out.println("对象的信息："+ user);
	}

	//把对象写到文件上------>对象的序列化。
	public static void writeObj() throws IOException{
		User  user = new User("admin",123,18);
		//找到目标
		File file = new File("f:\\obj.txt");
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//建立对象的输出流对象
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//把对象写出到输出流中
		objectOutputStream.writeObject(user);	
		//关闭资源
		objectOutputStream.close();

	}
}
