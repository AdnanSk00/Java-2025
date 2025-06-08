package tka_may21_Map;

public class C2_Player {
	
	int id;
	String name;
	int score;
	
	public C2_Player() {
		// TODO Auto-generated constructor stub
	}

	public C2_Player(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "C1_Player [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}
