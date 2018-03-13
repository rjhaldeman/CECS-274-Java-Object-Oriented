package edu.csulb.CECS274.Lab1BlackJack;

import java.util.Scanner;
public class PlayBlackJackGame {

	private static Scanner s;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);

		int money;          // Amount of money the user has.
	    int bet; 			// Amount of money the user is betting.
	    money = 100; 		//The user starts of with $100.
		boolean userWins;	//This condition will be true if the user wins.
	    
	    int loopVariable = 0;
		Deck funDeck = new Deck();
		Hand testerHand = new Hand();
	    
		System.out.println("Welcome to Black Jack.");
		System.out.println("Here are your options.");
		System.out.println("Would you like to ...");
		System.out.println("1:Create a new deck?");
		System.out.println("2:Deal 4 cards and show the number of remaining cards.");
		System.out.println("3:Shuffle the deck and show the cards?");
		System.out.println("4:Play Black Jack?");
		System.out.println("5:Quit entirely?");
		System.out.println("Please enter 1, 2, 3, 4, or 5.");
		int x = s.nextInt();
		if(x>-1 && x<6)
		{
			loopVariable = x;
		}
		
	    while(loopVariable>0 && loopVariable < 6)
	    {
			//This will happen if the user decides option 1.
	    	if(loopVariable == 1)
			{
				funDeck = new Deck();
				System.out.println("You have created a new, unshuffled deck.");
				System.out.println("");
				System.out.println("Would you like to ...");
				System.out.println("1:Create a new deck?");
				System.out.println("2:Deal 4 cards and show the number of remaining cards.");
				System.out.println("3:Shuffle the deck and show the cards?");
				System.out.println("4:Play Black Jack?");
				System.out.println("5:Quit entirely?");
				System.out.println("Please enter 1, 2, 3, 4, or 5.");
				loopVariable = s.nextInt();
				continue;
			}
	    	
	    	if(loopVariable == 2)
	    	{
	    		Card newCard1 = funDeck.dealCard();
	    		Card newCard2 = funDeck.dealCard();
	    		Card newCard3 = funDeck.dealCard();
	    		Card newCard4 = funDeck.dealCard();
	    		testerHand.addCard(newCard1);
	    		testerHand.addCard(newCard2);
	    		testerHand.addCard(newCard3);
	    		testerHand.addCard(newCard4);
	    		System.out.println("These are your cards that were just dealt.");
	    		for(int i = 0; i < testerHand.size(); i++)
	    		{
	    			System.out.println(testerHand.getCard(i));
	    		}
	    		System.out.println("The number of cards remaining is "+funDeck.cardsLeft());
	    		System.out.println();
	    		System.out.println("Would you like to ...");
				System.out.println("1:Create a new deck?");
				System.out.println("2:Deal 4 cards and show the number of remaining cards.");
				System.out.println("3:Shuffle the deck and show the cards?");
				System.out.println("4:Play Black Jack?");
				System.out.println("5:Quit entirely?");
				System.out.println("Please enter 1, 2, 3, 4, or 5.");
				loopVariable = s.nextInt();
				continue;
	    	}
	    	
	    	if(loopVariable == 3)
	    	{
	    		funDeck.shuffle();
	    		for(int i = 0; i<funDeck.cardsLeft(); i++)
	    		{
	    			funDeck.printDeck(i);
	    			
	    		}
	    		System.out.println("Would you like to ...");
				System.out.println("1:Create a new deck?");
				System.out.println("2:Deal 4 cards and show the number of remaining cards.");
				System.out.println("3:Shuffle the deck and show the cards?");
				System.out.println("4:Play Black Jack?");
				System.out.println("5:Quit entirely?");
				System.out.println("Please enter 1, 2, 3, 4, or 5.");
				loopVariable = s.nextInt(); 
				continue;
	    	}
	    	
	    	if(loopVariable == 5)
	    	{
	    		System.out.println("You have decides to quit.");
	    		bet = 0;
	    		
	    	}
		
		    if (loopVariable == 4) {
		    	   System.out.println("You have " + money + " dollars.");
		           do {
		        	   System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
		        	   System.out.println("? ");
		        	   bet = s.nextInt();
		              if (bet < 0 || bet > money)
		            	  System.out.println("Your answer must be between 0 and " + money + '.');
		           } while (bet < 0 || bet > money);
		           if (bet == 0)
		              break;
		           userWins = playBlackjack();
		           if (userWins)
		              money = money + bet;
		           else
		              money = money - bet;
		           System.out.println("");
		           if (money == 0) {
		              System.out.println("You are out of money!");
		              System.out.println("Thank you for playing.");
		              System.out.println("Goodbye.");
		              break;
		           }
		            System.out.println("Would you like to ...");
		            System.out.println("1:Create a new deck?");
					System.out.println("2:Deal 4 cards and show the number of remaining cards.");
					System.out.println("3:Shuffle the deck and show the cards?");
					System.out.println("4:Play Black Jack?");
					System.out.println("5:Quit entirely?");
					System.out.println("Please enter 1, 2, 3, 4, or 5.");
					loopVariable = s.nextInt();
					continue;
		       }
		       
		       System.out.println("");
		       System.out.println("You leave with $" + money + '.');
		       loopVariable = 7;
		    
		    } // This will exit the game.
		}
	    
	    static boolean playBlackjack() {
	          // Let the user play one game of Blackjack.
	          // Return true if the user wins, false if the user loses.
	 
	       Deck deck;         // A deck of cards.  A new deck for each game.
	       Hand dealerHand;   // The dealer's hand.
	       Hand userHand;     // The user's hand.
	            
	       deck = new Deck();
	       dealerHand = new Hand();
	       userHand = new Hand();
	 
	       // This will shuffle the deck, then deal two cards to each player.
	       
	       deck.shuffle();
	       dealerHand.addCard( deck.dealCard() );
	       dealerHand.addCard( deck.dealCard() );
	       userHand.addCard( deck.dealCard() );
	       userHand.addCard( deck.dealCard() );
	       
	       System.out.println("");
	       System.out.println("");
	       
	       // This will check to see if someone has BlackJack
	       
	       if (dealerHand.getBlackjackValue() == 21) {
	            System.out.println("Dealer has the " + dealerHand.getCard(0)
	                                    + " and the " + dealerHand.getCard(1) + ".");
	            System.out.println("User has the " + userHand.getCard(0)
	                                      + " and the " + userHand.getCard(1) + ".");
	            System.out.println();
	            System.out.println("Dealer has Blackjack.  Dealer wins.");
	            return false;
	       }
	       
	       if (userHand.getBlackjackValue() == 21) {
	            System.out.println("Dealer has the " + dealerHand.getCard(0)
	                                    + " and the " + dealerHand.getCard(1) + ".");
	            System.out.println("User has the " + userHand.getCard(0)
	                                      + " and the " + userHand.getCard(1) + ".");
	            System.out.println("");
	            System.out.println("You have Blackjack.  You win.");
	            return true;
	       }
	       
	       //  If neither player has Blackjack, play the game. This code will execute.
	       
	       while (true) {
	           
	            /* This display user's cards, and let user decide to Hit or Stand. */
	 
	            System.out.println("");
	            System.out.println("Your cards are:");
	            for ( int i = 0; i < userHand.getCardCount(); i++ )
	            {
	               System.out.println("    " + userHand.getCard(i));
	            }
	            System.out.println("Your total is " + userHand.getBlackjackValue());
	            System.out.println("");
	            System.out.println("Dealer is showing the " + dealerHand.getCard(0));
	            System.out.println();
	            System.out.println("Would you like to Hit (y) or Stand (n)? [y/n]");
	            String userAction;  // User's response, 'H' or 'S'.
	            s = new Scanner(System.in);
                userAction = s.next();
                
	               if (!userAction.equals("y") && !userAction.equals("n"))
	               {
	                  System.out.println("Please respond y or an n:  ");
	                  userAction = s.next();
	               }
	               
	               //This will play out if the user chooses to hit.
	               if(userAction.equals("y")) 
	               {  
	            	   	Card newCard = deck.dealCard();
		                userHand.addCard(newCard);
		                System.out.println("");
		                System.out.println("User hits.");
		                System.out.println("Your card is the " + newCard);
		                System.out.println("Your total is now " + userHand.getBlackjackValue());
		                //userAction = s.next();
		                if (userHand.getBlackjackValue() > 21) 
		                {
		                	System.out.println();
		                	System.out.println("You busted by going over 21.  You lose.");
		                	System.out.println("Dealer's other card was the " + dealerHand.getCard(1));
		                	return false;  
		                }
		                continue;
	            } 
	 
	            /* If the user Hits, the user gets a card.  If the user Stands,
	               the loop ends (and it's the dealer's turn to draw cards).
	            */
	 
	       
	       //This code will work if the user stands with 21 or less.
	       if ( userAction.equals("n") )
	       {
	       System.out.println("");
	       System.out.println("User stands.");
	       System.out.println("Dealer's cards are");
	       System.out.println("    " + dealerHand.getCard(0));
	       System.out.println("    " + dealerHand.getCard(1));
	       }
	       while (dealerHand.getBlackjackValue() < 17) {
	          Card newCard = deck.dealCard();
	          System.out.println("Dealer hits and gets the " + newCard);
	          dealerHand.addCard(newCard);
	          if (dealerHand.getBlackjackValue() > 21) {
	             System.out.println();
	             System.out.println("Dealer busted by going over 21.  You win.");
	             return true;
	          }
	       
	       System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());
	       }
	       //These next lines will determine a winner.
	       
	       System.out.println();
	       if (dealerHand.getBlackjackValue() == userHand.getBlackjackValue()) {
	          System.out.println("Dealer wins on a tie.");
	          System.out.println("You lost.");
	          System.out.println("The Dealer and you had "+  + dealerHand.getBlackjackValue()+" points.");
	          return false;
	       }
	       else if (dealerHand.getBlackjackValue() > userHand.getBlackjackValue()) {
	          System.out.println("Dealer wins.");
	          System.out.println("The Dealer had "+  + dealerHand.getBlackjackValue()+" points.");
	          System.out.println("You had " + userHand.getBlackjackValue()+" points.");
	          return false;
	       }
	       else {
	          System.out.println("You win."); 
	          System.out.println("The Dealer had "+  + dealerHand.getBlackjackValue()+" points.");
	          System.out.println("You had " + userHand.getBlackjackValue()+" points.");
	          return true;
	       }
	 
	    }  // end playBlackjack()
	 
	 
	 }
} // end while loop