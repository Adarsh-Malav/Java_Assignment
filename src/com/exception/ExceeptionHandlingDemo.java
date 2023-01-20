package com.exception;

import java.util.Scanner;

/*
 * Exception handling  : Error Handling
 * any abnormal behavior
 * types of exception
 * compile time(checked) : , ; spelling mistake ,wrong syntax.. etc
 * run time(unchecked) : / by zero arithmetic exception ,array out of bound ,number format,etc
 * error: same as runtime, mistake by developer
 * Exception is the root class for all exception class
 * 
 * there are mainly 5 keywords used to handle exception
 * try : it handles the error
 * if you except any error from a certain code then code must be in try catch
 * ----if we don't handle exception the remaining from the error part will skip
 * ----try block can be followed with finally or catch or both
 * ----try block will throw the exception to the catch
 * ----try will used one time only, catch can be used multiple time
 * catch : it will handle the exception by exception class
 * finally
 * throw
 * throws
 * 
 * 
 */
public class ExceeptionHandlingDemo {
public static void main(String[] args) {
	try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a=scanner.nextInt();
		System.out.println("Enter the number 2");
		int b=scanner.nextInt();
		scanner.close();
		System.out.println("result is..."+(a/b));
		System.out.println("program is success");
	} catch (ArithmeticException e) {
		System.out.println(e);
		e.printStackTrace();	
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
		e.printStackTrace();	
	}
	
	System.out.println("hello adarsh");
	
}	

}
