package collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMaps {

	public static void main(String[] args) {
		NavigableMap original = new TreeMap();
		original.put("1", "1");
		original.put("2", "2");
		original.put("3", "3");

		//this headmap1 will contain "1" and "2"
		SortedMap headmap1 = original.headMap("3");

		//this headmap2 will contain "1", "2", and "3" because "inclusive"=true
		NavigableMap headmap2 = original.subMap("2", true,"3",true);
		System.out.println(headmap2);
		
		Object ceilingKey = original.ceilingKey("2");
		System.out.println(ceilingKey);
		Object floorKey = original.floorKey("1");
		System.out.println(floorKey);
		Object higherKey = original.higherKey("1");
		System.out.println(higherKey);
		Object lowerKey = original.lowerKey("2");
		System.out.println(lowerKey);
		/*********descendingKeySet*********/
		NavigableSet reverse = original.descendingKeySet();
		System.out.println(reverse);
		System.out.println(original);
		/*********descending map***/
		NavigableMap descending = original.descendingMap();
		System.out.println(descending);
		/**********ceiling,floor,higher,lower,pollFirst,pollLast entry***/
		Object ceilingEntry = original.ceilingEntry("2");
		System.out.println(ceilingEntry);
		Object floorEntry = original.floorEntry("1");
		System.out.println(floorEntry);
		Object higherEntry = original.higherEntry("2");
		System.out.println(higherEntry);
		Object lowerEntry = original.lowerEntry("2");
		System.out.println(lowerEntry);
		Object pollFirstEntry = original.pollFirstEntry();
		System.out.println(pollFirstEntry);
		Object pollLastEntry = original.pollLastEntry();
		System.out.println(pollLastEntry);
		
		

	}

}
