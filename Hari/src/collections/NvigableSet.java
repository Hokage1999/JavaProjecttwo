package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NvigableSet {
	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(1);
		navigableSet.add(2);
		navigableSet.add(4);
		navigableSet.add(4);
		navigableSet.add(5);
		/************descendingSet*******/
		NavigableSet<Integer> reverse  = navigableSet.descendingSet();
		System.out.println(reverse);
		System.out.println(navigableSet); ///no matram for navigable set
		/*******DescendingIterator***********/
		Iterator<Integer> res = navigableSet.descendingIterator();
		while(res.hasNext())
		{
			System.out.println(res.next());
		}
		/********headset,tail,sub*******/
		NavigableSet headset = new TreeSet();
		headset = navigableSet.headSet(3, true);
		System.out.println(headset);
		NavigableSet tailset = navigableSet.tailSet(3, true);
		System.out.println(tailset);
		NavigableSet subset = navigableSet.subSet(3, true,5,true);
		System.out.println(subset);
		/**************ceiling floor higher lower pollfirst polllast********/
		Integer a = navigableSet.ceiling(4);
		System.out.println(a);
		Integer b = navigableSet.floor(3);
		System.out.println(b);
		Integer c = navigableSet.higher(4);
		System.out.println(c);
		Integer d = navigableSet.lower(3);
		System.out.println(d);
		Integer e = navigableSet.pollFirst();
		System.out.println(e);
		Integer f = navigableSet.pollLast();
		System.out.println(f);		
	}
}
