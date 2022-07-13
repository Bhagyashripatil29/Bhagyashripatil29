package MethodStudy;

public class NonStaticMethodStudy {

	public static void main(String[] args) {

		//className objectNmae= new className();
		//objectName.methodName();  //calling non-static method
		
		NonStaticMethodStudy obj = new NonStaticMethodStudy();  //calling non-static method from same class
		obj.myMethod();											//calling non static method from same lass using object
		
		NonStaticAnotherClass objName = new NonStaticAnotherClass();
		objName.anotherMethod();
	}

	public void myMethod() {
		System.out.println("Hii This is non-static myMethod from same class");
	}
}
