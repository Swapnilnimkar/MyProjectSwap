package constructor;

public class MathOperations {

	int a;    // variable declaration
	int b;
	
	public MathOperations() // user defined constructor
	{
	a=10;
	b=20;
	System.out.println("Running user defined constructor");
	
	}
	
	public static void main(String[] args) {
		// 
		MathOperations MO=new MathOperations();
		MO.add();

	}
	
public void add()
{
	int sum=a+b;
	System.out.println("sum is "+sum);
	
	}
}
