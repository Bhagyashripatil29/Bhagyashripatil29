////Multiple Inheritance by using Interface

package interfaceStudy;

public interface Father {
	
	void love();
	void nature();
	default void money() {
		System.out.println("Fathers Money");
	}
	
	static void test() {
		
		System.out.println("Fathers test");
	}

}
