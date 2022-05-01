package tema;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome,cep,cpf,confirmacao;
		
		JOptionPane.showInternalMessageDialog(null, "Bem vindo a mini Agenda");
		nome = JOptionPane.showInputDialog("Informe seu nome");
		cep = JOptionPane.showInputDialog("Informe seu CEP");
		cpf = JOptionPane.showInputDialog("Informe seu CPF");
		confirmacao = JOptionPane.showInputDialog("Confira seus dados\n" + "Nome: " + nome + "\nCEP: " + cep + "\nCPF: " + cpf + "\nSeus dados estão corretos?\n" + "Digite Sim, Não ou Sair");
		
		if(confirmacao.equals("Sim")) {
			JOptionPane.showInternalMessageDialog(null, "Obrigado por usar a mini Agenda");
		}else if (confirmacao.equals("Não")) {
			JOptionPane.showInternalMessageDialog(null, "Informe seus dados novamente por favor");
			nome = JOptionPane.showInputDialog("Informe seu nome");
			cep = JOptionPane.showInputDialog("Informe seu CEP");
			cpf = JOptionPane.showInputDialog("Informe seu CPF");
			JOptionPane.showMessageDialog(null, "Confira seus dados" + "\nNome: " + nome + "\nCEP: " + cep + "\nCPF: " + cpf);
		}else {
			JOptionPane.showInternalMessageDialog(null, "Tchau :)");
		}
	}

}
