package com.code.overriding;

public class Rect extends Myshap {

	double width;
    double higth;
    Rect(){
    	
    }
    Rect(double width,double higth){
    	this.width=width;
    	this.higth=higth;
    }
    
	double getLen() {
		// TODO Auto-generated method stub
		
		return 2 * (width + higth);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*higth;
	}

}
