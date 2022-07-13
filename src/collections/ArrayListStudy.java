package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {

		//using arraylist
		ArrayList al=new ArrayList();  //generic array list
		al.add("Pune");
		al.add('A');
		al.add("Pune");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(1234.345);
		al.add(true);
		
		System.out.println("1]"+al);
		System.out.println("2] "+al.size());
		System.out.println("3] "+al.isEmpty());
		System.out.println("4] "+al.contains("Pune"));
		System.out.println("5] "+al.get(2));
		System.out.println("6] "+al.indexOf('A'));
		System.out.println("7] "+al.remove(2));
		System.out.println("8] "+al);
		
		al.add(2, "Katraj");
		System.out.println("9] "+al);
		
		System.out.println("===========using (by using for loop)==============");

		for(int i=0;i<=al.size()-1;i++) {
			System.out.println("10] "+al.get(i));
			
		}
		
		System.out.println("===========using Iterator(by while loop)==============");
		
		
		//using iterator
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		 
		System.out.println("==========using ListIterator(by while loop)===============");

		//using ListIterator
		ListIterator litr = al.listIterator();
		
		while (litr.hasNext()) {
			
			System.out.println(litr.next());
			
		}
		
		System.out.println("*********To print previous list*******************");

		while (litr.hasPrevious()) {
			
			System.out.println(litr.previous());
			
		}
		
		System.out.println("==========Using For each loop===============");
		
		//using foreach loop
		
		for(Object j:al) {
		
			System.out.println(j);
			
		}
		
		System.out.println("=========================");

		//Homogeneous array list---->alt means array-list-integer
		ArrayList<Integer>alt=new ArrayList<>();
		alt.add(1);
		alt.add(2);
		alt.add(4);
		alt.add(6);
		
		for(Integer k:alt) {
			System.out.println(k);
		}
		
		System.out.println("=========================");

		ArrayList<Character>alt2=new ArrayList<>();
		
		alt2.add('A');
		alt2.add('B');
		alt2.add('C');
		alt2.add('D');
		alt2.add('E');
		
		Iterator<Character> itr2 = alt2.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
		
		System.out.println("=========================");

	}

}
