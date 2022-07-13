package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {

		 LinkedList ll=new LinkedList();
		 ll.add("Pune");
		 ll.add("Pune");
		 ll.add(null);
		 ll.add(123);
		 ll.add(123.123);
		 ll.add('A');
		 ll.add(true);
		 
		 System.out.println(ll);
		 System.out.println("1] "+ll.size());
		 System.out.println("2] "+ll.isEmpty());
		 System.out.println("3] "+ll.contains("Pune"));
		 System.out.println("4] "+ll.indexOf(123));
		 System.out.println("5] "+ll.lastIndexOf(123.123));
		 System.out.println("6] "+ll.get(5));
		 ll.remove(1);
		 System.out.println("7] "+ll);
		 System.out.println("8] "+ll.peek());
		 System.out.println(ll);
		 System.out.println("9] "+ll.poll());
		 System.out.println(ll);
		 System.out.println("10] "+ll.pop());
		 System.out.println(ll);
		 System.out.println("11] "+ll.clone());
		 
		 //for loop
		 //for each
		 //iterator
		 //listiterator
		 
		 System.out.println("=========by using iterator==========");
		 Iterator itr = ll.iterator();
		 
		 while (itr.hasNext()) {
			System.out.println(itr.next());
		 }
		 
		 System.out.println("===========by using list-iterator===========");
		 
		 ListIterator litr = ll.listIterator();
		 
		 while (litr.hasNext()) {
			 System.out.println(litr.next());
			
		 }
		 
		 System.out.println("============by using for each loop============");
	
		 for(Object j:ll) {
			 
			 System.out.println(j);
		 }
		 
		 System.out.println("============by using for loop=============");
		 
		 for(int i=0;i<=ll.size()-1;i++) {
			 System.out.println(ll.get(i));
			 
		 }
	}

}
