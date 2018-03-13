package edu.csulb.CECS274.Lab1BlackJack;


public class Deck {

    private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed; // How many cards have been dealt from the deck.
    
    public Deck() {
           // Create an unshuffled deck of cards.
       deck = new Card[52];
       int cardCt = 0; // How many cards have been created so far.
       for ( int suit = 0; suit <= 3; suit++ ) {
          for ( int value = 1; value <= 13; value++ ) {
             deck[cardCt] = new Card(value,suit);
             cardCt++;
          }
       }
       cardsUsed = 0;
    }
    
    //This will shuffle the deck.
    public void shuffle() 
    {
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
        
    //This will yield how many cards are left.
    public int cardsLeft() 
    {
        return 52 - cardsUsed;
    }
    
    //This will print out the deck.
    public String printDeck(int position)
    {
    	String tempString = deck[position].toString();
    	System.out.println(tempString);
    	return tempString;
    }
    
    // This deals one card from the deck and returns it.
    public Card dealCard() {
        if (cardsUsed == 32)
           shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

} // end class Deck