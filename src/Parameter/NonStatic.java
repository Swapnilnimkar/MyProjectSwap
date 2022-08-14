package Parameter;

public class NonStatic {

	public static void main(String[] args) {
		// 
		NonStatic n= new NonStatic();
		n.add();
		n.add(12, 10);
		
		
		

	}

 public void add() // without parameter
 {
	 int a;
	 int b;   // variable declaration
	 int add;
	 
	 a=5;
	 b=7;
	 add=a+b;
	 
	 System.out.println("addition of no.is "+add);
	 
 }
	
      public void add(int a,int b)  // with parameter
    { 
 int sum=a+b;
   
   System.out.println("add of no. is "+sum);
 
 }

}
	
