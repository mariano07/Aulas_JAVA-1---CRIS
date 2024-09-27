package aula;

import javax.swing.JOptionPane;

public class Main {
	//Area check
	public static double Area(double base, double height) {
			return base * height;		
	}
	//Perimiter check
	public static double Perimeter(double base, double height) {
			return (2*base) + (2*height);
	}
	public static void main(String[] args) {
		//Variables
		int base = 0;
		int height = 0;
		//User informing data
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a Base: "));
		height = Integer.parseInt(JOptionPane.showInputDialog("Informe a Altura "));
		//Printing to user
		JOptionPane.showMessageDialog(null, "Sua Área é: " + Area(base,height) + "\nSeu Perímetro é: " + Perimeter(base,height));
	}

}
