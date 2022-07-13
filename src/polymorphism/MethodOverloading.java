package polymorphism;

public class MethodOverloading {

	public void add() {
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println("Sum is:"+sum);
	}
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum is:"+sum);
	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum is:"+sum);
	}
	public static void main(String[] args) {

		//Declaring multiple methods with same method name but with 
		//different argument in a same class is called method overloading
		
		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(100, 200);
		mo.add(50, 50, 100);
		
	}

}
