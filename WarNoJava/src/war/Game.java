package war;

import javax.swing.JOptionPane;

public class Game {
	
	public void run() {
		int players;
		JOptionPane.showMessageDialog(null, "     Bem vindo ao jogo WAR\n Pressione ENTER para iniciar");
		players = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos jogadores de IA estarão jogando"));
		
		Countries c = new Countries();
		c.givingCountries(players);
		}
}
