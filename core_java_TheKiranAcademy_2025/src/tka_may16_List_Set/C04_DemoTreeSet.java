package tka_may16_List_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_DemoTreeSet {
	public static void main(String[] args) {
		
		System.out.println("> TreeSet ============");
		
//		TreeSet<Integer> ts = new TreeSet<>();
		Set<Integer> ts = new TreeSet<>();		// DD
		ts.add(11);			// sorted - no duplication
		ts.add(7);
		ts.add(44);
		ts.add(22);
		ts.add(44);
		ts.forEach(System.out::println);

	}
}
