package tka_may21_Map;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class C1_DemoMap {
	
	public static void main(String[] args) {
		
		// add(11),   add("Pune"),   add(e1)
		// add("Jaiswal", 36)	error
		
		// key - unique -- set
		// value - duplicate -- list
		// Map - set + list
		
		Map <String, Integer> scoreCard = new HashMap<>();	// random
//		Map <String, Integer> scoreCard = new TreeMap<>();	// sorted
//		Map <String, Integer> scoreCard = new LinkedHashMap<>();	// In order
		
		scoreCard.put("Jaiswal", 36);
		scoreCard.put("Vaibhav", 7);
		scoreCard.put("Sanju", 41);
		scoreCard.put("Vaibhav", 57);
		scoreCard.put("Jurel", 0);
		scoreCard.put("Archor", 0);
//		scoreCard.put(true, '@');
		
		System.out.println(scoreCard);
		scoreCard.forEach((k, v) -> System.out.println(k + " : " + v));
			
			
	}
}
