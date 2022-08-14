package polymorphism;

public class MethodOverloding {

	public static void main(String[] args) {
   
		MethodOverloding mo=new MethodOverloding();
		mo.add();
		mo.add(50);
        mo.add(20,30);
	}
    public void add() //non static zero para
  {
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("sum is"+sum);
  }
    public void add(int a)//one para
    {
    	//a=30;
    	int sum=a+20;
    	System.out.println("sum is"+sum);
    }
    public void add(int a,int b)//two para
    {
    	int sum=a+b;
    	System.out.println("sum is"+sum);
    	
    }
}
