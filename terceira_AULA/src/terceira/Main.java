package terceira;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String s = "Shirley Shorty";
		String s2 = "Daniel Paladino";
		
		JOptionPane.showMessageDialog(null, "Igual: " + s.equals("Shirley Shorty"));
		JOptionPane.showMessageDialog(null,"Tamanho de s: " + s.length());
		JOptionPane.showMessageDialog(null,"Caracter da posição 5 de s2: " + s2.charAt(5));
		
		int a = 5;
		boolean b = (a == 10);
		JOptionPane.showMessageDialog(null, !b);
		
		int c = 10 % 3;
		JOptionPane.showMessageDialog(null, c);
		
		double d = 15.3;
		d+=10;
		JOptionPane.showMessageDialog(null, d);
		
		boolean e = (d > 100 && d <= 500);
		JOptionPane.showMessageDialog(null, e);
		
		int i = 1;
		int j = 8;
		int k = ++j;
		JOptionPane.showMessageDialog(null, "K: " + k);
		JOptionPane.showMessageDialog(null, "J: " + j);
		int l = i++;
		JOptionPane.showMessageDialog(null, "L: " + l);
		JOptionPane.showMessageDialog(null, "I: " + i);
		k++;
		JOptionPane.showMessageDialog(null, "K: " + k);
	}

}
