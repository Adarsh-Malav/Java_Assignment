package com.oops;

import java.util.Scanner;

/*
 * Array : Stores multiple value in a single variable of specific type
 * 1 2 3
 * 
 * starts from index zero
 * value stored : index-1
 * 
 *  types of Array : 
 *  1 D : for loop
 *  2 D : for(){
 *  	for(){
 *  	}
 *    }		
 *    
 * int,char
 *  
 */
public class ArrayDemo1 {
public static void main(String[] args) {
	int []a = new int[5]; //java pattern;
	
	int b[]= new int[5]; //c++ pattern;
	
	for (int i = 0; i < 5; i++) {
		a[i]=i;
		System.out.println(a[i]);
	}
	
	Scanner scanner= new Scanner(System.in);
	for (int i = 0; i < 5; i++) {
		System.out.println("enter value");
		b[i]=scanner.nextInt();
	}
	scanner.close();
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}

}
