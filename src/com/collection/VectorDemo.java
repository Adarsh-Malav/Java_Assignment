package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector : 
 * 	  1. it automatically implements List Interface
 *    2. it is a dynamic array
 *    3. it can grow or shrink automatically or both
 *    4. its default size is zero(0)
 *    5. its default value "[]"
 *    6. its default capacity is 10
 *    7. it can grow shrink capacity automatically 
 *    8. add() and remove() or addElement() and removeElement()
 *    9. when you add or remove the object the same sequence it will be displayed in console
 *    10. duplicate values are allowed 
 *    
 *    
 *    
 *    Enumerations Vector : 
 */

public class VectorDemo {
public static void main(String[] args) {
	Vector<Object> v1= new Vector<Object>(2,1);  //increasing capacity by 1
	//	Vector v1= new Vector(2,1);
	System.out.println("Default size is "+v1.size());
	System.out.println("Defaul value is "+v1);
	System.out.println("Defaul capacity is "+v1.capacity());
	
	v1.add(123);
	v1.add(23.56f);
	v1.add("adarsh");
	v1.add("A");
	v1.add(Integer.valueOf(100));
	System.out.println("Default size is "+v1.size());
	System.out.println("Defaul value is "+v1);
	System.out.println("Defaul capacity is "+v1.capacity()); //if capacity goes higher then it 
															//	will double the current default capacity

	
	Iterator<Object> i1=v1.iterator();
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
	
	Enumeration<Object> e1=v1.elements();  //Enumerations used only with Vectors
	while (e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
		
	}
	
	
	
	
	v1.remove(0);							 // different methods to remove
	v1.removeElement(Float.valueOf(23.56f));
	v1.removeElementAt(1);
	
	
	System.out.println("Default size is "+v1.size());
	System.out.println("Defaul value is "+v1);
	System.out.println("Defaul capacity is "+v1.capacity());
}
}
