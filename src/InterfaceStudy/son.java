package InterfaceStudy;

       public class son implements Husband,wife
{

	  public static void main(String[] args) 
	{
       son S=new son();
      S.attitude();
      S.nature();
      S.colour();
      S.love();   //calling default method from both interfaces
      S.money();
      wife.test();//calling static method from wife interface
      Husband.test();//calling static method from husband interface
      S.laptop();
	}

	@Override
	public void attitude() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
	}
	public void laptop()
	{
		System.out.println("sons own property");
	}

	@Override
	public void love() {
		wife.super.love(); //calling wife love method
		Husband.super.love();//calling husband love method
	}

}
