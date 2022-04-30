package segunda_aula;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//primeiro contato com o objeto JOPTIONPANE
		
		String nome,cidade,endereco;
		Integer cep,cpf,telefone;
		
		JOptionPane.showInternalMessageDialog(null, "Bem vindo a nossa Agenda do Senac");
		nome = JOptionPane.showInputDialog("Informe seu Nome\n");
		cidade = JOptionPane.showInputDialog("Informe sua Cidade\n");
		endereco = JOptionPane.showInputDialog("Informe seu endereco\n");
		cep = Integer.parseInt(JOptionPane.showInputDialog("Informe seu CEP\n")) ;
		cpf =Integer.parseInt(JOptionPane.showInputDialog("Informe seu CPF\n"));
		telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe seu Telefone\n"));
		
		JOptionPane.showMessageDialog(null,"Os dados que inseriu foram\n" + "Nome:" + nome + "\nCidade:" + cidade + "\nEndereco:" + endereco + "\nCEP:" + cep + "\nCPF:" + cpf + "\nTelefone:" + telefone);
		
	}

}
