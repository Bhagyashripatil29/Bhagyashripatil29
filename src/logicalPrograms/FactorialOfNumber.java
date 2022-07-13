package logicalPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) {

		//4! = 4*3*2*1
		
		int num = 4;
		int fact = 1;
		
		for(int i=num;i>=1;i--) { //4,3,2,1
			
			fact=i*fact;
			
			//4*1=4
			//3*4=12
			//2*12=24
			//1*24=24
			
		}
		System.out.println("Factorial of num is "+fact);
	}

}
