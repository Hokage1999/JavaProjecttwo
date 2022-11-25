package collections;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		SortedMap<Integer,Integer> sortedMap = new TreeMap<>();
		sortedMap.put(1, 123);
		sortedMap.put(2, 234);
		sortedMap.put(3, 2344);
		sortedMap.put(5, 2345);
		System.out.println(sortedMap.get(sortedMap.firstKey()));
		Integer first = sortedMap.firstKey();
		Integer last = sortedMap.lastKey();
		System.out.println(first);
		System.out.println(last);
		Iterator<Integer> it = sortedMap.keySet().iterator();
		while(it.hasNext())
		{
			Integer keys = it.next();
			System.out.println(keys);
		}
		/******headmap,tailmap,submap*******/
		SortedMap headMap = sortedMap.headMap(3);

		System.out.println(headMap);
		SortedMap tailMap = sortedMap.tailMap(3);

		System.out.println(tailMap);
		SortedMap subMap = sortedMap.subMap(1,6);

		System.out.println(subMap);
	}

}
