package core_java;

public class Nestedif {
public static void main(String[] args) {
	int i=10;
	if(i>=0) 
		if(i==0)
			System.out.println("no is zeroo");
		else 
			System.out.println("no is positive");
	else
		System.out.println("no is negative");
		
	
	
	
	
	int a = 12,b = 1,c = 67;
	
	if(a>b)
		if(a>c)
			System.out.println("a is greater");
		else
			System.out.println("c is greater");
	else
		if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	
	
}
}
