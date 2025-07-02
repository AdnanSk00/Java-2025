package tka_june2_IPL_2025;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class C5_PlayerDao {
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	String query = null;
	ResultSet rs = null;
	int rowCount = 0;
	List<C2_Player> playerList = null;
	
	public C5_PlayerDao() {
		con = C1_MyDBConf.getMyDBConnection();
	}
	
	public List<C2_Player> getPlayersList() {
		playerList = new ArrayList<C2_Player>();
		
		try {
			st = con.createStatement();			// new StatementImp();
			
			query = "select * from players";
			rs = st.executeQuery(query);		// DQL -- select  arr[][]
				
			while(rs.next()) {			
//				columns to be added into Player object
				C2_Player p = new C2_Player();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setRole(rs.getString(3));
				p.setRuns(rs.getInt(4));
				p.setWickets(rs.getInt(5));
				p.setTeamName(rs.getString(6));
				p.setJerseyNo(rs.getInt(7));
				playerList.add(p);
			}
//			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return playerList;
	}

	public String insertNewPlayers(C2_Player newPlayer) {
		query = "insert into players values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pst = con.prepareStatement(query);
			
			pst.setInt(1, newPlayer.getId());
			pst.setString(2, newPlayer.getName());
			pst.setString(3, newPlayer.getRole());
			pst.setInt(4, newPlayer.getRuns());
			pst.setInt(5, newPlayer.getWickets());
			pst.setString(6, newPlayer.getTeamName());
			pst.setInt(7, newPlayer.getJerseyNo());
			
			rowCount = pst.executeUpdate();
			return newPlayer.getName() + " >> Insert Successfully...";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return newPlayer.getName() + " >> Failed to insert";
	}

	public String updatePlayerTeam(String playerName, String teamName) {
		try {
			st = con.createStatement();
//			query = "update players set TeamName '" + teamName + "' where name = '" + playerName + "'";
			query = "update players set teamName = 'GT' where name = 'Hardik'";
			System.out.println(query);
			
			rowCount = st.executeUpdate(query);
			return teamName + " >> Updated Successfully...";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return teamName + " >> Failed to update";
	}
}
