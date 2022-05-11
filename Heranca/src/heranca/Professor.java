package heranca;

import javax.swing.JOptionPane;

public class Professor extends Funcionario {
	
	public void ensinarDisciplina(String disc) {
		
		JOptionPane.showMessageDialog(null, getNome() +  " está ensinando a disciplina " + disc);
	}

}
