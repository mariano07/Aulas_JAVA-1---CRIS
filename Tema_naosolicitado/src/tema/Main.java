package tema;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Variables
		int size=0,new_size=0,i=0,option=0;
		//User Input
		JOptionPane.showMessageDialog(null, "Bem vindo ao vetor dinâmico do Java Junior");
		size = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor desejado"));
		//Creating first array
		String[] names = new String[size];
		//Registering names
		for(i=0;i<size;i++) {
			names[i] = JOptionPane.showInputDialog("Informe um nome pra registrar");
		}
		//Option to increase array
		option = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar tamanho do vetor? \n[1]Sim ou [2]Não"));
		//Conditions
		if(option == 1) {
			//New array size
			new_size = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo tamanho do vetor desejado"));
			//New array
			String[] names_new = new String[new_size];
			//Passing old data to new array
			for(i=0;i<size;i++) {
				names_new[i] = names[i];
			}
			//Registering new names
			for(i=size;i<new_size;i++) {
				names_new[i] = JOptionPane.showInputDialog("Informe um nome pra registrar");
			}
			//Printing everything
			for(i=0;i<new_size;i++) {
				JOptionPane.showMessageDialog(null,"Nome: " + names_new[i]);
			}
			
			}else {
				//Printing registered names
				for(i=0;i<size;i++) {
					JOptionPane.showMessageDialog(null,"Nome: " + names[i]);
				}
			}
	}

}
