package AbstractClass;

public class cc extends A {

	public static void main(String[] args) 
	{
         cc C=new cc();
         C.demo1();
         C.demo2();
         
         C.demo3();
         C.demo4();
         C.demo5();
         C.sample();
	}

	@Override
	public void demo3() {
          System.out.println("demo 3 completed in cc");		
	}

	@Override
	public void demo4() {
        System.out.println("demo 4 completed in cc");		

		
	}

	@Override
	public void demo5() {
        System.out.println("demo 5 completed in cc");		

	}
	public void sample() 
	{
		System.out.println("sample mthd is own mthd of cc");
	}

	
	
}
