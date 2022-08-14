package LogicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		//int num=10;
		
	//	System.out.println(num/2);
	
	//	System.out.println(num%2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number");
				
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		
		
	}

}
