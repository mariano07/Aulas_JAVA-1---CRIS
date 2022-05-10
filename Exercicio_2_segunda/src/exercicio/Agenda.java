package exercicio;

import javax.swing.JOptionPane;

public class Agenda {
	
	private String[] name = new String[10];
	private int[] age = new int[10];
	private float[] height = new float[10];
	private int option=0;
	
	public void agenda() {
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
		int x=0,i=0;
		x++;
		for(i=0;i<x;i++) {
			name[i] = JOptionPane.showInputDialog("Informe o nome para registrar");
			
		}
		
	}
	
	private void removePeople() {
		
	}
	
	private void searchPeople() {
		
	}
	
	private void printAgenda() {
		
	}
	
	private void printPeople() {
		
	}
}
