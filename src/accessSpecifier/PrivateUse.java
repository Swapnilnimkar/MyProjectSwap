package accessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		    PrivateUse PU=new PrivateUse();
		    PU.test1(); //public can be accessed within project
		    PU.test2(); //private can be accessed within class
		    PU.test3(); //default can be accessed within package
		    
		

	}
	  public void test1()
	  {
		  System.out.println("PUBLIC TEST 1 METHOD"); //public can be accessed within A PROJECT
		}
	  
	  private void test2() 
	  {
		System.out.println("PRIVATE TEST 2 METHOD");  //private can be accessed within a class
      }
	  
	  void test3()
	  {
		  System.out.println("DEFAULT TEST 3 METHOD"); //default can be accessed within a package
	  }
	  

}
