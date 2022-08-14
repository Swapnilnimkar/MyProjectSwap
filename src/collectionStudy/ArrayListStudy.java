package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("velocity");
		al.add(200);
		al.add(10.20);
		al.add(null);
		al.add(null);
		al.add("velocity");
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf("velocity"));
		
		System.out.println(al.contains("velocity")); //true or false 
		
		
		
		
		System.out.println(al.remove(0));  //index basis
		System.out.println(al);
		
		al.add(1, "pune");  //add string using index
		System.out.println(al);
		
		System.out.println(al.remove(null)); //element basis
		System.out.println(al);
		
		System.out.println("===================");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		
		System.out.println("==================");
		
		//printing element using for loop(static or hard coding)
		
				for(int i=0;i<=6;i++)
				{
					System.out.println(al.get(i));
					}
				
			System.out.println("================");
			
			//printing element using for loop(dynamic coding)
			
			for(int i=0;i<=al.size()-1;i++)
			{
				System.out.println(al.get(i));
			}
				
		
		
		
		
	}

}
