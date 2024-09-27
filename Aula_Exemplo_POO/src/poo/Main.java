package poo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		LivroDeNotas escola = new LivroDeNotas();
		LivroDeNotas escola1 = new LivroDeNotas();
		/*
		escola.Add_Aluno();
		escola.Media();
		escola.Status();
		
		escola1.Add_Aluno();
		escola1.Media();
		escola1.Status();
		*/
		escola.setObs(JOptionPane.showInputDialog("Informe seu nome:\n"));
		JOptionPane.showMessageDialog(null, escola.getObs());
	}

}
