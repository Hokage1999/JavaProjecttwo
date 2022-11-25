package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class Collect
{
		public static void doSomething(Collection collection) {		    
		    Iterator iterator = collection.iterator();
		    while(iterator.hasNext()){
		      Object object = iterator.next();
		      System.out.println(object);
		    }
	}
}
public class Cllection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		List list = new ArrayList();
		Collection collection =new ArrayList();
		list.add(34);
		set.add(35);
		set.add(356);
		collection.add(set);    //add the object itself
		System.out.println(collection);
		
		Collect.doSomething(list);
		Collect.doSomething(set);
		Collect.doSomething(collection);
		
		
		
		/*******retainAll***\***********/
		 Collection A = new ArrayList();
		 Collection B = new ArrayList();
		 Collection target = new ArrayList();
		 A.add("a");
		 A.add("b");
		 A.add("c");
		 System.out.println(A);
		
		 B.add(1);
		 B.add(2);
		 B.add(3);
			
		 target.addAll(A);
		 target.addAll(B);
		 System.out.println(target);
		 target.retainAll(A);
		 System.out.println(target);
		 System.out.println(target.contains("a"));
		
	}

}
