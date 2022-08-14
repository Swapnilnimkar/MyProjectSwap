package InterfaceStudy;

public interface Husband 
{
      void nature();
      void colour();

     default void love()
    {
	 System.out.println("husband love");
    }
     
     static void test()
     {
    	 System.out.println("husband test");
     }
     
}
