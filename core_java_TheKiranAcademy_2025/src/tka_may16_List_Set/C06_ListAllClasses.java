package tka_may16_List_Set;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class C06_ListAllClasses {
	public static void main(String[] args) {
		
		System.out.println("> ArrayList ============");
		List<Integer> al = new ArrayList<>();
		al.add(11);		// follow ordered - allowed duplication
		al.add(7);
		al.add(44);
		al.add(22);
		al.add(44);
		al.forEach(System.out::println);

		System.out.println("> LinkedList ============");
		List<Integer> lkl = new LinkedList<>();
		lkl.add(11);	// follow ordered - allowed duplication
		lkl.add(7);
		lkl.add(44);
		lkl.add(7);
		lkl.add(22);
		lkl.forEach(System.out::println);
		
		System.out.println("> Vector ============");
		List<Integer> v = new ArrayList<>();	
		v.add(11);		// follow ordered - allowed duplicaiton
		v.add(7);
		v.add(44);
		v.add(22);
		v.add(11);
		v.add(11);
		v.forEach(System.out::println);
		
	}
}
