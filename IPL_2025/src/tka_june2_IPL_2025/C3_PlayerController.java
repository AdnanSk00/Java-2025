package tka_june2_IPL_2025;

import java.util.List;

public class C3_PlayerController {
	C4_PlayerService service = null;
	List<C2_Player> playerList = null;
	C2_Player player = null;

	public C3_PlayerController() {
		service = new C4_PlayerService();	// always before all method
	}
	
	List<C2_Player> getPlayersList() {
		playerList = service.getPlayersList();
		return playerList;
	}

	public C2_Player getPlayersById(int id) {
		player = service.getPlayersById(id);
		return player;
	}

	public C2_Player getPlayersByName(String name) {
		player = service.getPlayersByName(name);
		return player;
	}

	public List<C2_Player> getPlayersByTeamName(String teamName) {
		playerList = service.getPlayersByTeamName(teamName);
		return playerList;
	}

	public List<C2_Player> getPlayersByRole(String batsman) {
		playerList = service.getPlayersByRole(batsman);
		return playerList;
	}

	public C2_Player getPlayersByHighRuns() {
		player = service.getPlayersByHighRuns();
		return player;
	}

	public String insertNewPlayers(C2_Player newPlayer) {
		String msg = service.insertNewPlayers(newPlayer);
		return msg;
	}

	public String updatePlayerTeam(String playerName, String teamName) {
		return service.updatePlayerTeam(playerName, teamName);
	}

}
