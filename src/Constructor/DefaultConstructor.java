package Constructor;

public class DefaultConstructor {
	
//	public DefaultConstructor() {    //default Constructor Compiler
//		
//		
//	}
	

	public static void main(String[] args) {

		DefaultConstructor dc=new DefaultConstructor();   //object created
		dc.test();   //method calling
		
	}
	public void test() {
		
		System.out.println("Hi This is Default Constructor");
		
	}

}
