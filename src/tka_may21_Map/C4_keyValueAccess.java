package tka_may21_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C4_keyValueAccess {
	
	public static void main(String[] args) {
		
			Map <String, Integer> scoreCard = new HashMap<>();	// random
			
			scoreCard.put("Jaiswal", 36);
			scoreCard.put("Vaibhav", 7);
			scoreCard.put("Sanju", 41);
			scoreCard.put("Vaibhav", 57);	// duplicate entry key
			scoreCard.put("Jurel", 0);
			scoreCard.put("Archor", 0);
			
			scoreCard.forEach((k, v) -> System.out.println(k + " : " + v));
			
			
			System.out.println("\nOnly Players Name : \n--------------");	// keys
			Set<String> keySet = scoreCard.keySet();
			for (String names : keySet) {
				System.out.println(names);	// one by one key - random
			}
			

			System.out.println("\nScore by Player Name : \n--------------");
			String inputName = "Jurel";	// index
			Integer scoreInputName = scoreCard.get(inputName);
			System.out.println(inputName + " --> "+ scoreInputName);
			
			
			System.out.println("\nOnly scores Values : \n--------------");
			Collection<Integer> allvalues = scoreCard.values();
			for(Integer score : allvalues) {
				System.out.println(score);	// random
			}
			
			
			System.out.println("\nPlayer Name : Scores \n-------------- ");
			for (String nameKey : keySet) {
				System.out.println(nameKey + " : " + scoreCard.get(nameKey));
			}
			
		
	
	}
}
