
package labParticipation3;

public class Player {
	
	
	Dice[] playerDice = new Dice[2];
	
	private int total;
	
	public Player() //constructor.
	{
		playerDice[0] = new Dice();
		playerDice[1] = new Dice();
	}
	
	//Rolls both dice and gets total points.
	public void rollDices() // method
	{
		playerDice[0].rollDice(1, 6);
		playerDice[1].rollDice(1, 6);
		total = playerDice[0].getValue()+playerDice[1].getValue();
		
	}
	
	//returns total points.
	public int getTotalPoints()
	{
		return total;
	}

}
