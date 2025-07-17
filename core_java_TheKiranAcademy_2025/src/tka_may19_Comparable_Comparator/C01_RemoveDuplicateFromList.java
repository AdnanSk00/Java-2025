package tka_may19_Comparable_Comparator;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

class A{
	void m1() {
		System.out.println("Hello Adnan");
	}
}

public class C01_RemoveDuplicateFromList{
	public static void main(String[] args) {
		
		A aa = new A();
//		aa.m1();		// Method calling chain
		new A().m1();
		
		List<Integer> nums = new ArrayList<>();		
		nums.add(11);
		nums.add(222);
		nums.add(-7);
		nums.add(44);
		nums.add(222);
		nums.add(-7);
		nums.add(55);
		System.out.println("nums > " + nums);
				
//		Set<Integer> setNums = new HashSet<>();
//		for(Integer n : nums) {		// step 1
//			setNums.add(n);
//		}
//		setNums.addAll(nums);		// step 2
		
//		Set<Integer> setNums = new HashSet<>(nums);		// step 3
		
//		System.out.println("setNums > " + setNums.toStrig());
		
//		System.out.println("setNums > " + new HashSet<>(nums));		// Step 4 - Method calling chain
		new HashSet<>(nums).forEach(System.out::println);
		
		
//		List<Integer> uniqNumsList = new ArrayList<>(setNums);	// step 2
//		uniqNumsList.addAll(setNums);							// step 3
		
//		List<Integer> uniqNumsList = new ArrayList<>(new HashSet<>(nums));		// step 4
//		uniqNumsList.addAll(new HashSet<>(nums));
		
//		System.out.println("uniqNumsList > " + uniqNumsList);
		
		System.out.println("uniqNumsList > " + new ArrayList<>(new HashSet<>(nums)));
		
	}
}
