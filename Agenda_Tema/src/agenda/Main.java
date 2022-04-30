package agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome,endereco,cep,cidade,telefone;
		
		System.out.println("Bem vindo a Agenda virtual");
		System.out.print("Informe seu nome: ");
		nome = read.next();
		System.out.print("Informe seu endereço: ");
		endereco = read.next();
		System.out.print("Informe seu CEP: ");
		cep = read.next();
		System.out.print("Informe sua cidade: ");
		cidade = read.next();
		System.out.print("Informe seu telefone: ");
		telefone = read.next();
		
		System.out.println("Confira seu dados\n" + "Nome: " + nome + "\nEndereço: " + endereco + "\nCEP: " + cep + "\nCidade: " + cidade + "\nTelefone: " + telefone);
	}

}
