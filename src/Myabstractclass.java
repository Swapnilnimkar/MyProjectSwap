
public abstract class Myabstractclass {

	public static void main(String[] args) {

		cc c = new cc();
		c.test();
		c.test1();
		c.test2();
	}

	public abstract void test();// incomplete

	public void test1() {
		System.out.println("java");
	}

	public abstract void test2();

}
