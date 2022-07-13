package arrays;

public class stringArrayStudy {

	public static void main(String[] args) {
		// Ram,Seeta,Laxman
		
		//1.array declaration
		String name[] = new String[3];
		
		//2.array initialization
		name[0]="Ram";
		name[1]="Seeta";
		name[2]="Laxman";
		//name[3]="Ravan"; //ArrayIndexOutOfBoundsException because Index 3 out of bounds for length 3
		
		//3.usage
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		//System.out.println(name[3]);
		
		System.out.println("================");
		
		//Static for loop
		for(int i=0;i<=2;i++) {
			
			System.out.println(name[i]);
		}
		
		System.out.println("==================");
		
		//Dynamic for loop
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("==================");
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
		

	}

}
