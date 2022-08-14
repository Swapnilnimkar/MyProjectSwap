package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylisteg2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("velocity");
		al.add(144);
		al.add(12.12);
		al.add(null);
		al.add(null);
		al.add("velocity");
		al.add('A');
		al.add(true);
		 
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(1));
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf("velocity"));
		System.out.println(al.contains("velocity"));
		System.out.println(al.remove(2));
		System.out.println(al);
		al.add(1, "pune");
		System.out.println(al);
		
		System.out.println("===================");
	    System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		
		System.out.println("==================");
		
		//for each loop
		System.out.println("for each loop output");
		
		for(Object m:al)
		{
			System.out.println(m);
		}
		
		System.out.println("===============");
		
		
		// iterator
		
		System.out.println("iterator output");
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
	    }
		System.out.println("==================");
		
		
		//listiterator
		System.out.println("listiterator output");
		
		ListIterator li = al.listIterator();
				
				while (li.hasNext()) 
				{
					System.out.println(li.next());
					
				}
	}

}
