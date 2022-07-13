package casting;

public class Son extends Father {
	
	//to use the override method-->super class as it is in sub class method only method definations are changes
	public void car() {
		System.out.println("Honda Civic");
	}
	
	public void bike() {
		System.out.println("Jawa");
	}
	
	//it's own property of subclass property
	public void education() {
		System.out.println("BE");
	}

}
