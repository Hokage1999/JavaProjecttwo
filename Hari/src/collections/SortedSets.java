package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {

	public static void main(String[] args) {
		SortedSet<String>set = new TreeSet<>();
		SortedSet<String>headSet = new TreeSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("f");
		set.remove("f");
		System.out.println(set);
		/**************first and last**************/
		String first = set.first();
		System.out.println(first);
		String last = set.last();
		System.out.println(last);
		/*******headset tailset and subset*****/
		headSet  = set.headSet("c");
		System.out.println(headSet);
		SortedSet tailset = set.tailSet("c");
		System.out.println(tailset);
		SortedSet subset = set.subSet("b","f");
		System.out.println(subset);
		/********descendingIterator********/
		TreeSet<String>treeSet = new TreeSet<>();
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("e");
		treeSet.add("f");
		Iterator iterator = treeSet.descendingIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
