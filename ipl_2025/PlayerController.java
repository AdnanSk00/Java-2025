package ipl_2025;

import java.util.List;

public class PlayerController {
	PlayerService service = null;
	Player player = null;
	List<Player> playerList = null;

	public PlayerController() {
		service = new PlayerService(); // always before all method
	}

	public List<Player> getPlayersList() {
		playerList = service.getPlayersList();
		return playerList;
	}

	public Player getPlayersById(int id) { // UI -->
		// player.html .. post.. getAttribute(txtPid);
		player = service.getPlayersById(id);
		return player;
	}

	public Player getPlayersByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> getPlayersByTeamName(String team) {
		playerList = service.getPlayersByTeamName(team);
		return playerList;
	}

	public String insertPlayer(Player newplayer) {
		return service.insertPlayer(  newplayer);
	}

}
