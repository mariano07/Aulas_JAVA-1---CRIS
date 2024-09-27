package exercicio;

import java.util.Random;

import javax.swing.JOptionPane;

public class TesteAnimal extends Animal {
	
	public void makeSound(){
		Random r = new Random();
		int i,d;
		String[] animais = new String[10];
		
		for(i=0;i<10;i++) {
			d = r.nextInt(3)+1;
			if(d == 1) {
				animais[i] = "Cachorro";
			}else if(d == 2) {
				animais[i] = "Cavalo";
			}else if(d == 3) {
				animais[i] = "Preguiça";
			}
		}
		for(i=0;i<10;i++) {
			if(animais[i].equals("Cachorro")) {
				animais[i] += " Som: Woof Woof";
			}else if(animais[i].equals("Cavalo")) {
				animais[i] += " Som: Irrinho";
			}else if(animais[i].equals("Preguiça")) {
				animais[i] += " Som: A mimir";
			}
		}
		StringBuilder sb = new StringBuilder();
		for(i=0;i<10;i++) {
			sb.append("[" + animais[i] + "]\n");
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}
