package tka_may16_List_Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class C7_SetAllClasses {
	public static void main(String[] args) {
		
		System.out.println("> TreeSet ============");
		Set<Integer> ts = new TreeSet<>();
		ts.add(11);			// sorted - no duplication
		ts.add(7);
		ts.add(44);
		ts.add(22);
		ts.add(44);
		ts.forEach(System.out::println);

		System.out.println("> HashSet ============");
		Set<Integer> hs = new HashSet<>();
		hs.add(11);			// random - no duplication
		hs.add(7);
		hs.add(22);
		hs.add(44);
		hs.add(22);
		hs.forEach(System.out::println);
		
		System.out.println("> LinkedHashSet ============");
		Set<Integer> lhs = new LinkedHashSet<>();		// follow - List as well as Set
		lhs.add(11);		// follow order (List) - no duplication (Set)
		lhs.add(7);
		lhs.add(44);
		lhs.add(22);
		lhs.add(7);
		lhs.forEach(System.out::println);
		
	}
}
