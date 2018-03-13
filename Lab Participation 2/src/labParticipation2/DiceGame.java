package labParticipation2;

//This line allows us to use a Scanner.
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {

		//This line provides the necessary scanner.
		Scanner s =new Scanner(System.in);
		
		// These lies will create the dice used to play the game.
		Dice diceObject1 = new Dice();
		Dice diceObject2 = new Dice();
		Dice diceObject3 = new Dice();
		Dice diceObject4 = new Dice();
		
		int gamesWon = 0;
		int gamesLost = 0;
		int gamesTied = 0;
		int totalGames = 0;
		
		int loopVariable = 0;
		
		//These lines prompt the user about the game.
		System.out.println("Welcome to a game of Dice War.");
		System.out.println("Would you like to ... ");
		System.out.println("1: Play the dice game?");
		System.out.println("2: Display the statistics of the game?");
		System.out.println("3: Quit the game?");
		System.out.println("Please enter 1, 2 or 3.");
		String answer = s.next();
		
		//This while loop plays the game.
		
		//The while condition is abstract to allow the user to keep playing
		//even if they enter a value not offered by the menu.
		//The game will allow them the chance to keep trying
		//and only quitting will exit the game.
		while(loopVariable>=0)
		{
			if (answer.equals("1"))
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
				
				//This sequence of code will check to see if the user won and react accordingly.
				if (userTotal > compTotal)
				{
					System.out.println("Congratulations! You beat the computer in a game of Dice War.");
					System.out.println("");
					gamesWon = gamesWon +1 ;
					totalGames= totalGames + 1;
				}
				
				//This code is used to identify if the user looses and add to game statistics.
				if (compTotal > userTotal)
				{
					System.out.println("You Lost! I'm sorry but you lost against the computer.");
					System.out.println("");
					gamesLost = gamesLost + 1;
					totalGames= totalGames + 1;
				}
				
				//This code is used if the user and computer tie and react similar to if the user wins or looses..
				if (compTotal == userTotal)
				{
					System.out.println("Draw! Oh no, you tied. you both rolled "+userTotal+".");
					System.out.println("");
					gamesTied = gamesTied + 1;
					totalGames= totalGames + 1;
				}
				
				//These lines will prompt the user after a game is played.
				System.out.println("Would you like to ... ");
				System.out.println("1: Play the dice game?");
				System.out.println("2: Display the statistics of the game?");
				System.out.println("3: Quit the game?");
				System.out.println("Please enter 1, 2 or 3.");
				answer = s.next();
			}
			
			//This block will display the statistics of the games played and prompt the user after displaying the desired information.
			if (answer.equals("2"))
			{
				System.out.println("Here are your game statistics so far.");
				System.out.println("Games Won:"+gamesWon);
				System.out.println("Games Tied:"+gamesTied);
				System.out.println("Games Lost:"+gamesLost);
				System.out.println("Total Games:"+totalGames);
				System.out.println("Would you like to ... ");
				System.out.println("1: Play the dice game?");
				System.out.println("2: Display the statistics of the game?");
				System.out.println("3: Quit the game?");
				System.out.println("Please enter 1, 2 or 3.");
				answer = s.next();
			}
			
			//This will simply end the game if the user desires such an option.
			if (answer.equals("3"))
			{
				System.out.println("You have decided to quit.");
				System.out.println("Thank you for playing.");
				System.out.println("Goodbye.");
				break;
			}
			
			//This block of code will be used if the user does not use the menu properly.
			//The loop is set up to allow the user to enter an incorrect number
			//and try again and again until they enter a proper number option.
			if(!answer.equals("1") && !answer.equals("2") && !answer.equals("3"))
			{
				System.out.println("You did not enter a possible option. Once again...");
				System.out.println("Would you like to ... ");
				System.out.println("1: Play the dice game?");
				System.out.println("2: Display the statistics of the game?");
				System.out.println("3: Quit the game?");
				System.out.println("Please enter 1, 2 or 3.");
				answer = s.next();
			}
		}
		
		
		
	}
//Thank you for reading through.
}
