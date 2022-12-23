package core_java;

public class Switch_case {
public static void main(String[] args) {
	int ch=1;
	switch (ch) {
	case 1: {
		
		System.out.println("fan");
		break;
	}
	case 2: {
		System.out.println("light");
		break;
	}
	default:
		System.out.println("Invalid input");
		throw new IllegalArgumentException("Unexpected value: " + ch);
	}

	System.out.println("-------------------------------------");
	
	char c = 'A';
	switch (c) {
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	
	{
		System.out.println("Vowels");
		break;
		
	}
	default:
		System.out.println("Consonants");
		throw new IllegalArgumentException("Unexpected value: " + c);
	}
	
	
}
}
