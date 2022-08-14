package LogicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num=123456;  //54321
		
		String s = Integer.toString(num);
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		int revNumber = Integer.parseInt(r);
		System.out.println("Original no. is "+num);
		System.out.println("Reverse no. is "+revNumber);
		

	}

}
