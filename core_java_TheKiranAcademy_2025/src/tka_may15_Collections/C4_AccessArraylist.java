package tka_may15_Collections;

import java.util.ArrayList;

public class C4_AccessArraylist {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Jalgaon");
		names.add("Mumbai");
		names.add("Nashik");
		names.add("string");
		
		for(Object nm : names) {		// Dynamic Dispatch
			System.out.println(nm);
		}
		
		System.out.println("---------------");
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(11);
		nums.add(22);
		nums.add(33);
//		nums.add("java");
		nums.add(44);
		
		for(Integer n : nums) {
//			Integer i1 = new Integer((int) t);
//			int n = i1;
			if(n.intValue() %2 == 0) {
				System.out.println(n);
				
			}
		}
	}
}
