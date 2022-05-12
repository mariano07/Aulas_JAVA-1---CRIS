package inter;

import javax.swing.JOptionPane;

public interface CaixaEletronico {
	
	void sacar(double valor);
	
	default void verificaFraude() {
		JOptionPane.showMessageDialog(null, "Verificação de Fraude iniciada");
	}
}
