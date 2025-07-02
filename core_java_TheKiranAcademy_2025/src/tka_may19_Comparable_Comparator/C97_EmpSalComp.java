package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C97_EmpSalComp implements Comparator<C93_EmployeeHW> {

	public int compare(C93_EmployeeHW s1, C93_EmployeeHW s2) {
			
//		Double d1 = new Double(s1.per);
//		Double d2 = new Double(s2.per);
//		return d1.compareTo(d2);
			
		return new Float(s1.salary).compareTo(new Float(s2.salary));
//		return new Double(s2.salary).compareTo(new Double(s1.salary));
	}

}
