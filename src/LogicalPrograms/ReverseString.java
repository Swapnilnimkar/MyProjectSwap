package LogicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the name");
		String name = sc.next();  //NIMKAR
		
		String r="";
		
		for(int i=name.length()-1;i>=0;i--) 
		{
		    r= r+name.charAt(i);
		  //y=""+y;
		  //yt=y+t;
		  //r=yticoleV
		}
		System.out.println("reverse string is "+r);    //RAKMIN
				
		
		
	}

}
