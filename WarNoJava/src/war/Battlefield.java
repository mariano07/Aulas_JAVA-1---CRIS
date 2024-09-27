package war;

import java.util.Random;

public class Battlefield {
	//Creating object
	Random r = new Random();
	//Randomizer for giving the players their coutnries
	public int[] countryDice() {
	    int[] dice = new int[6];
	    int i,j;
	    
	    for (i=0;i<6;i++) {
	        dice[i] = (int)(Math.random()*6);
	        for (j=0;j<i;j++) {
	            if (dice[i] == dice[j]) {
	                i--;
	                break;
	            }
	        }  
	    }
	    return dice;
	}
	//Dice function
	public int rollDice() {
		int dice;
		dice = r.nextInt(6)+1;
		return dice;
	}
	//Function to check if is attacking or not !!YET TO BE IMPLEMENTED!!
	public boolean isAttacking() {
		boolean atk_def;
		atk_def = r.nextBoolean();
		return atk_def;
	}
	
	
}
