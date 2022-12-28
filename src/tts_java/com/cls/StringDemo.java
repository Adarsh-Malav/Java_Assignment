package tts_java.com.cls;

public class StringDemo {
public static void main(String[] args) {
	String s1=new String("This is top technologies");
	System.out.println("length is "+s1.length());
	System.out.println("orifinal length is "+s1);
	System.out.println("upper case is "+s1.toUpperCase());
	System.out.println("lower case is "+s1.toLowerCase());
	System.out.println("substring is "+s1.substring(2));
	System.out.println("substring is " +s1.substring(2,5));
	
	if(s1.equalsIgnoreCase("This is Top technologies...")) {
		System.out.println("both strings are same");
			
	}else {
		System.out.println("Both strings are differnet");
	}
	
	System.out.println("length is "+s1.length());
	System.out.println("orifinal length is "+s1);

	 s1=s1.concat("adarsh");
	 System.out.println(s1);
	 
	 
	 String s2="Malav ";
	 s2=s2.concat("adarsh");
	 System.out.println(s2);
}
}
