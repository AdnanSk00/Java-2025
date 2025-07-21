package tka_may21_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C5_DemoMap2 {
	
	public static void main(String[] args) {
		
//		Map <String, Integer> mp = new HashMap<>();	// random - support null
//		Map <String, Integer> mp = new TreeMap<>();	// does not support null key but support null value
//		Map <String, Integer> mp = new LinkedHashMap<>();	// order - support null

		Map <String, Integer> mp = new Hashtable<>();	// random	- Exception(not support null)
//		Note: Hashtable<>() does not support any null key or null value.
		
		mp.put("Jaiswal", 36);
		mp.put("Vaibhav", 7);
		mp.put("Zofra", 17);
		mp.put("Sanju", 36);
		mp.put("Vaibhav", 57);	// duplicate entry key
		mp.put(null, 0);
		mp.put("Jurel", null);
		mp.put(null, 110);
		mp.put("Parag", null);
		
		mp.forEach((k, v) -> System.out.println(k + " : " + v));
	
	}
}
