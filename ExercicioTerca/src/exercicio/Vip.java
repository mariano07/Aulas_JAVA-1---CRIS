package exercicio;

import javax.swing.JOptionPane;

public class Vip extends Ingresso {
	private String loc;
	
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, "Valor do ingresso VIP: R$" + (getValor()+50));
	}
}
