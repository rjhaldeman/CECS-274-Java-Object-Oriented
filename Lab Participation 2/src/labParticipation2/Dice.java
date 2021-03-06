package labParticipation2;

import java.util.Random;
public class Dice {

	// This will provide a random dice roll
	
	private int diceValue = 0;
	
	public int rollDice(int min, int max) 
	{

		if (min >= max) 
		{
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		int randNum = r.nextInt((max - min) + 1) + min;
		diceValue = randNum;
		return diceValue;
	}
	
	
	//This will return to us the value of the rolled die.
	public int getValue()
	{
		return diceValue;
	}
	
}
