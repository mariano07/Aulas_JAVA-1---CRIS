package exercicio;

import javax.swing.JOptionPane;

public class Agenda {
	//Variables
	private String[] name = new String[10];
	private int[] age = new int[10];
	private float[] height = new float[10];
	private int option=0,x=0;
	
	public void agenda() {
		//showing options to user
		option = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha qual operação quer realizar\n[1]Adicionar pessoa\n[2]Remover pessoa\n[3]Ver posição de alguém\n[4]Mostrar nomes registrados\n[5]Ver dados de alguém\n[6]Sair"));
		
		switch(option) {
			case 1: {
				addPeople();
				break;
			}
			case 2: {
				removePeople();
				break;
			}
			case 3: {
				searchPeople();
				break;
			}
			case 4: {
				printAgenda();
				break;
			}
			case 5: {
				printPeople();
				break;
			}
			case 6: {
				JOptionPane.showMessageDialog(null, "Até mais! :D");
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				agenda();
				break;
			}
		}
	}
	
	private void addPeople() {
		//Variable
		int i=0;
		//Checking if agenda is full
		if(x == 10) {
			JOptionPane.showMessageDialog(null, "A agenda está cheia!");
			//going back to menu
			agenda();
		}else {
			//Registering new person
			for(i=x;i<=x;i++) {
				name[i] = JOptionPane.showInputDialog("Informe o nome para registrar");
				age[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade para registrar"));
				height[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura para registrar"));
			}
			//adding +1 to variable to keep track of array positions for next register
			x++;
			//going back to menu
			agenda();
		}
	}
	
	private void removePeople() {
		//variables
		String op=" ";
		int i=0;
		//printing registered people to user
		StringBuilder sb = new StringBuilder(10);
		for(i=0;i<x;i++) {
			sb.append("Nome: " + name[i] + "\n");
		}
		//getting user choice
		op = JOptionPane.showInputDialog(null,"Escreva o nome de quem quer deletar igual mostrado na tela\n" + sb.toString());
		//creating new variables for backup
		String[] name_backup = new String[10];
		int[] age_backup = new int[10];
		float[] height_backup = new float[10];
		int k=0;
		//removing selected person
		for(i=0;i<x;i++) {
			k=i;
			if(name[i].equals(op)) {
				name[i] = "NR";
				age[i] = 0;
				height[i] = 0;
				if(name[i] == "NR" && age[i] == 0 && height[i] == 0) {
					name_backup[i] = name[k+1];
					age_backup[i] = age[k+1];
					height_backup[i] = height[k+1];
				}
			}else {
				name_backup[i] = name[k];
				age_backup[i] = age[k];
				height_backup[i] = height[k];
			}
		}
		//removing -1 to variable to keep track of array positions for next register
		for(i=0;i<x;i++) {
			name[i] = name_backup[i];
			age[i] = age_backup[i];
			height[i] = height_backup[i];
		}
		x--;
		//going back to menu
		agenda();
	}
	
	private void searchPeople() {
		String search=" ";
		int i=0,k=0;
		search = JOptionPane.showInputDialog("Informe o nome da pessoa cadastrada que quer ver");
		for(i=0;i<x;i++) {
			k++;
			if(name[i].equals(search)) {
				JOptionPane.showMessageDialog(null, "A pessoa com nome de " + name[i] + " está na posição " + k + " da agenda");
			}
		}
		agenda();
	}
	
	private void printAgenda() {
		//Variable
		int i=0;
		//Showing registered people
		StringBuilder sb = new StringBuilder(10);
		for(i=0;i<x;i++) {
			sb.append("[Nome: " + name[i] + "] [Idade: " + age[i] + "] [Altura: " + height[i] + "]\n");
		}
		JOptionPane.showMessageDialog(null, sb.toString());
		//going back to menu
		agenda();
	}
	
	private void printPeople() {
		//Variable
		int i=0;
		//Getting position
		i = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição na agenda da pessoa que deseja ver os dados"));
		//Decrementing to match the array position
		i--;
		//Showing data
		JOptionPane.showMessageDialog(null, "Nome: " + name[i] + "\nIdade: " + age[i] + "\nAltura: " + height[i]);
		//going back to menu
		agenda();
	}
}
