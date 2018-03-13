//This line allows us to use a Scanner.
import java.util.Scanner;

public class PlayWar {

	public static void main(String[] args) {

		//This line provides the necessary scanner.
		Scanner s =new Scanner(System.in);
		
		// These lies will create the dice used to play the game.
		Dice diceObject1 = new Dice();
		Dice diceObject2 = new Dice();
		Dice diceObject3 = new Dice();
		Dice diceObject4 = new Dice();
		
		//These lines prompt the user about the game.
		System.out.println("Welcome to a game of Dice War.");
		System.out.println("Would you like to play? y/n ?");
		String answer = s.next();
		
		while(answer.equals("y"))
		{
			// These next 4 lines will roll the 4 dice.
			diceObject1.rollDice(1,6);
			diceObject2.rollDice(1,6);
			diceObject3.rollDice(1,6);
			diceObject4.rollDice(1,6);
			
			// These next 4 lines will retrieve the value of the 4 dice we just rolled.
			int userRoll1 = diceObject1.getValue();
			int userRoll2 = diceObject2.getValue();
			int compRoll1 = diceObject3.getValue();
			int compRoll2 = diceObject4.getValue();
			
			// These will acquire the 2 totals.
			int userTotal = userRoll1 + userRoll2;
			int compTotal = compRoll1 + compRoll2;
			
			System.out.println("You rolled a "+userRoll1+" and a "+userRoll2+", for a total of "+userTotal+".");
			System.out.println("The computer rolled a "+compRoll1+" and a "+compRoll2+", for a total of "+compTotal+".");
			
			//This sequence of code will check to see if the user won.
			if (userTotal > compTotal)
			{
				System.out.println("Congratulations! You beat the computer in a game of Dice War.");
				System.out.println("");
				System.out.println("Would you like to continue? y/n?");
				answer = s.next();
			}
			
			//This code is used to identify if the user looses.
			if (compTotal > userTotal)
			{
				System.out.println("You Lost! I'm sorry but you lost against the computer.");
				System.out.println("");
				System.out.println("Would you like to continue? y/n?");
				answer = s.next();
			}
			
			//This code is used if the user and computer tie.
			if (compTotal == userTotal)
			{
				System.out.println("Draw! Oh no, you tied. you both rolled "+userTotal+".");
				System.out.println("");
				System.out.println("Would you like to continue? y/n?");
				answer = s.next();
			}
			
			
		}
		
		// This code will execute when the user is done playing.
		if (answer.equals("n"))
		{
			System.out.println("Thank you for playing.");
		}
		
	}
//Thank you for reading through.
}
