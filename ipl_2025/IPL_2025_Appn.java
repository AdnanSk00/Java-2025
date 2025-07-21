package ipl_2025;

import java.util.List;

public class IPL_2025_Appn {

	public static void main(String[] args) {// UI / Front for Client
		List<Player> playerList = null;
		Player player = null;
		System.out.println("*** Welcome to IPL 2025 **** ");

		PlayerController pc = new PlayerController();
		System.out.println("1.All Players List : ");
		playerList = pc.getPlayersList();
		playerList.forEach(System.out::println);

		System.out.println("\n2.Player Details by ID : ");
		player = pc.getPlayersById(7);
		System.out.println(player);

		System.out.println("\n3.Player Details by Name : ");
		player = pc.getPlayersByName("Kohli");
		System.out.println(player);

		System.out.println("\n4.Players Details by TeamName : ");
		playerList = pc.getPlayersByTeamName("MI");
		playerList.forEach(System.out::println);

		System.out.println("\n5.Player  Details of Batsmans : ");
		
		System.out.println("\n6.Player  Details of Bowlers : ");
		
		System.out.println("\n7.Player  Details Highest TotalRuns : ");
		
		System.out.println("\n8.Player  Details Highest Wickets : ");
		
		System.out.println("\n9.Player  Details Highest Catches : ");
		
		System.out.println("\n10.Insert Player : ");
		Player newplayer = new Player(22, "Shreysh", "PBKS", 2300, 0, 0);
		String msg = pc.insertPlayer(newplayer);
		System.out.println(msg);
		
		System.out.println("\n11.Update Player Team Name");
		System.out.println("\n12.Update Player TotalRuns");
		System.out.println("\n13.Delete Player");
	}

}
