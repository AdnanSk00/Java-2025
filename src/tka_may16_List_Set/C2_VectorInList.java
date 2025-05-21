package tka_may16_List_Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class C2_VectorInList {
	public static void main(String[] args) {
		
		List<String> names = new Vector<>();
				
		names.add("Jalgaon");
		names.add("Pune");
		names.add("Mumbai");
		names.add("Nashik");
		names.add("string");
		names.add("Mumbai");
		
		for(Object nm : names) {
			System.out.println(nm);
		}
		
		names.remove(2);
		
		System.out.println("----------");
		
		for(Object nm : names) {
			System.out.println(nm);
		}
		
	}
}
