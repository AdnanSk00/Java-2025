package tka_may19_Comparable_Comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class C07_StudentTreeSetDemo {
	public static void main(String[] args) {
		
		List<C04_Student> studTreeSet = new ArrayList<>();
		// TreeSet.add() --> Comparable.compareTo()		// byDefault method
		// List --> Comparator --> Collections.sort();
		studTreeSet.add(new C04_Student(56, "Babar", 198.6f));
		studTreeSet.add(new C04_Student(5, "Rohit", 264.8f));	// error
		studTreeSet.add(new C04_Student(45, "Rohit", 264.9f));	// error
		studTreeSet.add(new C04_Student(18, "Virat", 183.2f));
		
		System.out.println("Sort By ID : ");
//		Comparator <C4_Student>idComp = new C8_StudIdComp();
		Comparator <C04_Student>idComp = (C04_Student s1, C04_Student s2) -> {	// class StudIdComp
			return new Integer(s1.id).compareTo(new Integer(s2.id));
		};
		Collections.sort(studTreeSet, idComp);
		studTreeSet.forEach(System.out::println);

		System.out.println("\nSort By Name : ");
//		Comparator <C4_Student>nameComp = new C9_StudNameComp();
		Comparator <C04_Student>nameComp = (C04_Student s1, C04_Student s2) -> {
			return s1.name.compareTo(s2.name);
		};
		Collections.sort(studTreeSet, nameComp);
		studTreeSet.forEach(System.out::println);
		
		System.out.println("\nSort By Per Desc: ");
//		Comparator <C4_Student>perComp = new C91_StudPerComp();
		Comparator <C04_Student>perComp = (C04_Student s1, C04_Student s2) -> {
			return new Float(s2.per).compareTo(new Float(s1.per));
		};
		Collections.sort(studTreeSet, perComp);
		studTreeSet.forEach(System.out::println);
	}
}
