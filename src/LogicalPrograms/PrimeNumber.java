package LogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number=5;
		int counter = 0;
		
		for(int i=3;i<number;i++)//2..3...4
		{
			
			if(number%i==0)//10%2
			{
				counter++;//1
				break;
				
			}
		}
		if(counter==1)
		{
			System.out.println("given number is not prime number");
		}
		else
		{
			System.out.println("given number is prime number");
		}
			
	}

}
