package LogicalPrograms;

public class MultiplicationWithoutMulOpertor {

	public static void main(String[] args) {
		
		int num1=3;
		int num2=4;
		int sum=0;
		
		for(int i=1;i<=num2;i++)
		{
			sum=sum+num1;
			//i->1-->sum=3=0+3
			//i->2-->sum=6=3+3
			//i->3-->sum=9=6+3
			//I-->4-->sum=12=9+3
		
		}
		
		System.out.println("multi is "+sum);
	}
}
