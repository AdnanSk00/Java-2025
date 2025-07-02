package tka_may21_Map;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.List;

public class C3_A {
	
	public static void main(String[] args) {
		
		List<C2_Player> RCB = new ArrayList<>();
		RCB.add(new C2_Player(18, "Kohli", 79));
		RCB.add(new C2_Player(4, "Salt", 36));
		RCB.add(new C2_Player(12, "Patidar", 53));
		
		List<C2_Player> MI = new ArrayList<>();
		MI.add(new C2_Player(45, "Rohit", 13));
		MI.add(new C2_Player(33, "Hardik", 57 ));
		MI.add(new C2_Player(48, "SKY", 8));
		
		List<C2_Player> CSK = new ArrayList<>();
		CSK.add(new C2_Player(7, "Dhoni", 72));
		CSK.add(new C2_Player(4, "Ruturaj", 36 ));
		CSK.add(new C2_Player(11, "Jadeja", 42));
		
		Map <String, List<C2_Player>> IPL2025 = new HashMap<>();	// random
		
		IPL2025.put("RoyalChallengersBangalore", RCB);
		IPL2025.put("MumbaiIndians", MI);
		IPL2025.put("ChennaiSuperKings", CSK);
		
//		System.out.println(IPL2025);
		IPL2025.forEach((k, v) -> System.out.println(k + " : " + v));
			
			
	}
}
