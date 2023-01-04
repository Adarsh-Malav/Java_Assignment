package com.oops;

import java.util.Scanner;
/*
 * private:only in class
 * 
 * 
 */
class Student1{
	int roll_no;
	String name;
	Scanner scanner=new Scanner(System.in);
	
	public void setStudent(){
		System.out.println("Enter roll no...");
		roll_no=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter name...");
		name=scanner.next();
	}
}

class Sport extends Student1{			//single level
	int sport_mark=56;
	
	public void display() {
		System.out.println("roll no is.."+roll_no);
		System.out.println("name is..."+name);
		System.out.println("sports mark is..."+sport_mark);
	}
}

class Result extends Sport{				//Multilevel
	String gradeString="A";
	public void display() {
	
		System.out.println("roll no is.."+roll_no);
		System.out.println("name is..."+name);
		System.out.println("sports mark is..."+sport_mark);
		System.out.println("Grade is..."+gradeString);
	}
}

public class InheritanceDemo {
public static void main(String[] args) {
	Result s1=new Result();
	s1.setStudent();
	s1.display();
}
}
