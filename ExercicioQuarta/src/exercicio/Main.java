package exercicio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Animal c = new Cachorro();
		Animal cv = new Cavalo();
		Animal p = new Preguica();
		Animal t = new TesteAnimal();
		int op1;
		
		op1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha qual animal quer registrar\n[1]Cachorro\n[2]Cavalo\n[3]Preguiça"));
		if(op1 == 1) {
			c.makeSound();
		}else if(op1 == 2) {
			cv.makeSound();
		}else if(op1 == 3){
			p.makeSound();
		}
		
		JOptionPane.showMessageDialog(null, "A seguir o vetor de animais aleatorio");
		t.makeSound();

	}
}
