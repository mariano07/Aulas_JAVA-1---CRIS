package salario;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double minimum_wage,wage,total;
		
		JOptionPane.showMessageDialog(null,"bem vindo ao calculador de salarios");
		minimum_wage = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto é um sálario mínimo"));
		wage = Double.parseDouble(JOptionPane.showInputDialog("Informe quantoé o seu salário"));
		total = wage/minimum_wage;
		JOptionPane.showMessageDialog(null,"A quantidade de salários mínimos que você recebe é: " + total);
	}

}
