package arrays;

public class CharArray {

	public static void main(String[] args) {

		//1. Array declaration
		char grade[]=new char[5];
		
		//2.Array Initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		
		//3. usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		
		System.out.println("===================");
		
		for(int i=0;i<=grade.length-1;i++) {
			System.out.println(grade[i]);
		}
	}

}
