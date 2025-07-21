package ipl_2025;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String query = null;
	int rowCnt = 0;
	List<Player> playerList = null;

	public PlayerDao() {
		con = MyDBConf.getMyDBConnection();
	}

	public List<Player> getPlayersList() {
		playerList = new ArrayList<Player>();
		try {
			st = con.createStatement();// new StatementImpl();
			query = "select * from player";
			rs = st.executeQuery(query); // DQL -- select arr[][]

			while (rs.next()) {
				Player p = new Player();
				p.setPid(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeamName(rs.getString(3));
				p.setRuns(rs.getInt(4));
				p.setWickets(rs.getInt(5));
				p.setCatches(rs.getInt(6));
				playerList.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return playerList;
	}

	public String insertPlayer(Player player) {
		query = "insert into player values(?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(query);
			// set data to pst
			pst.setInt(1, player.getPid());
			pst.setString(2, player.getName());
			pst.setString(3, player.getTeamName());
			pst.setInt(4, player.getRuns());
			pst.setInt(5, player.getWickets());
			pst.setInt(6, player.getCatches());

			pst.executeUpdate();
			return player.getName() + " >> inserted sucessfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return player.getName() + " >> failed to insert";
	}

}
