package encapsulamento;

import javax.swing.JOptionPane;

public class Cliente {
	private String name=" ",endereco=" ",cpf=" ";
	private int idade=0;
	private double saldo=0;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void addCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void mudaCpf(String cpf) {
		validaCpf(cpf);
	}
	
	private void validaCpf(String cpf) {
		if(cpf == this.cpf){
			this.cpf = cpf;
			JOptionPane.showMessageDialog(null, "Foi!");
		}else {
			JOptionPane.showMessageDialog(null, "Falso!");
		}
	}
}
