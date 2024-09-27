package tema;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Variaveis
		String dado = " ";
		int i=0,dadoInt=0;
		boolean verificacao = true;
		
		//Inicio do programa
		JOptionPane.showMessageDialog(null, "Olá, clique ok para iniciar o programa");
		//For pra realizar 10 vezes a tarefa
		for(i=0;i<10;i++) {
			//Aquisição de dados
			dado = JOptionPane.showInputDialog("Informe algum dado");
			//Verificando se é possivel transformar a variavel em Int
			try {
            dadoInt = Integer.parseInt(dado);
			} catch (NumberFormatException e) {
            verificacao = false;
			}
			//Verificando se a variavel continuou sendo String ou virou Inteira
			if(verificacao == true) {
				JOptionPane.showMessageDialog(null, "Seu dado é um Inteiro: " + dadoInt);
			}else {
				JOptionPane.showMessageDialog(null, "Seu dado é uma String: " + dado);
			}
		}
	}

}

