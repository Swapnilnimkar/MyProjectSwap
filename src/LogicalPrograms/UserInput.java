package LogicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//String int float char
		System.out.println("Enter the first number");   //int
		int number1=sc.nextInt();
		
		System.out.println("Enter the second number");   //int
		int number2=sc.nextInt();
		
		int sum =number1+number2;
		System.out.println("sum of two no. is "+sum);
		
        System.out.println("Enter the name");   //string
                  String name = sc.next();
	    System.out.println("my name is "+name);	
	    
	    System.out.println("Enter the number");  //double
	    double num = sc.nextDouble();
	    System.out.println("number is "+num);
	    
	    System.out.println("enter the boolean value");//boolean
	    boolean value = sc.nextBoolean();
	    System.out.println("Boolean value is "+value);
	
	    System.out.println("enter the long value");//Long
	    long lon = sc.nextLong();
	    System.out.println("LOng value is "+lon);
	
	
	}
	
	

}
