package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 3. HashMap
 * 
 *   1. it automatically implements Map Interface
 *   2. it is a dynamic array
 *   3. it can grow or shrink automatically or both
 *   4. its default size is zero(0)
 *   5. its default value "()"
 *   6. add() and remove()
 *   7. it has pair<key,value>
 *   8. All the pair has hash key
 *   9. every hash key is converted into hash code 
 *   10. all the values are displayed hash code wise
 *   11. duplicate values are not allowed 
 *   12. remove via key only
 */

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Object, Object> h1=new HashMap<Object, Object>();
	h1.put(1, "adarsh");
	h1.put(2, "Malav");
	h1.put(3, "Surat");
	h1.put(4, "vesu");
	
	h1.remove(4);
	System.out.println(h1.size());
	System.out.println(h1);

//important------------------------------------------
	
	
	Set<Entry<Object, Object>> set = h1.entrySet();
	Iterator<Entry<Object, Object>> i1=set.iterator();
	
	while (i1.hasNext()) {
	//	System.out.println(i1.next());
		
		@SuppressWarnings("rawtypes")
		Map.Entry me=(Map.Entry)i1.next();
		
		System.out.println("key is .."+me.getKey());
		System.out.println("value is ..."+me.getValue());
		System.out.println();
		
		
	}



}
}
