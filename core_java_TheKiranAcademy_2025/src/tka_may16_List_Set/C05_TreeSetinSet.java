package tka_may16_List_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05_TreeSetinSet {
	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<>();
		
		nums.add(11);		// No duplication - Sorted
		nums.add(22);
		nums.add(100);
		nums.add(-7);		
		nums.add(22);
		nums.add(44);
		
		for(Integer n : nums) {
				System.out.println(n);
		}
		System.out.println("--------------------");
		Set<Integer> ht = new HashSet<>();
		
		ht.add(11);		// No duplication - UnSorted - random
		ht.add(22);
		ht.add(100);
		ht.add(22);
		ht.add(22);
		ht.add(44);
		
		for(Integer n : ht) {
			System.out.println(n);
		}
		
	}
}
