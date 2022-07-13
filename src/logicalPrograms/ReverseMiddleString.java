package logicalPrograms;

public class ReverseMiddleString {

	public static void main(String[] args) {

		String a = "I LOVE MY INDIA";
		//even place reverse
		
		String[] arr = a.split(" ");
		
		//arr={"I","LOVE","MY","INDIA"}
//				1	  2		3	  4
		
		for(int i=0;i<=arr.length-1;i++) { //0,1,2
			
			if(i%2!=0) { //odd----------->even i%2==0
				
				String s = arr[i];//convert to array to string
				arr[i]=reverse(s);
			}
		}
		
		
		for(int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static String reverse(String inp) {
		
		String rev="";
		for(int i=inp.length()-1;i>=0;i--) {
			
			rev=rev+inp.charAt(i);
		}
		return rev;
		
	}

}
