package numeros;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int number,number_after;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		number_after = number;
		JOptionPane.showMessageDialog(null, "Número informado: " + number + "\nAntecessor do número: " + --number + "\nSucessor do número: " + ++number_after );

	}

}
