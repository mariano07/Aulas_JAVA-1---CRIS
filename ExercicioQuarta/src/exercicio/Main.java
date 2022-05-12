package exercicio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Animal c = new Cachorro();
		Animal cv = new Cavalo();
		Animal p = new Preguica();
		Animal t = new TesteAnimal();
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha qual opção quer\n[1]Registrar um animal\n[2]Teste animal"));
		switch(op) {
			case 1: {
				op=0;
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha qual animal quer registrar\n[1]Cachorro\n[2]Cavalo\n[3]Preguiça"));
				if(op == 1) {
					c.makeSound();
				}else if(op == 2) {
					cv.makeSound();
				}else if(op == 3){
					p.makeSound();
				}else {
					JOptionPane.showMessageDialog(null, "Inválido!");
				}
			}
			case 2: {
				t.makeSound();
			}
			default:{
				JOptionPane.showMessageDialog(null, "Inválido!");
			}
		}
	}
}
