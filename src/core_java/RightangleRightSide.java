package core_java;

public class RightangleRightSide {
public static void main(String[] args) {
	/*
	 * 
	for (int i = 1; i <=5; i++) {
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	 */
	/*
	 * 1
	 * 01
	 * 101
	 * 0101
	 * 10101
	 *
	 * 1
	 * 23
	 * 456
	 * 78910
	 * 
	 * a
	 * ab
	 * abc
	 * abcd
	 * abcde
	 * 
	 * 1
	 * 11
	 * 121
	 * 1331
	 * 
	 */
	
	
	for (int i = 1; i <=5; i++) {
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}
