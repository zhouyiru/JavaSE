package com.code.overriding;

public class Address {

	String country;
	String city;
	String street;
	
	Address(){
	
	}
	Address(String country,String city,String street){
		this.country=country;
		this.city=city;
		this.street=street;
	}
	
	String print(){
		return "��ַ��"+country+" "+"���У�"+city+"  �ֵ���"+street;
	}

}
