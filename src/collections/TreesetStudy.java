package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		
		ts.add("Pune");
		ts.add("Pune");
		ts.add("abc");
		ts.add("AAA");
		ts.add("velocity");
		
		System.out.println(ts);
		System.out.println("1] "+ts.size());
		System.out.println("2] "+ts.isEmpty());
		System.out.println("3] "+ts.pollFirst());
		System.out.println(ts);
		System.out.println("4] "+ts.pollLast());
		System.out.println(ts);
		System.out.println("5] "+ts.contains("AAA"));
		
		System.out.println("===========by using iterator===========");
		
		Iterator itr = ts.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
			
		}
		 
		System.out.println("=============by using for each loop=============");
		
		for(Object i:ts) {
			System.out.println(i);
		}
		
		System.out.println("===========by using for loop=============");
		
//		for(int i=0;i<=ts.size()-1;i++ ) {
//			System.out.println(ts.get(i));
//			
//		}
	}

}
