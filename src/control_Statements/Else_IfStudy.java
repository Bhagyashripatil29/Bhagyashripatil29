package control_Statements;

public class Else_IfStudy {

	public static void main(String[] args) {

		/*
		 * marks>=66  you are in distinction
		 * marks>=60 and marks<66 then you are in 1st class
		 * marks>=50 and marks<60 then you are in 2nd class
		 * marks>=40 and marks<50 then you are in 3rd class
		 * marks<40 then you are failed
		 */
/*
 * >=66--->distinction
 * >=60 &<66---->1st class
 * >=50 & <60--->2nd class
 * >=40 & <50--->3rd class
 * <40--->failed		
 */
		int marks=95;
		
		if(marks>=66) {
			
			System.out.println("You are in distinction");
		}
		else if (marks>=60 & marks<66) {
			
			System.out.println("You are in 1st class");
		}
		else if (marks>=50 & marks<60) {
			
			System.out.println("You are in 2nd class");
			
		}
		else if (marks>=40 & marks<50) {
			
			System.out.println("You are in 3rd class");
			
		}
		else {
			System.out.println("You are failed");
		}
	}

}
