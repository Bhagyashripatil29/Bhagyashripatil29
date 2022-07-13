package Constructor;

public class MultipleConstructor {

	int a; // globally variable declaration
	int b;

	public MultipleConstructor() { // user defined with zero parameter constructor

		a = 100;
		b = 200;

	}

	public MultipleConstructor(int x) { // user defined with single parameter constructor

		a = x;

	}

	public MultipleConstructor(int x, int y) { // user defined with two parameter constructor

		a = x;
		b = y;

	}

	public static void main(String[] args) {

		MultipleConstructor s1 = new MultipleConstructor();
		s1.test();

		MultipleConstructor s2 = new MultipleConstructor(500);
		s2.test();

		MultipleConstructor s3 = new MultipleConstructor(500, 700);
		s3.test();

	}

	public void test() {

//		a=10;
//		b=20;	

		int sum = a + b;

		System.out.println("Addition is: " + sum);

	}

}
