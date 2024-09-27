package exercicio;

import javax.swing.JOptionPane;

public class Ingresso {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso: R$" + valor);
	}
}
