package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEg3 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(3);
		al.add(9);
		
		System.out.println(al);
		System.out.println("====================");
		
		//for each
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("================");
		
		//for iterator
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("================");
		
		//for listiterator
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		}
		
		
		
		
	}


