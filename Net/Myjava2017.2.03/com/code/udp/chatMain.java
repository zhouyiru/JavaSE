package com.code.udp;

public class chatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    chatReceive c = new chatReceive();
    chatSender s = new chatSender();
    c.start();
    s.start();
	}

}
