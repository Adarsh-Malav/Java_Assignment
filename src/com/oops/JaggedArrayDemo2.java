package com.oops;

import java.util.Scanner;

public class JaggedArrayDemo2 {
public static void main(String[] args) {
int a[][]=new int[5][];
	
	a[0]=new int[5];
	a[1]=new int[4];
	a[2]=new int[6];
	a[3]=new int[3];
	a[4]=new int[8];
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the numbers");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=scanner.nextInt();
			
		}
	}
	scanner.close();
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
	
}
}
