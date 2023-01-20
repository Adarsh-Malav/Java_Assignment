package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
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
	
	Iterator<Object> i1=a1.iterator();
	while (i1.hasNext()) {
		System.out.println(i1.next().equals('t'));
		
	}
}
}
