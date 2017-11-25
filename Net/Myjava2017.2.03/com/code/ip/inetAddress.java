package com.code.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
网络编程： 不需要依赖浏览器进行通讯.  比如：QQ 、 feiQ 、 红蜘蛛  。。。  
 
网页编程： 以html作为基础实现浏览器与服务器之间的通讯。

计算机网络：   分布在不同地域的计算机通过外部设备把计算机链接起来，达到了数据输出、共享资源的目的就称作为一个计算机网络。
  
计算机与计算机的通讯三要素：
  1. IP地址
  2. 端口号
  3. 通讯协议
 
IP地址：   IP地址的本质是有32个二进制位数组成的， 为了方便人类记录，所以把一个ip地址分成了4段， 每段8个二进制数据。 2^8 = 0~255

	192.168.1.10   
IP地址　＝　网络号 + 主机号

IP的类别：
	A类地址：  一个网络号 + 三个主机号     政府
	B类地址： 两个网络号+ 两个主机号      学校、事业单位
	C类地址： 三个网络号 + 一个主机号     


端口号： 端口号的范围：０－６５５３５ ,  从0到1023，它们紧密绑定（binding）于一些服务。   1024 到 65535

常用端口
	21    FTP        
	80    HTTP
	443  HTTPS

 
 通讯协议：
 	Udp 协议
 	tcp 协议

UDP
	将数据极其源和目的封装为数据包，不需要建立连接。
	每个数据包大小限制在64K中
	因为无连接，所以不可靠,数据包会丢失。
	效率高。

比如：物管的对讲机、 feiQ通讯、  cs 。 

TCP 
	面向连接，有特有的通道
	在连接中传输大数据量
	通过三次握手机制连接，可靠协议
	效率低
	
比如： 打电话、 FeiQ文件传输、 

java是面向对象的语言，所以java使用了一个类描述了IP地址。 

InetAddress IP地址类

InetAddress需要掌握的方法：
	
	getLocalHost()      返回本机的IP地址对象。
	getByName(String host)   指定字符串形式的IP地址或者是主机名创建 一个IP地址对象。


	getHostAddress()     返回IP地址字符串的表示形式。 
 	String getHostName()  返回计算机的名字。

	getAllByName(String host) 


 */
public class inetAddress {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress address = InetAddress.getLocalHost();  //获取到本机的IP地址对象。
	
		InetAddress address = InetAddress.getByName("SNZ1SLEC1PUL97S");
		System.out.println("IP ： "+ address.getHostAddress());
		System.out.println("计算机的名字："+ address.getHostName());
		
		InetAddress.getAllByName("http://www.baidu.com");
		
	}
	
}
