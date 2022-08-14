package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(221);
		v.add("Pune");
		v.add('E');
		v.add(null);
		v.add(null);
		v.add(221);
		v.add(true);
		v.add(123.234);
		
		System.out.println(v);
		System.out.println(v.size());
		v.add(0, "velocity");
		System.out.println(v);
		System.out.println(v.contains("Pune"));
		
		//for loop
		System.out.println("============");
		System.out.println("output using for loop");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("==========");
		System.out.println("output for each loop");
	
	//for each loop
		
		for(Object a:v)
		{
			System.out.println(a);
		}
		
		System.out.println("============");
		System.out.println("output for iterator");
		//for iterator
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//for listiterator
		System.out.println("=============");
		System.out.println("output for listiterator");
		
		ListIterator li = v.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//enumeration
		System.out.println("============");
		System.out.println("output for enumeration");
		
		Enumeration ele = v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		}
}
