package variable_Types;

public class GlobalVariable {

	int a = 10;// global non static variable
	static int b = 90;// global static variable

	public static void main(String[] args) {

		GlobalVariable gv =new GlobalVariable(); //create object
		gv.test(); //calling non-static method
		
		test1();  //calling static method
		System.out.println("Value of a: "+gv.a); //calling non static global variable ----->objectname.variablename
		System.out.println("Value of b is: "+b); //calling static global variable from same class---->variable_name
		//call non-static global variable from another class
		AnotherGlobalVariable agv=new AnotherGlobalVariable();  //created object of another class
		System.out.println("Global non-static variable from another class: "+agv.p);
		//call static global variable from another class
		System.out.println("Global static variable from another class: "+AnotherGlobalVariable.q);
		
		int sub=800-gv.a; //using non-static global variable from same class
		int sub1=900-b;  //using static global variable from same class
		
		int sub2=1000-agv.p;  //using non-static global variable from another class
		int sub3=3000-agv.q; //using static global variable from another class
	}

	public void test() {  //non-static method
		int sum = a + 10;  //We can call non-static global variable
		int sub = b - 10;  //we can call static global variable
	}

	public static void test1() {  //static method
		// int sum=a+10;  //We can't call non-static global variable
		int sub = b - 10;  //we can call static global variable

	}

}