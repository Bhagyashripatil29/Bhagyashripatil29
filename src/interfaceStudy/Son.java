//Multiple Inheritance by using Interface

package interfaceStudy;

public class Son implements Father, Mother{

	public static void main(String[] args) {

		Son s=new Son();//created object of son class
		s.care();
		s.love();
		s.nature();
		s.receipe();
		s.money();
		Father.test();//calling static method from fathers interface
		Mother.test();////calling static method from Mothers interface
	}

	@Override
	public void receipe() {
		System.out.println("Mother Receipe completed in son class");
		
	}

	@Override
	public void care() {
		System.out.println("Mother Care completed in son class");

		
	}

	@Override
	public void love() {
		System.out.println("Faters love completed in son class");

		
	}

	@Override
	public void nature() {
		
		System.out.println("Fathers Nature completed in son class");

		
	}

	@Override
	public void money() {
		
		Father.super.money();//super keyword is used to resolve calling issue
		Mother.super.money();
		
	}

}
