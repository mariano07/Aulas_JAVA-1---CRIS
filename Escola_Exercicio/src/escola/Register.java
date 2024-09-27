package escola;



import javax.swing.JOptionPane;

public class Register {
	//Variables
	int x=0,y=0,i=1,j=0,op=0;
	//Registering Students names
	public void StudentsNames() {
		//Variable
		int l=0,c=6;
		double average=0;
		//Getting Array size
		l = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos"));
		//Creating first Array
		String[][] students = new String[l][c];
		//Registering students names
		for(x=0;x<l;x++) {
			students[x][0] = JOptionPane.showInputDialog("Informe o nome do " + i++ + "º estudante");
			if(x<l) {
				j=i;
			}
		}
		//Registering Grades and making average grade
		//Getting Grades
		for(x=0;x<l;x++) {
			i=1;
			for(y=1;y<4;y++) {
				students[x][y] = JOptionPane.showInputDialog("Informe a " + i++ + "º nota " + "do aluno " + students[x][0]);
			}
		}
		//Making each student average grade
		for(x=0;x<l;x++) {
			average=0;
			for(y=1;y<4;y++) {
				average += Double.parseDouble(students[x][y]);
				if(y == 3) {
					average/=3;
				}
				if(average >= 7.0) {
					students[x][5] = "Aprovado";
					students[x][4] = String.valueOf(average);
				}else {
					students[x][5] = "Reprovado";
					students[x][4] = String.valueOf(average);
				}
			}
		}
		//Seding everything to other function
		Repeat(l,c,students);
	}
	//Ask if you want to register new students
	public void Repeat(int l,int c,String[][] students) {
		while(op < 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n[1]Registrar mais alunos\n[2]Ver alunos registrados\n[3]Remove um aluno\n[4]Sair"));
			if(op == 1) {
				StudentsNames2(l,c,students);
			}else if(op == 2){
				StringBuilder sb = new StringBuilder(l);
				sb.append("<html><table>");
				for(x=0;x<l;x++) {
					sb.append("<tr><td>");
					sb.append("[Aluno]");
					sb.append("</td>");
					for(y=0;y<c;y++) {
						sb.append("<td>");
						sb.append("[" + students[x][y] + "]");
						sb.append("</td>");
					}
					sb.append("</tr");
				}
				sb.append("</table></html>");
				JOptionPane.showMessageDialog(null, sb.toString());
			}else if(op == 3) {
				Remove(l,c,students);
			}else if(op == 4){
				JOptionPane.showMessageDialog(null,"Obrigado por usar nosso software");
			}else {
				JOptionPane.showMessageDialog(null,"Obrigado por usar nosso software");
				op=99;
			}
		}
	}
	//Registering new students
	public void StudentsNames2(int l,int c,String[][] students) {
		//Variable
		int l1=0;
		double average=0.0;
		//Getting Array size
		l1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o novo número de alunos"));
		//Creating first Array
		String[][] students2 = new String[l1][c];
		//Passing old data to new array
		for(x=0;x<l;x++) {
			for(y=0;y<c;y++) {
				students2[x][y] = students[x][y];
			}
		}
		//Registering students names
		for(x=l;x<l1;x++) {
			students2[x][0] = JOptionPane.showInputDialog("Informe o nome do " + j++ + "º estudante");
		}
		//Resetting variable for counting
		//Getting Grades
		for(x=l;x<l1;x++) {
			i=1;
			for(y=1;y<4;y++) {
				students2[x][y] = JOptionPane.showInputDialog("Informe a " + i++ + "º nota " + "do aluno " + students2[x][0]);
			}
		}
		//Making each student average grade
		for(x=l;x<l1;x++) {
			average=0;
			for(y=1;y<4;y++) {
				average += Double.parseDouble(students2[x][y]);
				if(y == 3) {
					average/=3;
				}
				if(average >= 7.0) {
					students2[x][5] = "Aprovado";
					students2[x][4] = String.valueOf(average);
				}else {
					students2[x][5] = "Reprovado";
					students2[x][4] = String.valueOf(average);
				}
			}
		}
		//Sending size and array to Choice function
		Repeat(l1,c,students2);
	}
	//Removing a student
	public void Remove(int l,int c,String[][] students) {
		//Variables
		int n=0,k=0;
		//Choosing wich student to delete
		StringBuilder sb = new StringBuilder(l);
		sb.append("<html><table>");
		i=1;
		for(x=0;x<l;x++) {
			sb.append("<tr><td>");
			sb.append(i++ + "º Aluno");
			sb.append("</td>");
			for(y=0;y<c;y++) {
				sb.append("<td>");
				sb.append("[" + students[x][y] + "]");
				sb.append("</td>");
			}
			sb.append("</tr");
		}
		sb.append("</table></html>");
		n = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
		n-=1;
		for(y=0;y<c;y++) {
			students[n][y] = "NR";
		}
		l-=1;
		String[][] studentsnew = new String[l][c];
		for(x=0;x<l;x++) {
			k=x;
			for(y=0;y<c;y++) {
				if(students[x][y] == "NR") {
					studentsnew[x][y] = students[k+1][y];
					students[k+1][y] = "NR";
				}else {
					studentsnew[x][y] = students[x][y];
				}
			}
		}
		j=i-1;
		Repeat(l, c, studentsnew);
	}
}