package Constructor;

public class UserDefinedConstructor {
	
	public UserDefinedConstructor() {
		
		System.out.println("Hi This is User Defined Constructor");
	}

	public static void main(String[] args) {

		UserDefinedConstructor ud = new UserDefinedConstructor();
		ud.test();

		
	}
	
	public void test() {
		
		System.out.println("This is test method");
	}

}
