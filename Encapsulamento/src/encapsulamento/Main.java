package encapsulamento;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		
		cli.setSaldo(0);
		JOptionPane.showMessageDialog(null, "Saldo: " + cli.getSaldo());
	}
}
