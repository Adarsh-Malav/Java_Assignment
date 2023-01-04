package com.oops;

class Parent{
	String pr_name;
	int ph_no;
	public void setParentDetails() {
		pr_name="parent";
		ph_no=99621;
	}
}

class Child1 extends Parent{
	int roll_no;
	String name;
	
	public void setChildDetails() {
		roll_no=23;
		name="child";
	}
	
	public void display() {
		System.out.println("roll no is "+roll_no);
		System.out.println("name is "+pr_name);
		System.out.println("roll no is "+ph_no);
	}
	
}
class Child2 extends Parent{
	int roll_no;
	String name;
	
	public void setChildDetails() {
		roll_no=52;
		name="child2";
	}
	
	public void display() {
		System.out.println("roll no is "+roll_no);
		System.out.println("name is "+pr_name);
		System.out.println("roll no is "+ph_no);
	}
	
}



public class InheritanceDemo2 {
public static void main(String[] args) {
	Child1 o1=new Child1();
	Child2 o2=new Child2();
	o1.setChildDetails();
	o1.setParentDetails();
	o2.setChildDetails();
	o2.setParentDetails();
	o1.display();
	o2.display();
}
}
