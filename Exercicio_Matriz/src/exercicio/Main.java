package exercicio;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Variables
		int l=2,c=5,x=0,y=0,k=1;
		double value=0;
		//Creating Array
		String[][] students = new String[l][c];
		//Getting names and grades
		for(x=0;x<l;x++) {
			students[x][0] = JOptionPane.showInputDialog("Informe o nome do aluno na posição " + k++);
			for(y=1;y<4;y++) {
				students[x][y] = JOptionPane.showInputDialog("Informe a " + y + " nota " + "do aluno " + students[x][0]);
				//Making each student average grade
				value=0;
				value += Double.parseDouble(students[x][y]);
				//value/=3;
				students[x][4] = String.valueOf(value/3);
			}
		}
		//Printing Array
		JOptionPane.showMessageDialog(null, Arrays.deepToString(students));
			
	}

}
