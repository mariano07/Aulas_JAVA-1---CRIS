package poli;

public class Tecnico extends Funcionario {
	
	public double bonus = 100;
	
	public double ganhoAnual() {
		double ganho;
		ganho = (super.getSalario() + bonus) * 12;
		return ganho;
	}
}
