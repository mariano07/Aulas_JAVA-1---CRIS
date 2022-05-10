package elevador;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//creating the class
		Elevator elevator = new Elevator();
		//getting elevator capacity and building floors
		elevator.setCapacity(Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade de pessoas do elevador")));
		elevator.setFloors(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de andares do prédio")));
		//Calling elevator actions
		elevator.actions();
	}
}