package poli;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Funcionario f = new Tecnico();
		
		f.setNome(JOptionPane.showInputDialog("Informe o nome do funcionario"));
		f.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Informe o salario do funcionario")));
		JOptionPane.showMessageDialog(null, f.ganhoAnual());
		
		Funcionario f2 = new Tecnico();
		f2.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Informe o salario do funcionario")));
		JOptionPane.showMessageDialog(null, f2.ganhoAnual());
	}

}
