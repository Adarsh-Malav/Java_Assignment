package com.oops;
/*
 * Encapsulation : Wrapping of data
 * 
 * 
 * access specifier
 * 
 * Private : only father has code                          only data members and member methods
 * -->only within the class
 * Default : all family member has code						class,data members,member methods
 * -->same package
 * Protected : all family member and some relative			data members,member methods
 * -->different package but need to inherit
 * Public : Accessible everywhere							class,data members,member methods
 * -->you share the code in social media
 */

class temp1{
	private int roll_no=23;
	
	public void setvalue() {                      //wrapping of private data member
		System.out.println(roll_no);
	}
}
public class EncapsulationDemo {
public static void main(String[] args) {
	temp1 o1=new temp1();
	o1.setvalue();
}
}
