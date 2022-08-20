package mockprac;

public class StaticPara {

	public static void main(String[] args) {
		multi(10,20);  //static with para in same class
		StaticAnotherPara.div(15, 3);//static with para in another class

	}
       public static void multi(int a, int b)
	{	 
		int multi;
		multi=a*b;
		
		System.out.println("mul is "+multi);
		System.out.println("=============");
		
		}
	

}
