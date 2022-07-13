package MethodStudy;

public class WithMethodDeclaration {

	public static void main(String[] args) {
		
		myMethod();  //calling static regular method form same class
		Method1();   //calling static regular method form same class
		
		WithoutMethodDeclaration.Testing(); //calling static regular method from another class
		WithoutMethodDeclaration.Calculation(); //calling static regular method from another class

	}
	
	public static void myMethod(){     
		
		System.out.println("Hello This is my Method");
	}
	
	public static void Method1() {
		System.out.println("Hi This is my method1");
	}
}
