package exercicio;

import javax.swing.JOptionPane;

public class Normal extends Ingresso {
	
	public void imprimeNormal() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso normal: R$" + getValor());
	}
}
