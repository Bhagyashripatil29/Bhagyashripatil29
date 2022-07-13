package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashsetStudy {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add("Pune");
		lh.add("Pune");
		lh.add(null);
		lh.add(null);
		lh.add(123);
		lh.add('A');
		lh.add(123.12);
		lh.add(true);
		
		System.out.println(lh);
		System.out.println("1] "+lh.size());
		System.out.println("2] "+lh.isEmpty());
		System.out.println("3] "+lh.contains('A'));
		System.out.println("4] "+lh.remove(123.12));
		System.out.println(lh);
		
		System.out.println("=============by using for loop============");
		
//		for(int i=0; i<=lh.size()-1;i++) {
//			System.out.println(lh.get(i));
//		}
		
		System.out.println("=============by using for each loop==============");
		
		for(Object j:lh) {
			System.out.println(j);
		}
		
		System.out.println("============by using iterator=============");
		
		Iterator itr = lh.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
	}

}
