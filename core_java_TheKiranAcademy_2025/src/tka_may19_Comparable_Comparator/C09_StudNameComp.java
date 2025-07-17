package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C09_StudNameComp implements Comparator<C04_Student>{

	@Override
	public int compare(C04_Student s1, C04_Student s2) {
		
		return s1.name.compareTo(s2.name);
	}
	
	
}
