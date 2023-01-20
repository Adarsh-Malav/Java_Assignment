package com.collection;

import java.util.ArrayList;

/*
 * Generic <E> : E : a specific user defined class or system defined class
 * 1. when there is a need to convert collection into specific class
 * 
 * example:
 * ArrayList<Integer> 
 * 
 */

public class GenericDemo {
public static void main(String[] args) {
	ArrayList<Integer> a1= new ArrayList<>();
	System.out.println(a1.size());
	System.out.println(a1);

	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
}
}
