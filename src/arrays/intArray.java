package arrays;

public class intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Array declaration
		int rollNo[]=new int[5];
		
		//2.Array initialization
		rollNo[0]=101;
		rollNo[1]=102;
		rollNo[2]=103;
		rollNo[3]=104;
		rollNo[4]=105;
		
		//3.usage
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		System.out.println(rollNo[3]);
		System.out.println(rollNo[4]);
		System.out.println("=============");
		
		//Static for loop
		for(int i=0;i<=4;i++) {
			System.out.println(rollNo[i]);
		}
		System.out.println("===============");
		
		//Dynamic for loop-reverse order
		for(int i=rollNo.length-1;i>=0;i--) {
			System.out.println(rollNo[i]);
		}
		
		System.out.println("=================");
		
		//Dynamic for loop-sequence wise
		for(int i=0; i<=rollNo.length-1;i++) {
			System.out.println(rollNo[i]);
		}
	}

}
