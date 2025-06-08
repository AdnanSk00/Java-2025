package tka_may20_IPLminiProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C2_A {
	
	public static void main(String[] args) {
		
		// 6. Display maximum score player
		
		C1_Player p1 = new C1_Player(18, "Kohli", 183);
		C1_Player p2 = new C1_Player(45, "Rohit", 264);
		C1_Player p3 = new C1_Player(7, "Dhoni", 125);

		List<C1_Player> playersList = new ArrayList<>();
		
		playersList.add(p1);
		playersList.add(p2);
		playersList.add(p3);
		
		 C1_Player maxScorePlayer = Collections.max(playersList, new ScoreComp());
		
//		int maxScore = 0;
//		
//		for(C1_Player p : playersList) {
//			if(p.score > maxScore) {
//				maxScore = p.score;
//				maxScorePlayer = p;
//			}
////			System.out.println(p);
//		}
//		System.out.println(maxScore);
		System.out.println(maxScorePlayer);
	
	}
}
