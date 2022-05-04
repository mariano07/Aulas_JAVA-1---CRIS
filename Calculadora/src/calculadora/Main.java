package calculadora;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {
	//Check wich option was selected and do the operation
	public static double Counts(double num1, double num2, double op) {
		double result;
		if(op == 1) {
			result = num1 + num2;
			return result;
		}else if(op == 2) {
			result = num1 - num2;
			return result;
		}else if(op == 3) {
			result = num1 * num2;
			return result;
		}else {
			result = num1 / num2;
			return result;
		}
	}
	
	public static void main(String[] args) {
		//Variable
		int option;
		double num1=0,num2=0,result=0;
		//Introduction
		JOptionPane.showMessageDialog(null, "Bem vindo a calculadora");
		option = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que quer Fazer\n [1]Somar, [2]Subtrair, [3]Multiplicação, [4]Divisão ou [5]Sair"));
		//Choices
		switch(option) {
			case 1: {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
				result = Counts(num1,num2,option);
				JOptionPane.showMessageDialog(null, "O número " + num1 + " + o número " + num2 + " é: " + result);
				break;
			}
			case 2: {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
				result = Counts(num1,num2,option);
				JOptionPane.showMessageDialog(null, "O número " + num1 + " - o número " + num2 + " é: " + result);
				break;
			}
			case 3: {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
				result = Counts(num1,num2,option);
				JOptionPane.showMessageDialog(null, "O número " + num1 + " * o número " + num2 + " é: " + new DecimalFormat("0.00").format(result));
				break;
			}
			case 4: {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
				result = Counts(num1,num2,option);
				JOptionPane.showMessageDialog(null, "O número " + num1 + " / o número " + num2 + " é: " + result);
				break;
			}
			case 5: {break;}
			default: {break;}
		}
		

	}

}
