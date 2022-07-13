package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import javax.print.attribute.Size2DSyntax;

public class VectorStudy {

	public static void main(String[] args) {

		Vector v=new Vector();  //generic type vector
		
		v.add("Pune");
		v.add('S');
		v.add("Pune");
		v.add(null);
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(123.45);
		v.add(true);
		
		System.out.println("1] "+v);
		
		System.out.println("2] "+v.size());
		System.out.println("3] "+v.isEmpty());
		System.out.println("4] "+v.remove(0));
		System.out.println("5] "+v);
		System.out.println("6] "+v.get(3));
		
		//for
		//for each
		//iterator
		
		System.out.println("============using ListIterator==============");
		
		//using ListIterator
		ListIterator litr = v.listIterator();
		
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("==========**using enumeration**============");
		
		//using enumeration
		Enumeration el = v.elements();
		
		while (el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}
		
		System.out.println("===========using for each loop==============");

		//using for each loop
		
		for(Object i:v) {
			System.out.println(i);
		}
		
		System.out.println("===========using iterator==============");

		//using iterator
		
		Iterator el1 = v.iterator();
		
		while (el1.hasNext()) {
			System.out.println(el1.next());
		}
		
		System.out.println("==========using for loop===============");

		//using for loop
		
		for(int i = 0; i<=v.size()-1; i++) {
			
			System.out.println(v.get(i));
			
		}
		
		System.out.println("================+================");
	}

}
