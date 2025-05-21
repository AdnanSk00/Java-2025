package tka_may16_List_Set;

import java.util.ArrayList;
import java.util.List;

public class C3_CitiesList {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
				
		names.add("Jalgaon");
		names.add("Pune");
		names.add("Mumbai");
		names.add("Nashik");
		names.add("string");
		names.add("Mumbai");
		
		for(Object nm : names) {
			System.out.println(nm);
		}
	}
}
