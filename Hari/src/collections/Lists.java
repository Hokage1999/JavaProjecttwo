package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Lists {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		List<Integer>listDest = new ArrayList<>();
		Set<Integer>set = new HashSet<>();
		list.add(0);
		list.add(345);
		list.add(null);
		list.add(1,26);
		System.out.println(list);
		/*****copying list****/
		listDest.addAll(list);
		System.out.println(listDest);
		/********contains******/
		System.out.println(list.contains(null));
		/********remove element******/
		list.remove(Integer.valueOf(23));
		/**********remove null*******/ //index remove panra  mariye directaa kudukalam
		list.remove(null);
		System.out.println(list);
		/***retainAll*********/
		list.retainAll(listDest);
		System.out.println(list);
		/*********sublist******/
		System.out.println(listDest.subList(0, 3));
		/**********addAll***/
		set.addAll(list);
		System.out.println(set);
		set.add(208);
		System.out.println(set);
		/*****converting toarray*****/
		Integer[] arr = set.toArray(new Integer[0]);
		for(Integer s:arr)
		{
			System.out.println(s);
		}
		/******converting tolist*******/
		List<Integer>values = Arrays.asList(arr); //Rendu line um orey meaningthaa....keela irukka lineum

		List<Integer>value = (List<Integer>)Arrays.asList(arr);
		System.out.println(value);
		/*******sorting*********/
		Collections.sort(values);
		System.out.println(values);
		/****iterating with stream*********/
		Stream<Integer>stream = values.stream();
		stream.forEach(s->{System.out.println(s);});
		/***********casting needed***/
		List cast = new ArrayList();   //no generic type specified

		cast.add(new String("First MyObject"));

		String myObject = (String) cast.get(0);  //cast needed
		System.out.println(myObject);
		/*********isEmpty****/
		boolean d = list.isEmpty();
		System.out.println(d);
		/*********removeAll()**************/
		List<String>lists = new ArrayList<String>();
		List<String>list2 = new ArrayList<String>();
		lists.add("45");
		lists.add("5");
		lists.add("56");
		list2.add("32757");
		System.out.println(lists);
		list2.addAll(lists);
		System.out.println(list2);
		list2.removeAll(lists);////lists elementaa remove panirum
		System.out.println(list2);
		list2.retainAll(lists); /////2 listkum Common elements vechukkum
		System.out.println(list2);
	
		
		
	}

}
