package polymorphism;

public class overloding {

	public static void main(String[] args) {
		display();
		display("swapnil");
		
		overloding o=new overloding ();
				o.display('A', 'M');
     }
         public static void display() //zero parameter
     {
	     System.out.println("Hi");
	 }
     
         public static void display(String name)//one parameter
     {
         System.out.println("my name is "+name);	 
     }
        
       public void display(char grade,char gender)//two parameter
     {
    	 System.out.println("grade is "+grade + " gender is "+gender);
     }
}
