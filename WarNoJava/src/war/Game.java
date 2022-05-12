package war;

import javax.swing.JOptionPane;

public class Game {
	Countries c = new Countries();
	private int players;
	
	public int getPlayers() {
		return players;
	}
	
	public void setPlayers(int players) {
		this.players = players;
	}
	
	public void run() {
		JOptionPane.showMessageDialog(null, "     Bem vindo ao jogo WAR\n Pressione ENTER para iniciar");
		players = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos jogadores de IA estarão jogando"));
		//c.givingCountries();
		}
}
