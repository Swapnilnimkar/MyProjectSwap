package genelisation;

public class TESTgeneralisation {

	public static void main(String[] args) {
		
		Jio j=new Jio();
		System.out.println("=======jio========");
		
		j.call();
		j.data();
		j.msg();
		j.Jio_method();
		System.out.println("=======jio======");
		
		Airtel a=new Airtel();
		
		System.out.println("========AIRTEL======");
		a.call();
		a.data();
		a.msg();
		a.New_methodAirtel();
		System.out.println("=======AIRTEL=======");
		
		Idea i=new Idea();
		System.out.println("=======IDEA=======");
		i.call();
		i.data();
		i.msg();
		i.new_METHOD();
		System.out.println("========IDEA=======");
	}

}
