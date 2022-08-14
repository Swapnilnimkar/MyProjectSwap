package Parameter;

public class UniversityStudents {

	public static void main(String[] args) {
	  UniversityStudents US=new UniversityStudents();// object create
	  US.Studentinfo();
	  US.StudentInfo("Katraj", "PU765432", "Arts", "test", 'M', 2020, 99.99f);
	}
	  //name, PRN, branch, dept, gender, passoutyear, weight
	 public void Studentinfo() { // without parameter
		
		 String name;
		 name= "swapnil";
		 
		 String PRN;
		 PRN="PN313918";
		 
		 String branch;
		 branch= "science";
		 
		 String dept;
		 dept= "ENTC";
		 
		 char gen;
		 gen='M';
		 
		 int year;
		 year=2018;
		 
		 float weight;
		 weight=55f;
		 
		 System.out.println("=======================");
		 System.out.println("My name is "+name);
		 System.out.println("My PRN no. is "+PRN);
		 System.out.println("My branch is "+branch);
		 System.out.println("My dept is "+dept);
		 System.out.println("My gender is "+gen);
		 System.out.println("My passout year is "+year);
		 System.out.println("My weight is "+weight);
		 System.out.println("=========================");
	 }

	//name, PRN, branch, dept, gender, passoutyear, weight
	 // with parameter
	public void StudentInfo(String name, String PRN, String branch,String dept, char gender, int passoutyear, float weight)
	 {
		
	 System.out.println("=========================");
	 System.out.println("My name is "+name);
	 System.out.println("My PRN number is "+PRN);
	 System.out.println("My branch is "+branch);
	 System.out.println("My dept is "+dept);
	 System.out.println("My gender is "+gender);
	 System.out.println("My passout year is "+passoutyear);
	 System.out.println("My weight is "+weight);
	 
	 }
}

	
		 
		 
		 
		 
		 
	

