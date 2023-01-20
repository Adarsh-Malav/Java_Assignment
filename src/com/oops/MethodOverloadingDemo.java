package com.oops;
/*
 * function : does something
 * type :
 * 1. function define : curly bracket will come
 * 2.function call
 * 
 * types of function
 * no argument,no return type
 * argument,no return type
 * no argument,return type
 * argument,return type
 */
class Addition{
	int a,b;
	
	
	//Second type
	
	public void sum(int x,int y) {
		a=x;
		b=y;
		System.out.println("sum is..."+(a+b));
	}
	//third type
	
	public int sum() {
		int x=12;
		int y=14;
		a=x;
		b=y;
		return(a+b);
	}
	
	//forth type
	
	public int sum(int x) {
		a=b=x;
		return(a+b);
		
	}
	public void sum(float x) {
		a=b=(int)x;
		
		System.out.println("sum is..."+(a+b));
	}
}

public class MethodOverloadingDemo {
public static void main(String[] args) {
	Addition o1=new Addition();
	System.out.println("sum is..."+o1.sum());
	System.out.println("sum is..."+o1.sum(15));
	o1.sum(13,14);
	o1.sum(9.9f);
}
}
