package saldo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double balance;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao reajustador");
		balance = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo a ser reajustado"));
		balance = balance + balance*0.01;
		JOptionPane.showMessageDialog(null, "Saldo reajustado: " + balance);

	}

}
