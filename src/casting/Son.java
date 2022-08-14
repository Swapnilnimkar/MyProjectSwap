package casting;

public class Son extends Father
  {
      public void car()  // overloding
  {
	System.out.println("honda civic");
  }
      
      public void bike()  //overloding
      {
    	 System.out.println("jawa"); 
     }
      public void Degree()  //new method of Son--> not supported for casting
      {
    	  System.out.println("BE");
      }
}
