package tka_may15_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C5_A2 {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		System.out.println("Size > " + al.size());
		
		al.add(11);
		al.add(22);
		al.add(33);
//		al.add("java");
//		al.add("php");
//		al.add("cpp");
		
//		System.out.println(al);
//		Object data4 = al.get(4);
//		System.out.println("Index of 4 > " + data4);
		
//		for(int i = 0; i < al.size(); i++){
//			System.out.print(al.get(i) + " ");
//		}
//		System.out.println();
//		for(Object data : al) {
//			System.out.print(data + " ");
//		}
//		Iterator itr = al.iterator();
////		boolean hasNext = itr.hasNext();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());		
//		}
			
//		ListIterator lstItr = al.listIterator();
//		while(lstItr.hasNext()) {
//			System.out.println(lstItr.next());		
//		}
//		while(lstItr.hasPrevious()) {
//			System.out.println(lstItr.previous());		
//		}
		
//		al.forEach(t-> System.out.println(t));
		al.forEach(System.out::println);
	}
}
