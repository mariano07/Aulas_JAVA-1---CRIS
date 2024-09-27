package exercicio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Pessoa people = new Pessoa();
		
		people.setName(JOptionPane.showInputDialog("Informe seu nome"));
		people.setDay(Integer.parseInt(JOptionPane.showInputDialog("Informe o dia em que nasceu")));
		people.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês em que nasceu")));
		people.setYear(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que nasceu")));
		people.setHeight(JOptionPane.showInputDialog("Informe sua altura"));
		JOptionPane.showMessageDialog(null, "Nome: " + people.getName() + "\nAltura: " + people.getHeight() + "\nData de nasc: " + people.getDay() +"/"+ people.getMonth() +"/"+ people.getYear() + "\nIdade: " + people.calcAge());	
	}

}
