package core_java;
/*
 * operator : relational: <,>,<=,>=,==,!=
 * logical operator:      &&,||, !
 * arithmetic operator:   +,-,*,/,% 
 * 
 */
public class Condition1 {
public static void main(String[] args) {
	int i=10;
	if(i>10) {
		System.out.println("greater then 10");
	}
	else {
		System.out.println("not greater then 10");
	}
	
	int year = 1900;
	
	if((year%4==0 && year%100!=0) || year%400==0)
		System.out.println("leap year");
	else {
		System.out.println("not a leap year");
	}
	
	
	
	
	
}
}

