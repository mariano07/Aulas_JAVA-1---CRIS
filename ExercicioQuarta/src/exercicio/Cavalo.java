package exercicio;

import javax.swing.JOptionPane;

public class Cavalo extends Animal {
	
	public void makeSound(){
		String sound="Irrinhó";
		setName(JOptionPane.showInputDialog("Informe o nome do cavalo"));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cavalo")));
		JOptionPane.showMessageDialog(null, "Nome do cavalo: " + getName() + "\nIdade do cachorro: " + getAge() + "\nSom: " + sound);
	}
}
