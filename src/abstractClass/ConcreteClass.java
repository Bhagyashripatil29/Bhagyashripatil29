package abstractClass;

public class ConcreteClass extends AbstractStudy {

	public static void main(String[] args) {
		
		// as we can't create object of abstract class
		// creating object of concrete class
		ConcreteClass cc = new ConcreteClass(); // created object of concrete class
		cc.test();
		cc.test1();
		cc.test2();
		cc.sample();

	}

	@Override
	public void test() {
		System.out.println("This method is complete in concrete class");
	}

	public void sample() {
		System.out.println("This is own method of Concrete class");
	}
}
