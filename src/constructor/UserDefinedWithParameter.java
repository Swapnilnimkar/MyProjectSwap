package constructor;

public class UserDefinedWithParameter {
     int a;
     int b;
     int c;
   
     public UserDefinedWithParameter()//with 0 parameter
     {
    	a=10;
    	b=20;
    	c=30;
    	}
     public UserDefinedWithParameter(int x) // with one parameter

     {
    	a=x;
    	//b=0 default value
    	//c=0
     }
     public UserDefinedWithParameter(int x ,int y) // with two parameter

     {
	      a=x;
	      b=y;
	      //c=o default    
     }
     
     public UserDefinedWithParameter(int x,int y, int z)// with 3 para
     {
     a=x;
     b=y;
     c=z;
    }
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        	
        	UserDefinedWithParameter US=new UserDefinedWithParameter();
        	US.addition();
        	US.mul();
        	
       	    UserDefinedWithParameter US1=new UserDefinedWithParameter(100);
        	US1.addition();
        	
        	UserDefinedWithParameter US2=new UserDefinedWithParameter(30,40);
        	US2.addition();
        	
        	UserDefinedWithParameter US3=new UserDefinedWithParameter(10,50,20);
       	    US3.addition();
        	

	}
        public void addition()// non static without para
        {
        	int sum=a+b+c;
        	System.out.println("my sum is "+sum);
        }
        public void mul()
        {
        int m=a*b*c;
        System.out.println("my mul is "+m);
        }
}