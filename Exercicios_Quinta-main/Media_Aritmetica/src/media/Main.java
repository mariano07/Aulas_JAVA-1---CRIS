package media;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int num,num2,average;
		num = 8 + 7 + 9 / 3;
		num2 = 4 + 5 + 6 / 3;
		JOptionPane.showMessageDialog(null, "A média dos números 8, 7, 9 é: " + num);
		JOptionPane.showMessageDialog(null, "A média dos números 4, 5, 6 é: " + num2);
		average = num + num2;
		JOptionPane.showMessageDialog(null, "A soma das médias é: " + average);
		average/=2;
		JOptionPane.showMessageDialog(null, "A média das médias é: " + average);
	}

}
