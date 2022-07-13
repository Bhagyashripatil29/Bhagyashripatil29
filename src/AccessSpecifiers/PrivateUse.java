package AccessSpecifiers;

public class PrivateUse {
	
	public static void main(String[] args) {
		
		PrivateUse pu=new PrivateUse();
		pu.test1();  //calling private method
		pu.test2();  //calling default method
		pu.test3();  //calling protected method
		pu.test4();  //calling public method
		
		
	}
	
	private void test1() {
		
		System.out.println("This is private test1 method");
	}
	
	void test2() {
		
		System.out.println("This is default test2 method");
	}
	
	protected void test3() {
		
		System.out.println("This is protected test3 method");
	}

	public void test4() {
		
		System.out.println("This is public test4 method");
	}
}
