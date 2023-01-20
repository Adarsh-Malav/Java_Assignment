package com.common_cls;
/*
 * wrapper class : type conversion of primitive data type to object and vice versa
 * there are many wrapper class of primitive data type
 * 
 * datatype           wrapper class
 * int                Integer
 * float              Float
 * long               Long
 * 
 * 3 ways to perform type conversion
 * 1. auto-boxing : direct value to the object.
 * 2. boxing : value first given to the variable ,then variable is passed to object
 * 3. un-boxing : object to variable 
 */
public class WrapperClassDemo {
public static void main(String[] args) {
	
	//type 1 conversion
	@SuppressWarnings("removal")
	Integer i1 = new Integer(123);
	System.out.println("auto boxing is..."+i1);
	//type 1 conversion
	String s1= new String("tops");
	System.out.println(s1);
	
	//Type 2 conversion
	int a =24;
	@SuppressWarnings("removal")
	Integer i2=new Integer(a);
	System.out.println(i2);
	
	
	
	//type 3 conversion
	int var1 = i1;
	System.out.println(var1);
	
	
	/*
	 * format for conversion
	 * 
	 * primitive data type variable=wrapperclass.parseWrapper(variable);
	 */

	//type 3 conversion but different data type
	String s3="236";
	String s2="234"; //auto-boxing
	
	int val2=Integer.parseInt(s2);
	int val3=Integer.parseInt(s3);
	//double val3=Double.parseDouble(s3);
	System.out.println(val2+val3);

	float f1=Float.parseFloat(s2);
	float f2=Float.parseFloat(s3);
	System.out.println(f1+f2);
	//  type 3 for conversion into String
	int i4=1234;
	String s4 = Integer.toString(i4);
	
	System.out.println(s4);
}
}
