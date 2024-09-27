package imc;

import javax.swing.JOptionPane;

public class Main {
	//IMC check
	public static double IMC (double weight, double height) {
		double imc = weight/Math.pow(height, 2);
		return imc;
	}
	public static void main(String[] args) {
		//Variables
		double weight,height;
		//User input
		JOptionPane.showMessageDialog(null, "Olá seja bem-vindo ao Cálculo IMC");
		weight = Double.parseDouble(JOptionPane.showInputDialog("Por Favor Informe seu peso: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Por Favor Informe sua altura: "));
		//Conditions
		if(IMC(weight,height) <= 18.4) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso" + "\nSeu IMC é: " + IMC(weight,height));
		}else if(IMC(weight,height) >= 18.5 && IMC(weight,height) <= 24.9) {
			JOptionPane.showMessageDialog(null, "Você está com peso normal" + "\nSeu IMC é: " + IMC(weight,height));
		}else if (IMC(weight,height) >= 25.0 && IMC(weight,height) <= 29.9) {
			JOptionPane.showMessageDialog(null, "Você está com Sobrepeso" + "\nSeu IMC é: " + IMC(weight,height));
		}else if(IMC(weight,height) >= 30.0 && IMC(weight,height) <= 34.9) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade grau 1!" + "\nSeu IMC é: " + IMC(weight,height));
		}else if(IMC(weight,height) >= 35.0 && IMC(weight,height) <= 39.9) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade grau 2!!" + "\nSeu IMC é: " + IMC(weight,height));
		}else {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade grau 3!!!" + "\nSeu IMC é: " + IMC(weight,height));
		}
	}


}
