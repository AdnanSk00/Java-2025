package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C9_StudNameComp implements Comparator<C4_Student>{

	@Override
	public int compare(C4_Student s1, C4_Student s2) {
		
		return s1.name.compareTo(s2.name);
	}
	
	
}
