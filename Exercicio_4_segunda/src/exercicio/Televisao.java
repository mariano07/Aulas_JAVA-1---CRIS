package exercicio;

import javax.swing.JOptionPane;

public class Televisao {
	ControleRemoto cr = new ControleRemoto();
	private int v=10,c=1;
	
	public void menu() {
		int option=0;
		
		option = Integer.parseInt(JOptionPane.showInputDialog("Controle remoto\n[1]+Volume\n[2]-Volume\n[3]+Canal\n[4]-Canal\n[5]Ir para canal\n[6]Infos\n[7]Desligar"));
		switch(option) {
			case 1: {
				volumeUP();
				break;
			}
			case 2: {
				volumeDown();
				break;
			}
			case 3: {
				channelUp();
				break;
			}
			case 4: {
				channelDown();
				break;
			}
			case 5: {
				chooseChannel();
				break;
			}
			case 6: {
				info();
				break;
			}
			case 7: {
				JOptionPane.showMessageDialog(null, "Até a proxima :D");
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				menu();
				break;
			}
		}
	}
	
	private void volumeUP() {
		cr.setVolume(++v);
		menu();
	}
	
	private void volumeDown() {
		if(v == 0) {
			JOptionPane.showMessageDialog(null, "Volume já está no mínimo!");
		}else {
			cr.setVolume(--v);
		}
		menu();
	}
	
	private void channelUp() {
		cr.setChannel(++c);
		menu();
	}
	
	private void channelDown() {
		if(c == 1) {
			JOptionPane.showMessageDialog(null, "Canal já está no 1!");
		}else {
		cr.setChannel(--c);
		}
		menu();
	}
	
	private void chooseChannel() {
		cr.setChannel(Integer.parseInt(JOptionPane.showInputDialog("Informe o canal que deseja ir")));
		menu();
	}
	
	private void info() {
		JOptionPane.showMessageDialog(null, "Canal atual: " + cr.getChannel() + "\nVolume atual: " + cr.getVolume());
		menu();
	}
}
