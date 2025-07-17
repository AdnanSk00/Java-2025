package tka_may19_Comparable_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class C06_CitiesTreeSetData {
	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();
		
		names.add("Pune");
		names.add("Mumbai");
		names.add("Nashik");
		names.add("Pune");
		names.add("Nashik");
		
		for(Object nm : names) {
			System.out.println(nm);
		}		
	}
}
