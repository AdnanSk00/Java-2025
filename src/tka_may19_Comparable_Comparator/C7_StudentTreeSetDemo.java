package tka_may19_Comparable_Comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class C7_StudentTreeSetDemo {
	public static void main(String[] args) {
		
		List<C4_Student> studTreeSet = new ArrayList<>();	// for int
		// TreeSet.add() --> Comparable.compareTo()		// byDefault method
		// List --> Comparator --> Collections.sort();
		studTreeSet.add(new C4_Student(56, "Babar", 198.6f));
		studTreeSet.add(new C4_Student(5, "Rohit", 264.8f));	// error
		studTreeSet.add(new C4_Student(45, "Rohit", 264.9f));	// error
		studTreeSet.add(new C4_Student(18, "Virat", 183.2f));
		
		System.out.println("Sort By ID : ");
		Comparator <C4_Student>idComp = new C8_StudIdComp();
		Collections.sort(studTreeSet, idComp);
		studTreeSet.forEach(System.out::println);

		System.out.println("\nSort By Name : ");
		Comparator <C4_Student>nameComp = new C9_StudNameComp();
		Collections.sort(studTreeSet, nameComp);
		studTreeSet.forEach(System.out::println);
		
		System.out.println("\nSort By Per Desc: ");
		Comparator <C4_Student>perComp = new C91_StudPerComp();
		Collections.sort(studTreeSet, perComp);
		studTreeSet.forEach(System.out::println);
	}
}
