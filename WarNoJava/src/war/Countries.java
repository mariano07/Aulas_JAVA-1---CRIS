package war;

public class Countries {
	Battlefield bf = new Battlefield();
	Game g = new Game();
	
	private String[][] map = new String[][]{
		{"Gondor","Enedwaith", "Rohan", "Harondor", "Mordor"},
		{"Enedwaith","Gondor", "Rohan"},
		{"Rohan","Enedwaith", "Gondor", "Rhovanion"},
		{"Rhovanion","Rohan"},
		{"Harondor","Gondor", "Mordor"},
		{"Mordor","Harondor", "Gondor"}
	};
	
	public String[][] givingCountries() {
		int x=0,y=0,p=0,d=0;
		p = g.getPlayers();
		String[][] actual_players = new String[p][5];
		int [] dice = new int[p];
		
		for(x=0;x<p;x++) {
			dice[x] = bf.rollDice();
		}
		
		for(x=0;x<p;x++) {
			for(y=0;y<5;y++) {
				actual_players[x][y] = map[d][y];
			}
		}
		
		return actual_players;
	}
}
