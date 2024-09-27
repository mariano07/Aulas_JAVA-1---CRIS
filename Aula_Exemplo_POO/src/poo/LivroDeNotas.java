package poo;

import javax.swing.JOptionPane;

public class LivroDeNotas {
	String nomealuno,status,matricula;
	int n1,n2,n3; //Notas
	double media;
	private String obs ="";
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public void Add_Aluno() {
		nomealuno = JOptionPane.showInputDialog("Informe o nome do aluno");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota do aluno " + nomealuno));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota do aluno "  + nomealuno));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira nota do aluno "  + nomealuno));
		matricula = JOptionPane.showInputDialog("Informe a matricula do aluno "  + nomealuno);
	}
	
	public void Media() {
		media = (n1+n2+n3)/3;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno: " + nomealuno + " com média " + media);
			status = "Aluno Aprovado";
		}else {
			JOptionPane.showMessageDialog(null, "Aluno: " + nomealuno + " com média " + media);
			status = "Aluno Reprovado";
		}
	}
	
	public void Status() {
		
		if(status.equals("Aluno Aprovado")) {
			JOptionPane.showMessageDialog(null, "Parabéns Aprovado");
		}else if(status.equals("Aluno Reprovado")){
			JOptionPane.showMessageDialog(null, "Que pena você reprovou :(");
		}
	}
}
