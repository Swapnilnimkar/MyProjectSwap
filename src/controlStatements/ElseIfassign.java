package controlStatements;

public class ElseIfassign {

	public static void main(String[] args) {
		
		/* if its summer then its very hot
		if its rainy then its rainingheavily
		if its winter then its very cold
		invalid season */
		
		String season;
		season="rainy";
		
		if (season=="summer")
		{
			System.out.println("summer is very hot");	

        }
		else if (season=="rainy") 
		{
			System.out.println("rainy is raining heavily");
		}
		else if (season=="winter") 
		{
			System.out.println("winter is very cold");
		}
		else
		{
			System.out.println("please enter valid seson");
		}
		}
	}