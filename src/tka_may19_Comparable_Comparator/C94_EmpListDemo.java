package tka_may19_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C94_EmpListDemo {
	public static void main(String[] args) {
				
		List <C4_Student> EmpList = new ArrayList<>();
		
		System.out.println("Sorted By Id");
		EmpList.add(new C93_EmployeeHW(101, "Smith", "Developer", 75.000f));
		EmpList.add(new C93_EmployeeHW(102, "Allen", "Manager", 68.000f));
		EmpList.add(new C93_EmployeeHW(103, "John", "Analyst", 84.000f));
		
		System.out.println("Sort By ID : ");
		Comparator <C4_Student>idComp = new C8_StudIdComp();
		Collections.sort(studTreeSet, idComp);
		studTreeSet.forEach(System.out::println);

		System.out.println("\nSort By Name : ");
		Comparator <C4_Student>nameComp = new C9_StudNameComp();
		Collections.sort(studTreeSet, nameComp);
		studTreeSet.forEach(System.out::println);
		
		System.out.println("\nSort By Per Desc: ");
		Comparator <C4_Student>perComp = new C91_StudPerComp();
		Collections.sort(studTreeSet, perComp);
		studTreeSet.forEach(System.out::println);
	}
}
