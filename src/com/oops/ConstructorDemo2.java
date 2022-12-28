package com.oops;
class Box{
	int width,height,depth;
	
	public Box() {
		// TODO Auto-generated constructor stub
		int w=10;
		int d=20;
		int h=30;
		
		width=w;
		height=h;
		depth=d;
		
		System.out.println("in default constructor");
	}
	
	public Box(int w,int h,int d) {
		

		width=w;
		height=h;
		depth=d;
		
		System.out.println("int parameterized constructor");
	}
	
	public Box(Box s) {
		
		width=s.width;
		height=s.height;
		depth=s.depth;

		System.out.println("in copy Constructor");
	}
	public void volumeOfBox() {
		
		System.out.println("Volume is "+(width*height*depth));
	}
}
public class ConstructorDemo2 {
public static void main(String[] args) {
	Box e1 = new Box();
	e1.volumeOfBox();
	Box e2= new Box(15,20,30);
	e2.volumeOfBox();
	
	Box e3=new Box(e2);
	e3.volumeOfBox();
	
	
}
}
