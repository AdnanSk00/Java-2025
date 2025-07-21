package tka_june2_IPL_2025;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class C4_PlayerService {
	C5_PlayerDao dao = null;
	C2_Player player = null;
	List<C2_Player> playerList = null;
	Connection con = null;
	Statement st = null;
	String query = null;
	ResultSet rs = null;
	int maxRuns = 0;
	int maxwickets = 0;

	public C4_PlayerService() {
		dao = new C5_PlayerDao();
	}
	
	List<C2_Player> getPlayersList() {
//		dao = new C5_PlayerDao();
		playerList = dao.getPlayersList();
		
		return playerList;
	}

	public C2_Player getPlayersById(int id) {
		// Fetching all list -->
		playerList = this.getPlayersList();
		
		for(C2_Player player : playerList) {
			if(player.getId() == id) {
				return player;
			}
		}
		return null;
	}
	
	public C2_Player getPlayersByName(String name) {
		playerList = this.getPlayersList();
		
		for(C2_Player player : playerList) {
//			System.out.println(player.getName() + name);
			if(player.getName().equals(name)) {
				return player;
			}
		}
		return null;
	}


	public List<C2_Player> getPlayersByTeamName(String teamName) {
		List<C2_Player> playerListTeam = new ArrayList<C2_Player>();
		
		playerList = this.getPlayersList();
		for(C2_Player player : playerList) {
			if(player.getTeamName().equalsIgnoreCase(teamName)) {
				playerListTeam.add(player);
			}
		}
		return playerListTeam;
	}

	public List<C2_Player> getPlayersByRole(String role) {
		List<C2_Player> playerListOfRole = new ArrayList<C2_Player>();
		
		playerList = this.getPlayersList();
		for(C2_Player player : playerList) {
			if(player.getRole().equalsIgnoreCase(role)) {
				playerListOfRole.add(player);
			}
		}
		return playerListOfRole;
	}

	public C2_Player getPlayersByHighRuns() {
		playerList = this.getPlayersList();
		con = C1_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();			// new StatementImp();
			
			query = "select max(runs) from players";
			rs = st.executeQuery(query);		// DQL -- select  arr[][]
			if(rs.next()) {
				maxRuns = rs.getInt(1);
			}
			System.out.println(maxRuns);
			for(C2_Player player : playerList) {
				if(player.getRuns() == maxRuns) {
					return player;
				}
//				rs.next();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public C2_Player getPlayersByHighWickets() {
		playerList = this.getPlayersList();
		con = C1_MyDBConf.getMyDBConnection();
		try {
			st = con.createStatement();			// new StatementImp();
			query = "select max(wickets) from players";
			rs = st.executeQuery(query);		// DQL -- select  arr[][]
			if(rs.next()) {
				maxwickets = rs.getInt(1);
			}
			System.out.println(maxwickets);
			for(C2_Player player : playerList) {
				if(player.getWickets() == maxwickets) {
					return player;
				}
//				rs.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public String insertNewPlayers(C2_Player newPlayer) {
		// No extra logic for insert
		String msg = dao.insertNewPlayers(newPlayer);
		return msg;
	}

	public String updatePlayerTeam(String playerName, String teamName) {
		return dao.updatePlayerTeam(playerName, teamName);
	}

	public String updatePlayerRuns(String playerName, int runs) {
		return dao.updatePlayerRuns(playerName, runs);
	}

	public String deletePlayer(String playerName) {
		return dao.deletePlayer(playerName);
	}
}
