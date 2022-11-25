package com.Hari;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class instanceOf {
	public static void main(String[] args) {
		Map<Object,Object>map = new HashMap<>();
		boolean mapIsObject = map instanceof HashMap;
		System.out.println(mapIsObject);	
		
		
		HashMap<Object,Object>x = new HashMap<>();   //instance of with interface
		boolean obj =x instanceof Map;
		System.out.println(obj);
		
		SortedMap<Object,Object>y = new TreeMap<>();   //Instance of with Super Interface
		boolean obj1 =y instanceof Map;
		System.out.println(obj1);
		
		
		Map<Object,Object>z = null;   //null Never be compared against any class or interface.
		boolean obj2 = z instanceof Map;
		System.out.println(obj2);
	}

}
