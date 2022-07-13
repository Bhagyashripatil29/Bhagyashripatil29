package thisAndSuperKeywordUse;

public class ThisUse {

	int a=100; //Non static global variable
	static int c=50;  //static global variable 
	
	public static void main(String[] args) {
		
		ThisUse t=new ThisUse();
		t.Addtion();
		

	}
	
	public void Addtion() {
		
		int a=10;   //Non static Local variable
//		static int c=60;  //we can't create static variable with same name in same class
		
		int sum = a+900;
		System.out.println("Addition is: "+sum);
		
		int sum1 =this.a+900;
		System.out.println("Addition is: "+sum1); 
		
		System.out.println("Local variable is: "+a);
		System.out.println("Global variable is: "+this.a);
		System.out.println(c);
	}

}
