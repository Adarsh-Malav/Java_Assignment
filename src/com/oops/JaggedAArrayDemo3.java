package com.oops;

import java.util.Scanner;

public class JaggedAArrayDemo3 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int r=scanner.nextInt();
	
	int [][]a = new int[r][];
	for (int i = 0; i < r; i++) {
			System.out.println("Enter the number of column");
			a[i]=new int[scanner.nextInt()];
		
	}
	
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("Enter the value");
			a[i][j]=scanner.nextInt();
		}
	}
	scanner.close();
	
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	


}	
}
