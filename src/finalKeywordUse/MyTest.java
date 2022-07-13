package finalKeywordUse;

public class MyTest {

	public static void main(String[] args) {

		int a=10;
		
		a=a+20;
		
		System.out.println("Addition of a is: "+a);
		
		final int b=20;
		//b=b+20; if we make any variable as final then we can't update the value again
		
		int sum=a+b;
		System.out.println("Addition of a is: "+sum);

		
	}
	
//	public final void demo()
//	{
//	System.out.println("Hi i am demo method of MyTest calss");
//	}

	//so remove the final keyword...like that below
	public void demo()
	{
	System.out.println("Hi i am demo method of MyTest calss");
	}

}
