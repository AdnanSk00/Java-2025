package tka_june2_IPL_2025;

// POJO or Entity class
public class C2_Player {
	private int id;
	private String name;
	private String role;
	private int runs;
	private int wickets;
	private String teamName;
	private int jerseyNo;
	
	public C2_Player() {
	}

	public C2_Player(int id, String name, String role, int runs, int wickets, String teamName, int jerseyNo) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.runs = runs;
		this.wickets = wickets;
		this.teamName = teamName;
		this.jerseyNo = jerseyNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	@Override
	public String toString() {
		return "Player " + id + " " + name + " " + role + " " + runs + " " + wickets
				+ " " + teamName + " " + jerseyNo;
	}
	
	
}


