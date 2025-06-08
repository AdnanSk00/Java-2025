package tka_may20_IPLminiProject;

import java.util.Comparator;

public class ScoreComp implements Comparator <C1_Player>{

	@Override
	public int compare(C1_Player p1, C1_Player p2) {

		return new Integer(p1.score).compareTo(new Integer(p2.score));
	}

}
