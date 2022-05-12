package poli;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double ganhoAnual() {
		double ganho;
		ganho = salario*12;
		return ganho;
	}
	
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalario: " + salario);
	}
}
