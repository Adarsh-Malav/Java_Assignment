package com.oops;

/*
 * constructor: is a special member function whose task is to initialize
 * the object of its class
 * 
 * 1. same name as class name
 * it has no return type
 * it invokes automatically whenever the object is created.
 * 
 *  types of constructor
 *  1.Default
 *  2.parameterized (with parameter)
 *  3.copy (object as argument)
 */

class Sum{
	int a,b;
	public Sum() {
		int x=10;
		int y=20;
		
		a=x;
		b=y;
		// TODO Auto-generated constructor stub
		System.out.println("Sum with default constructor.."+(a+b));
	}
	public Sum(int x,int y) {
		
		a=x;
		b=y;
		// TODO Auto-generated constructor stub
		System.out.println("Sum with parameterized constructor.."+(a+b));
	}
	public Sum(Sum s) {
		a=s.a;
		b=s.b;
		
		System.out.println("Sum with copy constructor.."+(a+b));

	}
	
	
	
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Sum e1= new Sum();

		Sum e2 =new  Sum(100,200);
		
		new Sum(e1);
		new Sum(e2);
		
		
	}
}
