package mockprac;

public class NonStatic {

	public static void main(String[] args) {
		
     NonStatic NS=new NonStatic(); // object creation
     NS.studentinfo(); //objectname.classname same class
     
     Nonstaticdiff N= new Nonstaticdiff();// diff class
     N.multi();//diff class


	}                          //nonsatic with same class
      public void studentinfo()
      {
    	 String name;
    	 name="swapnil";
    	 
    	 float age;
    	 age= 26f;
    	 
    	 char gender;
    	 gender='M';
    	 
    	 System.out.println("my name is "+name);
    	 System.out.println("my age is "+age +"year");
    	 System.out.println("my gender is "+gender);
    	 System.out.println("===============");
    	 
    	 
    	 
    	 }
}
