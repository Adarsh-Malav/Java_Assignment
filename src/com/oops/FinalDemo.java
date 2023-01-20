package com.oops;

 class DemoOne{
	final long mobile_no=9962146456l;
	 // mobile_no=99621464567;
	String name;
	
	final public  void setName() {
		name="Adarsh";
	}
	
	
	public void display() {
		System.out.println("mobile number is "+mobile_no);
		System.out.println("name is "+name);
	}
}

class DemoTwo extends DemoOne{
	 final long  mobile_no=9962146457l;
	 
	 public final void setDisplay() {
		 System.out.println(mobile_no);
	 }
	 
}

public class FinalDemo {
public static void main(String[] args) {
	DemoTwo e1=new DemoTwo();
	e1.setName();
	e1.setDisplay();
}
}
