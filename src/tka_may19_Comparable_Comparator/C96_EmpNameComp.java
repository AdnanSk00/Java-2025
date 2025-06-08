package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C96_EmpNameComp implements Comparator<C93_EmployeeHW> {

	@Override
	public int compare(C93_EmployeeHW s1, C93_EmployeeHW s2) {
		return s1.name.compareTo(s2.name);
	}

}
