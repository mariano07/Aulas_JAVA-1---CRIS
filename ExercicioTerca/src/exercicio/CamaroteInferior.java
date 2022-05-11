package exercicio;

import javax.swing.JOptionPane;

public class CamaroteInferior extends Vip {
	
	public void imprimeLoc() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso para o Camarote Inferior\nR$" + getValor() + "\nPosição do ingresso: " + getLoc());
	}
}
