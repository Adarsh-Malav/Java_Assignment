package com.collection;

import java.util.HashSet;
import java.util.Set;

/*
 *	2.HashSet
 *
 *	 1. it automatically implements Set Interface
 *   2. it is a dynamic array
 *   3. it can grow or shrink automatically or both
 *   4. its default size is zero(0)
 *   5. its default value "[]"
 *   6. add() and remove()
 *   7. All the value has hash key
 *   8. every hash key is converted into hash code 
 *   9. all the values are displayed hash code wise
 *   10. duplicate values are not allowed 
 *   11. remove via object only
 * 
 */


public class HashSetDemo {
public static void main(String[] args) {
//HashSet<Object> h1 =new HashSet<Object>();
	//Set<Object> h1 =new HashSet<>();
	Set<Object> h1=new HashSet<>();
	
	System.out.println("Default size is "+h1.size());
	System.out.println("Defaul valuee is "+h1);
	h1.add(1);
	h1.add(10);
	h1.add("adarsh");
	h1.add(1.02);
	h1.add("adarsh");
	h1.add(Integer.valueOf(100));  // a1.add(new Integer(100));
	System.out.println("Default size is "+h1.size());
	System.out.println("Defaul valuee is "+h1);
	
	//h1.remove(0); cannot remove via index
	h1.remove(Integer.valueOf(10));
	h1.remove("adarsh");
	System.out.println("Default size is "+h1.size());
	System.out.println("Defaul valuee is "+h1);
	
}
}
