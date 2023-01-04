package com.oops;
/*
 * jagged.ragged array is same as 2 d array
 * 
 * 12345
 * 1234
 * 12
 * 
 * no of column is not fixed
 * at the time of initialization column should be empty
 */
public class JaggedArrayDemo {
public static void main(String[] args) {
	int a[][]=new int[3][];
	
	a[0]=new int[5];
	a[1]=new int[4];
	a[2]=new int[2];
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=j+1;
			System.out.print(" "+a[i][j]);
			
		}
		System.out.println();
	}
}
}
