package core_java;


/*
 * 12345
 * 12345
 * 12345
 * 12345
 */
 
public class Pattern {
public static void main(String[] args) {
	/*
	 * 
	for (int i = 1; i < 5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	 
	 * 
	for (int i = 1; i <=5; i++) {
	for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	for (int i = 1; i<=5 ; i++) {
		for (int j = i; j >=1; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	
	for (int i = 5; i >=1; i--) {
		for (int j = 5; j >=i; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	 */
	for (int i = 5; i >=1; i--) {
		for (int j = i; j <=5; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
