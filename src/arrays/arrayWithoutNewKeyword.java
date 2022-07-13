package arrays;

public class arrayWithoutNewKeyword {

	public static void main(String[] args) {
		// Ram,Laxman,Seeta
		
		//without new keyword--->1.array declaration & initialization
		String name[]= {"Ram","Laxman","Seeta"};

		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("============");
		
		int rollNo[]= {1,2,3,4,5};
		
		for(int i=0;i<=rollNo.length-1;i++) {
			System.out.println(rollNo[i]);
		}
		
		System.out.println("================");
		
		char grade[]= {'A','B','C','D','E'};
		
		for(int i=0;i<=grade.length-1;i++){
			System.out.println(grade[i]);
		}
	}

}
