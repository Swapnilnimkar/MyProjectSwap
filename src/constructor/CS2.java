package constructor;

    public class CS2 {
	
	int a;
	int b;

     public CS2 ()  //user defined constructor
 {
     a=50;
     b=10;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CS2 c=new CS2();
		
           c.add();

	}

	public void add()
	{
	int add=a+b;
	 
	 System.out.println("my addition is "+add);
	 }
	 
}
