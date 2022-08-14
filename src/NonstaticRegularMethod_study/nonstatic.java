package NonstaticRegularMethod_study;

public class nonstatic {

	public static void main(String[] args) 
	{
		// classname objectname= newclassname();
		
		nonstatic o=new nonstatic(); // create object of the class;
		
		// to call non static methods from same class
		//objectname.methodname;
		
		o.test();// calling non static methods from same class
		
		MyclassNon k= new MyclassNon(); // object create for differnt class

		k.myMethod();  // objectname.methodname;
		               // calling non static method from another class
	
		
		
		}
	
	public void test() // non static regular method
	{
		System.out.println("This is my test method");
	
		
	}
	}

	


