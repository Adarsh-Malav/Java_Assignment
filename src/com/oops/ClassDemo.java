package com.oops;

class Employee{
	int emp_id;
	String nameString;
	String city;
	String degree;
	
	public void setData() {
		emp_id=12;
		nameString="Adarsh Malav";
		city="Surat";
		degree="Btech";
	}
	public void displayData() {
		System.out.println("ID is ... "+emp_id);
		System.out.println("name is ....."+nameString);
		System.out.println("city is ... "+city);
		System.out.println("degree is ... "+degree);
	}
}

public class ClassDemo{
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setData();
	e1.displayData();
}
}
