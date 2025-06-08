package tka_may20_IPLminiProject;

public class C1_Player {
	
	int id;
	String name;
	int score;
	
	public C1_Player() {
		// TODO Auto-generated constructor stub
	}

	public C1_Player(int id, String name, int score) {
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
