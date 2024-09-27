package exercicio;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Formas f = new Calculos() {};
		//Variveis
		int i=0,vezes,op;
		double l1,l2,l3,l4;
		
		//Quantas vezes vai ser executado
		vezes = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas formas quer criar"));
		String[] formas = new String[vezes];
		while(vezes > 0) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual forma deseja criar?\n[1]Quadrilatero\n[2]Retangulo\n[3]Quadrado\n[4]Circulo"));
			switch(op) {
				case 1: {
					//Perimetro quadrilatero
					l1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º lado do quadrilatero"));
					l2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º lado do quadrilatero"));
					l3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3º lado do quadrilatero"));
					l4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 4º lado do quadrilatero"));
					formas[i] = "Perimetro de um Quadrilatero: " + f.perimetroQuadri(l1, l2, l3, l4);
					i++;
					vezes--;
					break;
				}
				case 2:{
					//Perimetro Retangulo
					l1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do retangulo"));
					l2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retangulo"));
					formas[i] = "Perimetro de um Retangulo: " + f.perimetroRetan(l1, l2);
					i++;
					vezes--;
					break;
				}
				case 3:{
					//Perimetro Quadrado
					l1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um lado do quadrado"));
					formas[i] = "Perimetro de um Quadrado: " + f.perimetroQuadra(l1);
					i++;
					vezes--;
					break;
				}
				case 4:{
					//Perimetro Circulo
					l1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio do circulo"));
					formas[i] = "Perimetro de um Circulo: " + f.perimetroCircu(l1);
					i++;
					vezes--;
					break;
				}
				default:{
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}
			}
		}
		//Printando
		JOptionPane.showMessageDialog(null, Arrays.toString(formas));
	}

}
