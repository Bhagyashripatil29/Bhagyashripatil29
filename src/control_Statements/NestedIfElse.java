package control_Statements;

public class NestedIfElse {

	public static void main(String[] args) {

		/*
		 * if user_name is correct---->Enter password
		 * {
		 * 		if-->password is correct--->Login Successfully
		 * 		else->password is incorrect or enter correct password
		 * }
		 * else--->enter correct user_name
		 */
		
		String UN="Dhanu";
		String PWD="dhanu@123";
		
		if(UN=="Dhanu") {
			
			System.out.println("Enter Password");
			if (PWD=="dhanu@123") {
				
				System.out.println("Login Successfully");
			} else {
				
				System.out.println("Password is incorrect");
				
			}
		}
		else {
			System.out.println("Enter correct username");
		}
	}

}
