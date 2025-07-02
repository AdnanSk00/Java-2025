package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C95_EmpIdComp implements Comparator<C93_EmployeeHW>{

	public int compare(C93_EmployeeHW s1, C93_EmployeeHW s2) {
		
//		Integer i1 = new Integer(s1.id);
//		Integer i2 = new Integer(s2.id);
//		return i1.compareTo(i2);
		
		return new Integer(s1.id).compareTo(new Integer(s2.id));
	}
	
}
