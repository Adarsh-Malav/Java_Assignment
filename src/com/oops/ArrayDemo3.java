package com.oops;

import java.util.Scanner;

public class ArrayDemo3 {
public static void main(String[] args) {
	int [][]a=new int[3][3];
	int [][]b=new int[3][3];
	int [][]c=new int[3][3];


	Scanner scanner=new Scanner(System.in);
	System.out.println("Start array of a:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter a["+i+"]["+j+"]=");
			a[i][j]=scanner.nextInt();
		}
	}
	
	System.out.println("Start array of b:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter b["+i+"]["+j+"]=");
			b[i][j]=scanner.nextInt();
		}
	}
	
	scanner.close();
	
	System.out.println("Start sum of array :");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(" "+c[i][j]);
		}
		System.out.println();
	}
	
}
}
