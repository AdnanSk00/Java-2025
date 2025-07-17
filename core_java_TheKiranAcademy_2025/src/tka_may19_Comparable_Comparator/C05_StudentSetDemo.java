package tka_may19_Comparable_Comparator;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class C05_StudentSetDemo {
	public static void main(String[] args) {
		
//		Set<C04_Student> studTreeSet = new TreeSet<>();
//				
//		studTreeSet.add(new C04_Student(45, "Rohit", 264.8f));	// error
//		studTreeSet.add(new C04_Student(56, "Babar", 198.6f));
//		studTreeSet.add(new C04_Student(18, "Virat", 183.2f));
//		
//		studTreeSet.forEach(System.out::println);
		
		System.out.println();
		
		Set<C04_Student> studHashSet = new HashSet<>();
		
		studHashSet.add(new C04_Student(45, "Rohit", 264.8f));
		studHashSet.add(new C04_Student(56, "Babar", 198.6f));
		studHashSet.add(new C04_Student(18, "Virat", 183.2f));
		
		studHashSet.forEach(System.out::println);
//		
		System.out.println();
		
		Set<C04_Student> studLinkedHashSet= new LinkedHashSet<>();
		
		studLinkedHashSet.add(new C04_Student(45, "Rohit", 264.8f));
		studLinkedHashSet.add(new C04_Student(56, "Babar", 198.6f));
		studLinkedHashSet.add(new C04_Student(18, "Virat", 183.2f));
		
		studLinkedHashSet.forEach(System.out::println);
	}
}
