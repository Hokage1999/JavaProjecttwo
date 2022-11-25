package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class Maps {

	public static void main(String[] args) {
		Map<Integer,Integer>map= new HashMap<>();
		Map<Integer,Integer>mapA= new HashMap<>();
		map.put(1, 123);
		map.put(2, 234);
		map.put(null, null);
		map.put(3, 234);
		map.put(4, 234);
		map.put(5, 345);
		System.out.println(map);
		mapA.putAll(map);
		System.out.println(mapA);
		System.out.println(mapA==map);  ////equal kedayathu
		/*******getting values by key***********/
		Integer element = map.get(1);
		System.out.println(element);
		/*******getting or default value*********/
		Integer value = map.getOrDefault(5, 6789);
		System.out.println(value);
		/********iterating keys**********/
		Iterator<Integer> it = map.values().iterator();
		while(it.hasNext())
		{
			Integer keys = it.next();
			System.out.println(keys);
		}
		for(Integer key:map.values())
		{
			Integer keysss = key;
			System.out.println(keysss);
		}
		Stream<Integer>stream = map.values().stream();
		stream.forEach((keyss)->{System.out.println(keyss);});
		/****remove and clear and isEmpty************/
		map.remove(1);
		System.out.println(map);
		map.clear();
		System.out.println(map);
		System.out.println(mapA.size());
		System.out.println(map.isEmpty());
		/***replace***************/
		mapA.replace(9,75488);  ///replace aaagathu beacuse key 9 illa
		System.out.println(mapA);
		

	}

}
