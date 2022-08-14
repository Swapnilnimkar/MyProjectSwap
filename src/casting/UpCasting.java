package casting;

public class UpCasting {

	public static void main(String[] args) {

		Father fe=new Father();
		fe.bike();
		fe.car();
		System.out.println("===================");
		
		Son s=new Son();
		s.bike();
		s.car();
		s.Degree();
		System.out.println("====================");
		
		Father f=new Son();
		f.bike();  //eligible for casting
		f.car();   //eligible for casting
		//f.degree(); not eligible for casting as its not common/ superclass method
		


	}

}
