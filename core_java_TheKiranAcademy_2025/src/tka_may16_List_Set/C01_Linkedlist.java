package tka_may16_List_Set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class C01_Linkedlist {
	public static void main(String[] args) {
		
//		List<Integer> nums = new LinkedList<>();		// DD
		LinkedList<Integer> nums = new LinkedList<>();
		
		nums.add(11);		// ordered follow - duplication
		nums.add(22);
		nums.add(22);
		nums.add(100);
		nums.add(22);
		nums.add(44);
		
		for(Integer n : nums) {
				System.out.println(n);
		}
		
//	 Vector<Integer> vec = new Vector<>();
//			
//		vec.add(11);
//		vec.add(22);
//		vec.add(100);
//		vec.add(44);
//		
//		for(Integer n :	vec) {
//				System.out.println(n);
//		}
	}
}
