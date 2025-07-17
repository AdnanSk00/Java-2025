package tka_may19_Comparable_Comparator;

import java.util.Comparator;

public class C15_EmpNameComp implements Comparator<C12_EmployeeHW> {

	@Override
	public int compare(C12_EmployeeHW s1, C12_EmployeeHW s2) {
		return s1.name.compareTo(s2.name);
	}

}
