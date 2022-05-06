package idade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Variables
		int year,month,day,total;
		
		JOptionPane.showMessageDialog(null, "Seja bem-vindo a calculadora de idade\nApós pressionar OK informe sua idade na seguinte ordem:\nAnos\nMeses\nDias");
		year = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos você tem"));
		month = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses você tem"));
		day = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias você tem"));
		
		total = year*365;
		total+= month*30;
		total+= day;
		
		JOptionPane.showMessageDialog(null, "Sua idade em dias é " + total + " dias");
	}

}
