package elevador;

import javax.swing.JOptionPane;

public class Elevator {
	//Variables
	private int capacity=0,floors=0,peopleInside=0,actual_floor=0;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	public void actions() {
		//Variable
		int option=0;
		//showing elevator options to user
		option = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação que deseja realizar no elevador\n[1]Adicionar pessoa no elevador\n[2]Remover pessoa do elevador\n[3]Subir andar\n[4]Descer andar\n[5]Parar de usar o elevador"));
		switch(option) {
			case 1:{
				addPeople();
				break;
			}
			case 2:{
				removePeople();
				break;
			}
			case 3:{
				up();
				break;
			}
			case 4:{
				down();
				break;
			}
			case 5:{
				JOptionPane.showMessageDialog(null,"Até mais! :D");
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null,"Opção inválida!");
				actions();
				break;
			}
		}
	}
	
	private void addPeople() {
		//showing actual number of people inside the elevator
		JOptionPane.showMessageDialog(null,"Atualmente tem " + peopleInside + " pessoas no elevador");
		//checking if it's possible to add more
		if(peopleInside < capacity) {
			peopleInside++;
		}else if (peopleInside == capacity) {
			JOptionPane.showMessageDialog(null,"Elevador já está na capacidade máxima!");
		}
		//checking for correct grammar
		if(peopleInside == 1) {
			JOptionPane.showMessageDialog(null,"Agora tem " + peopleInside + " pessoa no elevador");
		}else {
			JOptionPane.showMessageDialog(null,"Agora tem " + peopleInside + " pessoas no elevador");
		}
		//going back to menu
		actions();
	}
	
	private void removePeople() {
		//showing actual number of people inside the elevator
		JOptionPane.showMessageDialog(null,"Atualmente tem " + peopleInside + " pessoas no elevador");
		//checking if it's possible to remove more people
		if(peopleInside > 0) {
			peopleInside--;
		}
		//checking for correct grammar
		if(peopleInside == 1) {
			JOptionPane.showMessageDialog(null,"Agora tem " + peopleInside + " pessoa no elevador");
		}else {
			JOptionPane.showMessageDialog(null,"Agora tem " + peopleInside + " pessoas no elevador");
		}
		//going back to menu
		actions();
	}
	
	private void up() {
		//showing actual elevator floor
		if(actual_floor == 0) {
			JOptionPane.showMessageDialog(null,"Elevador está atualmente no térreo");
		}else {
			JOptionPane.showMessageDialog(null,"Elevador está atualmente no " + actual_floor + "º andar");
		}
		//checking if it's possible to go up
		if(actual_floor < floors) {
			actual_floor++;
		}else if(actual_floor == floors) {
			JOptionPane.showMessageDialog(null,"O elevador já está no último andar");
		}
		JOptionPane.showMessageDialog(null,"Elevador agora está no " + actual_floor + "º andar");
		//going back to menu
		actions();
	}
	
	private void down() {
		//showing actual elevator floor
		if(actual_floor == 0) {
			JOptionPane.showMessageDialog(null,"Elevador está atualmente no térreo");
		}else {
			JOptionPane.showMessageDialog(null,"Elevador está atualmente no " + actual_floor + "º andar");
		}
		//checking if it's possible to go down
		if(actual_floor > 0) {
			actual_floor--;
		}else if(actual_floor == 0) {
			JOptionPane.showMessageDialog(null,"O elevador já está no térreo");
		}
		JOptionPane.showMessageDialog(null,"Elevador agora está no " + actual_floor + "º andar");
		//going back to menu
		actions();
	}
}

