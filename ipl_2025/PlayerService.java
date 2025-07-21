package ipl_2025;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {
	PlayerDao dao = null;
	Player player = null;
	List<Player> playerList = null;

	public PlayerService() {
		dao = new PlayerDao();
	}

	public List<Player> getPlayersList() {
		dao = new PlayerDao();
		playerList = dao.getPlayersList();
		return playerList;
	}

	public Player getPlayersById(int id) {
		// fetching all List --> or jdbc code here...
		playerList = this.getPlayersList();
		for (Player player : playerList) {
			if (player.getPid() == id) {
				return player;
			}
		}
		return null;
	}

	public List<Player> getPlayersByTeamName(String team) {
		List<Player> playerListTeam = new ArrayList<Player>();

		playerList = this.getPlayersList();
		for (Player player : playerList) {
			if (player.getTeamName().equals(team)) {
				playerListTeam.add(player);
			}
		}
		return playerListTeam;
	}

	public String insertPlayer(Player newplayer) {
		// no extra logic for insert
		return dao.insertPlayer(newplayer);
	}

}
