package InterfaceStudy;

public class Child implements father, mother 
{

	public static void main(String[] args) 
	{
          Child c=new Child();
          c.receipe();
          c.colour();
          c.money();
          c.property();          
          
	}

	@Override
	public void colour()//mothers property
	{
		System.out.println("colour method completed by child");
	}

	@Override
	public void receipe() // mothers property
	{
            System.out.println("receipe method completed by child");		
	}

	@Override
	public void money()  // fathers property
	{
       System.out.println("money method completed by child");		
	}
	
     @Override
	public void property()//mthd from father
	{
    System.out.println("property method completed by child");		
	}

}
