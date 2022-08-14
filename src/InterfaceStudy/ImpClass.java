package InterfaceStudy;

public class ImpClass implements myinterface   // one class can implement interface  
{

	public static void main(String[] args) 
	{
      System.out.println(a);// calling variable of interface
      ImpClass Is=new ImpClass();
      Is.m1();
      Is.m2();
      Is.m3();//own method of implementation class
		}
	@Override
	public void m1() 
	{
		System.out.println("method m1 is completed in implementation class");
	}

	@Override
	public void m2() 
	{
		System.out.println("method m2 is completed in implementation class");
	}

	public void m3()
	{
		System.out.println("method m3 is own method of implementation class");
		
	}
}
