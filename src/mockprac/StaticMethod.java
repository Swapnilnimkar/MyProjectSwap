package mockprac;

public class StaticMethod {

	public static void main(String[] args) {
		
		add();
		DivisionPra.div();
	}
	
   public static void add() 
   {
	int x;
	int y;
	int addition;
	
	x=10;
	y=50;
	addition=x+y;
	
System.out.println("my addition is "+addition);
}
}