package com.collection;

import java.util.ArrayList;
//import java.util.List;

/*
 * collection : when you collect object or value (primitive/non primitive ) into a single object
 * it is known as collection
 * derived from java.util package
 * collection contains so many class and interface
 * 
 *  
 *  Interfaces :-
 *  1. List
 *  2. Set
 *  3. Map
 *  4. Iterator : arraylist, hashset, hashmap
 *  	1. it is an interface
 *  	2. we can create the reference type object
 *  	3. we use iterator to display value/object in list
 *  	it has 3 steps
 *  		1. first the value is given to the iterator with the help of collection
 *  		2. use loop to traverse the object/value
 *  		3. get the value from iterator
 *  
 *  	
 *  5. Enumeration
 *  
 *  
 *  classes :-
 *  1. ArrayList
 *    1. it automatically implements List Interface
 *    2. it is a dynamic array
 *    3. it can grow or shrink automatically or both
 *    4. its default size is zero(0)
 *    5. its default value "[]"
 *    6. add() and remove()
 *    7. when you add or remove the object the same sequence  it will be displayed in console
 *    8. duplicate values are allowed 
 *  2. HashSet
 *  3. HashMap
 *  4. Vector
 *  5.Generic
 *  
 */
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList <Object>a1=new ArrayList<Object>();
//	List<Object> a1=new ArrayList<>();
	//	ArrayList a1=new ArrayList();
	System.out.println("Default size is "+a1.size());
	System.out.println("Defaul valuee is "+a1);
	a1.add(1);
	a1.add(10);
	a1.add("adarsh");
	a1.add(1.02);
	a1.add("adarsh");
	a1.add(Integer.valueOf(100));  // a1.add(new Integer(100));
	System.out.println("Default size is "+a1.size());
	System.out.println("Defaul valuee is "+a1);
	
	a1.remove(0);
	a1.remove(Integer.valueOf(10));
	a1.remove("adarsh");
	
	System.out.println("Default size is "+a1.size());
	System.out.println("Defaul valuee is "+a1);
}
}
