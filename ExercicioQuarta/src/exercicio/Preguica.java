package exercicio;

import javax.swing.JOptionPane;

public class Preguica extends Animal {
	
	public void makeSound(){
		String sound="A mimir";
		
		setName(JOptionPane.showInputDialog("Informe o nome da preguiça"));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da preguiça")));
		JOptionPane.showMessageDialog(null, "Nome da preguiça " + getName() + "\nIdade da preguiça: " + getAge() + "Som: " + sound);
	}
}
