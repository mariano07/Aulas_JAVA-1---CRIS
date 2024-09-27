package exercicio;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends Vip {
	
	public void imprimeLoc() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso para o Camarote Superior\nR$" + (getValor()+100) + "\nPosição do ingresso: " + getLoc());
	}
}
