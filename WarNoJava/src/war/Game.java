package war;

import javax.swing.JOptionPane;

public class Game {
	
	public void run() {
		//Create the object to call the StringBuilder
		StringBuilder sb = new StringBuilder();
		//Variables
		int players,x,y;
		//Interactions with user
		JOptionPane.showMessageDialog(null, "     Bem vindo ao jogo WAR\n Pressione ENTER para iniciar");
		players = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos jogadores de IA estarão jogando"));
		//New object to call the class Countries
		Countries c = new Countries();
		//Get the countries
		String[][] actual_players = c.givingCountries(players);
		
	}
}
