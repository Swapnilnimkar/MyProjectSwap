package accessSpecifier;

public class Demo {

	public static void main(String[] args) {
    PrivateUse P=new PrivateUse(); // Created object of another class
      P.test1(); //calling public test1 method
   // P.test2(); //private methods can be called only within class
      P.test3(); //default methods can be accessed within package
      
      

	}

}
