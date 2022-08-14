package Parameter;

public class MathOperation {

	public static void main(String[] args) {
		// 
	sub();    //calling method without parameter
	sub(30, 20);  // calling with parameter
	sub(100, 50);

	}
    public static void sub() // static regular method without parameter
{
	int a;
	int b;       // variable declaration
	int sub;
	
	a=50;
	b=40;
	sub= a-b;
	// variable initialisation
	
	System.out.println("sub of no.is "+sub); // usage
	System.out.println("==============================");
}


      public static void sub(int a, int b)//static with parameter
{
         int subs=a-b;
         System.out.println("sub of no is "+subs);
    	
    	  }
}
