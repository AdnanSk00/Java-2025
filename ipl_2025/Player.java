package ipl_2025;

// POJO or Entity class
public class Player {

	private int pid;
	private String name;
	private String TeamName;
	private int runs;
	private int wickets;
	private int catches;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int pid, String name, String teamName, int runs, int wickets, int catches) {
		super();
		this.pid = pid;
		this.name = name;
		TeamName = teamName;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
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

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	@Override
	public String toString() {
		return "Player  " + pid + " " + name + " " + TeamName + " " + runs + " " + wickets + "  " + catches + "]";
	}

}
