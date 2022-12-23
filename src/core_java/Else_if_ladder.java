package core_java;

public class Else_if_ladder {
public static void main(String[] args) {
	int percentage=80;
	
	if (percentage>=70) {
		System.out.println("Distinction");
	}else if (percentage>=60) {
		System.out.println("First class");
	}else if (percentage>=50) {
		System.out.println("Second class");
	}else if (percentage>=35) {
		System.out.println("Third class");
	}else {
		System.out.println("fail");
	}
	
	
	int a=1200,b=3400,c=12000;
	
	if (a>b && b>c) {
		System.out.println("a is greater");
	}else if (b>a && b>c) {
		System.out.println("b is greater");
	}else {
		System.out.println("c is greater");
	}
}
}
