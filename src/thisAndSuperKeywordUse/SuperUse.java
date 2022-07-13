package thisAndSuperKeywordUse;

public class SuperUse extends ThisUse {
	
	int a=500;

	public static void main(String[] args) {
		
		SuperUse su=new SuperUse();
		su.Subtraction();

		
	}
	public void Subtraction() {
		
		int a=10;
		
		int sub=a-100;  //using global value from same class
		System.out.println("Subtraction 1 of Local variable is: "+sub);
		
		int sub2=this.a-100;
		System.out.println("Subtraction 2 of same class is: "+sub2);
		
		int sub3=super.a-80;  //using global value of a from Super(Another) class
		System.out.println("Subtraction 3 of super class is: "+sub3);
		
	}

}
