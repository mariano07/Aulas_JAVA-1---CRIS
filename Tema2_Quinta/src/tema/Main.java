package tema;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	
	public static void Names(int size) {
		int i=0;
		//Creating first array
		String[] names = new String[size];
		//Registering names
		for(i=0;i<size;i++) {
			names[i] = JOptionPane.showInputDialog("Informe um nome pra registrar");
		}
		JOptionPane.showMessageDialog(null,"Nome: " + Arrays.toString(names));
		Choice(size,names);
	}
	public static void Choice(int size,String[]names) {
		int option=0;
		//Option to increase array
		while(option != 2) {
			option = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar tamanho do vetor? \n[1]Sim ou [2]Não"));
			//Conditions
			if(option == 1) {
				Names2(size,names);
			}else {
				//Printing registered names
				JOptionPane.showMessageDialog(null,"Nome: " + Arrays.toString(names));
			}
		}
	}
	public static void Names2(int size, String[]names) {
		int new_size=0,i=0;
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
		JOptionPane.showMessageDialog(null,"Nome: " + Arrays.toString(names_new));
		Choice(new_size,names_new);
	}
	
	public static void main(String[] args) {
		//Variables
		int size=0;
		//User Input
		JOptionPane.showMessageDialog(null, "Bem vindo ao vetor dinâmico do Java");
		size = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor desejado"));
		Names(size);
	}

}
