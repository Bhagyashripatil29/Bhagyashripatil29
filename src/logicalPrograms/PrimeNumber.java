package logicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		//12-->  2----11
		
		int num=11;
		int count=0;
		
		for(int i=2;i<num;i++) { //2,3
			
			if(num%2==0) {
				
				count++;
				break;
			}
			
		}
		if(count==1) {
			
			System.out.println("Given number is not a prime number");
		}
		else {
			System.out.println("Giver Number is prime number");
		}
		
	}

}
