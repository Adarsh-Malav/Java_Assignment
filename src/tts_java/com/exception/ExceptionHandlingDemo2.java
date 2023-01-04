package tts_java.com.exception;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {
public static void main(String[] args) {
	try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a=scanner.nextInt();
		System.out.println("Enter the number 2");
		int b=scanner.nextInt();
		scanner.close();
		System.out.println("result is..."+(a/b));
		
		int arr[]=new int[5];
		for (int i = 0; i <=5; i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}
		System.out.println("program is success");
	} catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
}
}
