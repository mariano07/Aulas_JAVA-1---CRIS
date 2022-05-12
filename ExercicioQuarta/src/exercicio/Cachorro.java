package exercicio;

import javax.swing.JOptionPane;

public class Cachorro extends Animal {
	
	public void makeSound(){
		String sound="Woof Woof Bark Bark";
		
		setName(JOptionPane.showInputDialog("Informe o nome do cachorro"));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da preguiça")));
		JOptionPane.showMessageDialog(null, "Nome do cachorro: " + getName() + "\nIdade do cachorro: " + getAge() + "Som: " + sound);
	}
}
