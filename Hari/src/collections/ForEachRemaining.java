package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForEachRemaining {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Jane");
		list.add("Heidi");
		list.add("Hannah");

		Iterator<String> iterator = list.iterator();
		        
		list.forEach((element)->{System.out.println(element);});  //forEach method
		System.out.println("\n");
		iterator.forEachRemaining((element)->{System.out.println(element);});  //foreachremaining loop with lambda expresiion
		iterator.forEachRemaining(System.out::println);    //method  reference
		

	/*	//List  Iterator
		
		List<String> lis = new ArrayList<>();
		lis.add("Jane");
		lis.add("Heidi");
		lis.add("Hannah");

		ListIterator<String> listiterator = lis.listIterator();
		while(listiterator.hasNext())
		{
		System.out.println(listiterator.next());
		}
		while(listiterator.hasPrevious())
		{
		System.out.println(listiterator.previous());
		}*/
	}

}
