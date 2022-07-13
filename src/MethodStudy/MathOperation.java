package MethodStudy;

public class MathOperation {

	public static void main(String[] args) {
		
		MathOperation mo = new MathOperation();   //calling non-static method from same class by using object
		mo.add();								
		
		sub();									//calling static method from same class
		
		MathOpAnotherClass.mul();     //calling static method from another class
		
		MathOpAnotherClass moac = new MathOpAnotherClass();		//calling non-static method from another class
		moac.div();
		
	}
	
	public void add() {
		
		int a;          //variable declaration
		int b;			//assign value
		int addition;
		
		a=50;
		b=50;
		
		addition= a+b;   
		
		System.out.println("Addition of two numbers= "+addition);
	}
	
	public static void sub() {
		
		int a = 100;     //variable declaration + assign value
		int b = 50;		//variable declaration + assign value
		
		int subtraction = a-b;   //variable declaration + assign value
		
		System.out.println("Subtraction of two numbers= "+subtraction);
	}

}
