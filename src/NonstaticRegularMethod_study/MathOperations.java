package NonstaticRegularMethod_study;

public class MathOperations {

	public static void main(String[] args) 
	{
		MathOperations S=new MathOperations();  //classname objectname=newclassname
		S.add(); //call non static method with help of object
		sub(); // call static method 

	}
	
	
		public void add() //non static regular method
	{
		int a;
		int b;          // variable declaration
		int addition;
		
		a=50;
		b=40;            // variable initialisation
		addition=a+b;
		System.out.println("addition is "+addition);   // usage
	}	
	 public static void sub()  // static regular method
	 {
		 int a;
		 int b;
		 int sub;
		 
		a=50; b=40; sub=a-b; 
		System.out.println("sub is "+sub);
	 }
}
		
		
		
		 
		 
		 
		 
		 
		 
	 
		
		
	
	


