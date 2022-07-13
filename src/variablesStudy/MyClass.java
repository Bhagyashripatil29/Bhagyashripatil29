package variablesStudy;

public class MyClass {

	public static void main(String[] args) {

		//name,roll_no,grade,weight
		
		//1. Variable Declaration[Allocating/Reversing Memory]
		String StudName;
		int RollNo;
		char Grade;
		
		//All Primitive DataTypes- ie. 8 type
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		
		
		//2.Variable Initiation[Assigning/Inserting value]
		StudName="Manu";
		RollNo=10;
		Grade='A';
		
		//Initialization of all primitive datatype
		a = 100;
		b = 1000;
		c = 8;
		d = 1;
		e = 10.25f;
		g = 'A';
				
		
		
		//3.Usage means Printing the output
		System.out.println("****************STUDENT INFO******************");
		
		System.out.println("Student Name is: "+StudName);
		System.out.println("Roll No: "+RollNo);
		System.out.println("Grade: "+Grade);
		
		
		System.out.println("*************Primitive DataTypes**************");
		System.out.println("The value of byte a: "+a);
		System.out.println("The valu of short b: "+b);
		System.out.println("The value of int c: "+c);
		System.out.println("The value of long d: "+d);
		System.out.println("The vale of Float e: "+e);
		System.out.println();
		System.out.println();
		
		
	}

}
