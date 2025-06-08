package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C8_StudIdComp implements Comparator<C4_Student>{

	public int compare(C4_Student s1, C4_Student s2) {
		
//		Integer i1 = new Integer(s1.id);
//		Integer i2 = new Integer(s2.id);
//		return i1.compareTo(i2);
		
		return new Integer(s1.id).compareTo(new Integer(s2.id));
	}
	
//	public int compare(C4_Student s1, C4_Student s2) {
//		if(s1.id == s2.id)
//			return 0;
//		else if(s1.id > s2.id)
//			return 1;
//		else 
//			return -1;
//	}
	
}
