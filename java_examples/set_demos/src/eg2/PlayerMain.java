package eg2;

import java.util.HashSet;
import java.util.Set;

public class PlayerMain {

	public static void main(String[] args) {
		
		Set<Player> players=new HashSet<>();
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		
		//System.out.println(players.add(new Player(100, "Dinesh")));
		System.out.println("Printing all the players");
		for(Player p:players) {
			System.out.println(p);
		}

	}

}
