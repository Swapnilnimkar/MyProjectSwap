package mockprac;

public class NonStaticpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticpara N=new NonStaticpara();
    N.info("Jay", "pune", 445100);
    N.info("ram", "warora", 12450);

	}
	
     public void info(String name, String city,int pincode)//with parameter
{
	System.out.println("my name is "+name+"\n my city is "+city+"\n city pin is "+pincode);
	System.out.println("=============");
	
	
	
}
}
