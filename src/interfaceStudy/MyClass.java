package interfaceStudy;

public class MyClass implements MyInterface{

	public static void main(String[] args) {

		MyClass m=new MyClass(); // created object of implementation class
		m.test();
		m.test1();
		m.myMethod();
//		a=a+10;we can't update variable from interface
		System.out.println("value of a: "+a);
	}

	@Override
	public void test() {

		System.out.println("Hi this method completed in implementation class");
	}

	@Override
	public void test1() {

		System.out.println("Hi this method completed in implementation class");

	}
	public void myMethod() {
		
		System.out.println("This is my myClass method");
	}

}
