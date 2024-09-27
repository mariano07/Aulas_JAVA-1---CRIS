package ipi;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String part1_code,part2_code;
		double ipi,part1_value,parts1,part2_value,parts2,total;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao peçinhas");
		ipi = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de IPI a ser acrescentado"));
		part1_code = JOptionPane.showInputDialog("Informe o código das primeiras peças");
		part1_value = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário das primeiras peças"));
		parts1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de primeiras peças"));
		part2_code = JOptionPane.showInputDialog("Informe o código das segundas peças");
		part2_value = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário das segundas peças"));
		parts2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de segundas peças"));
		
		total = (part1_value*parts1 + part2_value*parts2)*(ipi/100 + 1);
		
		JOptionPane.showMessageDialog(null, "Código das primeiras peças: " + part1_code + "\nCódigo das segundas peças: " + part2_code + "\nTotal do IPI: " + total);
	}

}
