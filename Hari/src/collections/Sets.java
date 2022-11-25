package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		/***************Unmodifiable Set*********/
	/*	Set<String> set = Set.<String>of("hari","ysgad","osdhfs");
		///set.add(23);   (ImmutableCollections
		System.out.println(set);
		
		/*******removeAll() and retainAll()*******
		Set<String> sets = new HashSet<>();
		Set<String> sets2 = new HashSet<>();
		sets.add("usga");
		sets.add("suhf");
		sets.add("sduhf");
		System.out.println(sets);
		sets2.add("uyfddddd");
		sets2.addAll(sets);
		System.out.println(sets2);
		sets2.retainAll(sets);    //retain intersection elements
		System.out.println(sets2);
		sets.removeAll(sets);	//remove intersection elements
		System.out.println(sets);
		System.out.println();   */
		
		Set<Integer> x = new TreeSet<>();
		x.add(45);
		x.add(456);
		x.add(36);
		System.out.println(x);
	}
}
