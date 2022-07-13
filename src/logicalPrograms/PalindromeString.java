package logicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string..");
		String org = sc.next();
		String rev = "";
		
		for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);
			
		}
		System.out.println("Original String is "+org);
		System.out.println("Reverse string is "+rev);
		
		if(org.equals(rev)) {
			
			System.out.println("Giver String is Palindrome");
		}
		else {
			
			System.out.println("Given String is not Palindrome");
		}
	}
	


}
