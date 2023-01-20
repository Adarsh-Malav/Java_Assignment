package com.oops;

abstract class demo{
	String name;
	int age;
	long phone;
	
	abstract public void set(); 
	
	public void display() {
		System.out.println(name +" "+age+" "+phone);
		
	}
	
}

class demo1 extends demo{
	@Override
	public void set() {
		name="adarsh";
		age=24;
		phone=9962146456l;
	}
}	

public class AbastractKeyword {
public static void main(String[] args) {
	demo1 oDemo1 = new demo1();
	oDemo1.set();
	oDemo1.display();
}
}
