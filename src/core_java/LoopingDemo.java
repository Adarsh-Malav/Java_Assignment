package core_java;
/*
 * looping: iterative,repetitive
 * type of loop
 * 1. entry loop
 * ->for
 * ->while
 * 2.exit condition
 * do while
 */
public class LoopingDemo {
public static void main(String[] args) {
	int i=1;
	while (i<=5) {
		System.out.print(i+" ");
		i++;
	}
	System.out.println();
	
	
	int a =1;
	do {
		System.out.print(a+" ");
		a++;
	} while (a<=5);
}
}
