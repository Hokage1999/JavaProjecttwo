/*Notes
 * Destination list length == source list length (must)----------copy
 * 
 * 
 * 
 */

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMethods {

	public static void main(String[] args) {
		//Unmodifiable Set
		Set normalSet = new HashSet();
		Set immutable = Collections.unmodifiableSet(normalSet);
		normalSet.add(23);
		//immutable.add(23) ----errorr throw pannum.
		System.out.println(normalSet);
		
		
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "element 7", "element 8", "element 3");
		Collections.addAll(list, "A", "B", "A");
		System.out.println(list);
		//Sorting
		Collections.sort(list);
		System.out.println(list);
		//Binary Search
		Collections.sort(list);
		int index = Collections.binarySearch(list, "dsayg");
		System.out.println(index);
		//Copy
		Collections.copy(list2, list);
		System.out.println(list2);
		
	//Reverse
		Collections.reverse(list2);
		System.out.println(list2);
	//Shuffle	
		Collections.shuffle(list2);
		System.out.println(list2);
		//min and max
		String x = Collections.max(list2);
		System.out.println(x);
		//ReplaceAll()
		Collections.replaceAll(list2,"A" , "Z");
		System.out.println(list2);
		
	}

}
