package genelisation;

public class Airtel implements TRAI{

	 @Override
	public void call() {
		System.out.println("1Rs/Sec");
		
	}

	@Override
	public void data() {
		System.out.println("1.5gb/day");
		
	}

	@Override
	public void msg() {
        System.out.println("100msg/day");		
	}
	
	public void New_methodAirtel(){
		System.out.println("new method");
	}

}
