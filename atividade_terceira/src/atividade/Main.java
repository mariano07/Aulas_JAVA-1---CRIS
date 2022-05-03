package atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Variavel que vai receber os dados
		String dado=" ";
		//dados sendo recebidos
		JOptionPane.showMessageDialog(null, "Olá seja bem vindo a calculinha a calculadora amiga");
		dado = JOptionPane.showInputDialog("Informe um número inteiro (ex:10)");
		//Casting
		int num1 = Integer.parseInt(dado);
		float num2 = Float.parseFloat(dado);
		double num3 = Double.parseDouble(dado);
		//Impressão do resultando do casting + operações matematicas
		JOptionPane.showMessageDialog(null, "Seu número inteiro vezes 5 é: " + num1*5);
		JOptionPane.showMessageDialog(null, "Seu número float dividido 5 é: " + num2/5);
		num3 += 5;
		JOptionPane.showMessageDialog(null, "Seu número double + 5 é: " + num3);
	}

}
