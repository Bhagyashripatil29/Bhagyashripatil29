package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.array declaration
		int a[][]=new int[2][2];
		
		//2.array initialization
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//3.usage
		System.out.print(a[0][0] +" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+ " ");
		System.out.println(a[1][1]);

		System.out.println("==============");
		
		for(int i=0;i<=a.length-1;i++) { //row-->0,1,2
			
			for(int j=0;j<=a.length-1;j++) { //column-->0,1,2
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
			
	}

}
