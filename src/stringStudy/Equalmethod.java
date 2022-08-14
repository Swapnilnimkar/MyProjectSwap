package stringStudy;

public class Equalmethod {

	public static void main(String[] args) {

		String v0 = "velocity";
		String v1 = "velocity";
		System.out.println(v0==v1);//true
		
		String v2 = "VELOCITY";
		System.out.println(v1==v2); //false
		  
		String v3 = new String("velocity");
		String v4 = new String("velocity");
		
		System.out.println(v3==v4); //false
		System.out.println("===================");
		
		System.out.println(v0.equals(v1)); //true
		System.out.println(v1.equals(v2));  //false
		
		System.out.println(v3.equals(v4));  //true
		
		
		
	}

}
