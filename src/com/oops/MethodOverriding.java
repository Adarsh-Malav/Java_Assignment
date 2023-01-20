package com.oops;

class First{
	
	int a =10;
	public First() {
		System.out.println("First class constructor");
	}
	public void display() {
		System.out.println("first class method "+ a);
	}
}

class Second extends First{
	int a =20;
	public Second() {
		System.out.println("Second class constructor");
	}
	public void display() {
		super.display();
		System.out.println("second class method "+super.a);
	}
}
class Third extends Second{
	int a = 30;
	
	public Third() {
		System.out.println("Third class constructor");
	}
	public void display() {
		super.display();
		System.out.println("Third class method "+super.a);
	}
}


public class MethodOverriding {
public static void main(String[] args) {
	Third obj = new Third();
	obj.display();
	
			
}
}
