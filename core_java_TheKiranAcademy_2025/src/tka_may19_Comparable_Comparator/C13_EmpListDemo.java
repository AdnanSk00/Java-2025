package tka_may19_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C13_EmpListDemo {
	public static void main(String[] args) {
				
		List <C12_EmployeeHW> EmpList = new ArrayList<>();
		
		EmpList.add(new C12_EmployeeHW(101, "Smith", "Developer", 75000.0));
		EmpList.add(new C12_EmployeeHW(103, "Allen", "Manager", 68000.0));
		EmpList.add(new C12_EmployeeHW(101, "John", "Analyst", 84000.0));
		EmpList.add(new C12_EmployeeHW(104, "Salt", "Businessman", 92000.0));
		
		System.out.println("Sort By ID : ");
		Comparator <C12_EmployeeHW>idComp = new C14_EmpIdComp();
		Collections.sort(EmpList, idComp);
		EmpList.forEach(System.out::println);

		System.out.println("\nSort By Name : ");
		Comparator <C12_EmployeeHW>nameComp = new C15_EmpNameComp();
		Collections.sort(EmpList, nameComp);
		EmpList.forEach(System.out::println);
		
		System.out.println("\nSort By Salary Desc: ");
		Comparator <C12_EmployeeHW>perComp = new C16_EmpSalComp();
		Collections.sort(EmpList, perComp);
		EmpList.forEach(System.out::println);
	}
}
