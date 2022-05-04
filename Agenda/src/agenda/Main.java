
package agenda;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Varibales
		String name=" ",cep=" ",adress=" ",cel_number=" ";
		int option=0,i=0,changeOption;
		//Getting ser input
		JOptionPane.showMessageDialog(null, "Bem Vindo a sua Agenda virtual");
		while(i != 4) {
			option = Integer.parseInt(JOptionPane.showInputDialog("Informe qual opção deseja realizar\n[1]Adicionar Dados\n[2]Listar Dados Existentes\n[3]Mudar Dados\n[4]Sair"));
			//Menu options
			switch(option) {
				//Adding data
				case 1: {
					name = JOptionPane.showInputDialog("Informe o Nome que deseja cadastrar");
					cep = JOptionPane.showInputDialog("Informe o CEP que deseja cadastrar");
					adress = JOptionPane.showInputDialog("Informe o Endereço que deseja cadastrar");
					cel_number = JOptionPane.showInputDialog("Informe o Telefone que deseja cadastrar");
					break;
				}
				//Listing data
				case 2: {
					JOptionPane.showMessageDialog(null, "Os dados registrados são:\nNome: " + name + "\nCEP: " + cep + "\nEndereço: " + adress + "\nTelefone: " + cel_number);
					break;
				}
				//Chaging data
				case 3: {
					changeOption = Integer.parseInt(JOptionPane.showInputDialog("Informe qual dado deseja altera\n[1]Nome\n[2]CEP\n[3]Endereço\n[4]Telefone\n[5]Sair"));
					switch (changeOption) {
						case 1: {
							name = JOptionPane.showInputDialog("Informe o novo Nome que deseja cadastrar");
							break;
						}
						case 2: {
							cep = JOptionPane.showInputDialog("Informe o novo CEP que deseja cadastrar");
							break;
						}
						case 3: {
							adress = JOptionPane.showInputDialog("Informe o novo Endereço que deseja cadastrar");
							break;
						}
						case 4: {
							cel_number = JOptionPane.showInputDialog("Informe o novo Telefone que deseja cadastrar");
							break;
						}
						default: {
							break;
						}
					}
					break;
				}
				//exit program
				default: {
					i = 4;
					break;
				}
			}
		}
	}

}
