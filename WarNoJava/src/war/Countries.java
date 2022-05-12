package war;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Countries{
	Battlefield bf = new Battlefield();
	Game g = new Game();
	private int x=0,y=0,d;
	
	public String[][] givingCountries(int p) {
		String[][] map = {
				{"Gondor","Enedwaith", "Rohan", "Harondor", "Mordor"},
				{"Enedwaith","Gondor", "Rohan", "None", "None"},
				{"Rohan","Enedwaith", "Gondor", "Rhovanion", "None"},
				{"Rhovanion","Rohan","None","None","None"},
				{"Harondor","Gondor", "Mordor","None","None"},
				{"Mordor","Harondor", "Gondor","None","None"}
		};
		String[][] actual_players = new String[p][5];
		
		for(x=0;x<p;x++) {
			d = bf.rollDice();
			for(y=0;y<5;y++) {
				actual_players[x][y] = map[d][y];
			}
		}
		return actual_players;
	}
}
