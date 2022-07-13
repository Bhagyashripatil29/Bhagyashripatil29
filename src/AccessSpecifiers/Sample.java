package AccessSpecifiers;

public class Sample {

	public static void main(String[] args) {

		PrivateUse p =new PrivateUse();  //created object from another class
		
		p.test2();  //calling default method
		p.test3();  //calling protected method
		p.test4();  //calling public method
		
	}

}
