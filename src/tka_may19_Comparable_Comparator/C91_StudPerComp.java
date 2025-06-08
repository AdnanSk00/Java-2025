package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C91_StudPerComp implements Comparator<C4_Student>{

	public int compare(C4_Student s1, C4_Student s2) {
		
//		Float f1 = new Float(s1.per);
//		Float f2 = new Float(s2.per);
//		return f1.compareTo(f2);
		
//		return new Float(s2.per).compareTo(new Float(s1.per));
		return new Float(s1.per).compareTo(new Float(s2.per));
	}
	
//	public int compare(Student s1, Student s2) {
//		if(s1.per == s2.per)
//			return 0;
//		else if(s1.per < s2.per)	// For Ascending
////		else if(s1.per > s2.per)	// For Descending
//			return 1;
//		else 
//			return -1;
//	}
	
}
