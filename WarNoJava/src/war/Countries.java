package war;

public class Countries{
	//Creating objects
	Battlefield bf = new Battlefield();
	Game g = new Game();
	//Variables
	private int x=0,y=0;
	
	//Creating the map
	public String[][] givingCountries(int p) {
		String[][] map = {
				{"Gondor","Enedwaith", "Rohan", "Harondor", "Mordor"},
				{"Enedwaith","Gondor", "Rohan", "N", "N"},
				{"Rohan","Enedwaith", "Gondor", "Rhovanion", "N"},
				{"Rhovanion","Rohan","N","N","N"},
				{"Harondor","Gondor", "Mordor","N","N"},
				{"Mordor","Harondor", "Gondor","N","N"}
		};
		//Creating the string with the current players
		String[][] actual_players = new String[p][5];
		//randomizing wich countries each player gets
		int[] d = bf.countryDice();
		int j;
		for(x=0;x<p;x++) {
			for(y=0;y<5;y++) {
				j=d[x];
				actual_players[x][y] = map[j][y];
			}
		}
		return actual_players;
	}
}
