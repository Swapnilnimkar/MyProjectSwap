package LogicalPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The number");//5!-->5*4*3*2*1
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i=num;i>=1;i--) 
		{
			fact=fact*i;
		}
         System.out.println("Factorial of "+num+"is"+fact);
	}

}
