package arrays;

public class MultiDimensionalCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Without using new keyword-->1.array declaration
		char grade[][]= {{'A','B'},{'C','D'}};
		
		//2.usage
		
		for(int i=0;i<=grade.length-1;i++) {
			for(int j=0;j<=grade.length-1;j++) {
				
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
	}

}
