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
		return "地址："+country+" "+"城市："+city+"  街道："+street;
	}

}
