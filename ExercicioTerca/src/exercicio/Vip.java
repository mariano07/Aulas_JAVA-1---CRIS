package exercicio;

import javax.swing.JOptionPane;

public class Vip extends Ingresso {
	private int loc;
	
	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}
	@Override
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso VIP: R$" + (getValor()+50));
	}
}
