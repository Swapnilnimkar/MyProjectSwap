package constructor;

public class CS1 {
	
	String city;   // VARIABLE DECLARATION
	String name;
	
	public CS1() // user defined constructor
	{ 
		name= "VELOCITY"; //ASSIGN VALUE
		city= "DARWHA";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display1();  // Static mthd
		
		CS1 C=new CS1();  // object create
		
		C.display();  // non static mtd
       
	}
	public void display()
	{
		System.out.println("my city name is "+city);
		System.out.println("my name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("i am a static regular method");
	}
}



    