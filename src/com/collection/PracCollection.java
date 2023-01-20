package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracCollection {
public static void main(String[] args) {
	List<Object> o1=new ArrayList<>();
	o1.add(1);
	o1.add("adarah");
	
	o1.add(1.5658659);
	o1.add("........");
	o1.add(10000);
	o1.remove(1);
	System.out.println(o1);



	Set<Object> o2=new HashSet<>();
	o2.add(44);
	o2.add(44);
	o2.add(44);
	o2.add("tops");
	o2.add(2223.3);
	o2.remove(2223.3);
	System.out.println(o2);
	
}


}
