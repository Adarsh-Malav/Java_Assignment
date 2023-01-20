package com.common_cls;

/*
 * object class : is the root class for all the java class
 * it has many properties that can be used for system defined or used defined class
 * 
 */
class Dog{    //extend object is by default 
	public void bark() {
		
	}
}
public class ObjectClassDemo {
public static void main(String[] args) {
	Object o1=new Object();
	Object o2=new Object();
	String s1="Tops";
	o1="tops";
	o2=6.56;  // can take any data type
	
	if(o1.equals(s1)) {
		System.out.println("true");
	}	else {
			System.out.println("false");
		}
	if(o2.toString()=="6.56") {
		System.out.println("same");
	}
	else {
		System.out.println("not same");
	}
	
	
}
}
