package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorInterface {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		Iterator<Integer>iterator = list.iterator();
		while(iterator.hasNext())
		{
			int value = iterator.next();
		/*	if(value == 3){
		        list.add(4);   //java.util.ConcurrentModificationException
		    }  */
			if(value == 3){
		        iterator.remove();     //Remove panalam 
		    }	
		}
		System.out.println(list.toString());
	
		
		//Set	
		Set set = new HashSet();
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(6);
		Iterator it = set.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println(it.hasNext());
	}

}
