package exercicio;

import javax.swing.JOptionPane;

public class ControleRemoto {
	//Creating class call
	Televisao tv = new Televisao();
	//variables
	private int v=10,c=1;
	
	public void menu() {
		//Variable
		int option=0;
		//Giving user choices
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
		//adding +1 to tv volume
		tv.setVolume(++v);
		//going back to menu
		menu();
	}
	
	private void volumeDown() {
		//checking if volume is 0 and removing or not -1
		if(v == 0) {
			JOptionPane.showMessageDialog(null, "Volume já está no mínimo!");
		}else {
			tv.setVolume(--v);
		}
		//going back to menu
		menu();
	}
	
	private void channelUp() {
		//going up one channel
		tv.setChannel(++c);
		//going back to menu
		menu();
	}
	
	private void channelDown() {
		//checking if the channel is already on the limit and going down by one if not
		if(c == 1) {
			JOptionPane.showMessageDialog(null, "Canal já está no 1!");
		}else {
		tv.setChannel(--c);
		}
		//going back to menu
		menu();
	}
	
	private void chooseChannel() {
		//going directly to a desired channel
		tv.setChannel(Integer.parseInt(JOptionPane.showInputDialog("Informe o canal que deseja ir")));
		//going back to menu
		menu();
	}
	
	private void info() {
		//showing wich channel the tv is and the current volume
		JOptionPane.showMessageDialog(null, "Canal atual: " + tv.getChannel() + "\nVolume atual: " + tv.getVolume());
		//going back to menu
		menu();
	}
}
