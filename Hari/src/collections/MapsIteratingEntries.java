package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsIteratingEntries {

	public static void main(String[] args) {
		Map<Integer,Integer>map= new HashMap<>();
		//Set<Map.Entry<Integer,Integer>>entries = map.entrySet();
		map.put(1, 123);
		map.put(2, 234);
		map.put(null, null);
		map.put(3, 234);
		map.put(4, 234);
		map.put(5, 345);
		/*Iterator<Map.Entry<Integer,Integer>>iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer,Integer>entry = iterator.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);	
		}*/
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);	
		}
		
	}

}
