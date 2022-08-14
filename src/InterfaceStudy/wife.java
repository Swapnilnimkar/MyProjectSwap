package InterfaceStudy;

public interface wife 
{
    void attitude();
    void money();
    
    default void love()
    {
    	System.out.println("wife love");
    }
    static void test()
    {
    	System.out.println("wife test");
    }
}
