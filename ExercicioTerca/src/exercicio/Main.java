package exercicio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Ingresso ing = new Ingresso();
		Normal nor = new Normal();
		Vip v = new Vip();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		
		ing.setValor(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do ingresso")));
		ci.setLoc(Integer.parseInt(JOptionPane.showInputDialog("Informe a localização do ingresso")));
		cs.setLoc(ci.getLoc());
		
		ci.setValor(ing.getValor());
		cs.setValor(ing.getValor());
		nor.setValor(ing.getValor());
		v.setValor(ing.getValor());
		
		ing.imprimeValor();
		nor.imprimeNormal();
		v.imprimeValor();
		ci.imprimeLoc();
		cs.imprimeLoc();
		
	}

}
