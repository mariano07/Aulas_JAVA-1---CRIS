package war;

import java.util.Random;

public class Battlefield {
	Random r = new Random();
	
	public int rollDice() {
		int dice;
		dice = r.nextInt(6)+1;
		return dice;
	}
	
	public boolean isAttacking() {
		boolean atk_def;
		atk_def = r.nextBoolean();
		return atk_def;
	}
	
	
}
