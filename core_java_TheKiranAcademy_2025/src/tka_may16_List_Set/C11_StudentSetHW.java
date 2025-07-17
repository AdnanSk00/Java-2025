package tka_may16_List_Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class C11_StudentSetHW {
	public static void main(String[] args) {
		
		C08_Student s1 = new C08_Student(45, "Rohit", 264.8f);
		C08_Student s2 = new C08_Student(18, "Virat", 183.2f);
		C08_Student s3 = new C08_Student(56, "Babar", 198.6f);
		C08_Student s4 = null;

//		Set<C8_Student> studTreeSet = new TreeSet<>();
//				
//		studTreeSet.add(s1);
//		studTreeSet.add(s3);
//		studTreeSet.add(s2);
//		studTreeSet.add(s1);
//		studTreeSet.add(s4);		
//		for(Object s : studTreeSet) {
//			System.out.println(s);
//		}
		
		Set<C08_Student> studHashSet = new HashSet<>();
		
		studHashSet.add(s1);
		studHashSet.add(s3);
		studHashSet.add(s2);
		studHashSet.add(s1);
		studHashSet.add(s4);		
		
//		studHashSet.forEach(System.out::println);
		for(Object s : studHashSet) {
			System.out.println(s);
		}
//		
		System.out.println();
		
		Set<C08_Student> studLinkedHashSet= new LinkedHashSet<>();
		
		studLinkedHashSet.add(s1);
		studLinkedHashSet.add(s3);
		studLinkedHashSet.add(s2);
		studLinkedHashSet.add(s1);
		studLinkedHashSet.add(s4);		
		for(Object s : studLinkedHashSet) {
			System.out.println(s);
		}
	}
}
