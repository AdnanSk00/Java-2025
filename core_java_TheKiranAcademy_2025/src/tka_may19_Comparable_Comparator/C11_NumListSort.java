package tka_may19_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_NumListSort {
	public static void main(String[] args) {
		
// 		age --> 22, 33, 25,  55, 23, 42, 55, 18
//		data should be duplicate & sorted [List + TreeSet ==> Collection.sort()]
		
		
		List <Integer> ageData = new ArrayList<>();
		
		ageData.add(22);
		ageData.add(23);
		ageData.add(55);
		ageData.add(18);
		ageData.add(55);
		ageData.add(22);
		System.out.println("Unsorted > " + ageData );
		
		Collections.sort(ageData);
		System.out.println("Sorted > " + ageData );
		
	}
}
