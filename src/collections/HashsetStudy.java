package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetStudy {

	//This is random insertions.
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add("Pune");
		hs.add("Pune");
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(123.123);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println("1] "+hs.size());
		System.out.println("2] "+hs.isEmpty());
		System.out.println("3] "+hs.equals(hs));
		System.out.println("4] "+hs.contains('A'));
		System.out.println("5] "+hs.remove("Pune"));
		System.out.println(hs);
		
		System.out.println("================By using for loop================");
		
//		for(int i=0;i<=hs.size()-1;i++) {
//			System.out.println(hs.get(i));
//		}
		
		System.out.println("=============by using for each loop==============");
		
		for(Object j:hs) {
			System.out.println(j);
		}
		
		System.out.println("=============by using iterator================");
		
		Iterator itr = hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
	}

}
