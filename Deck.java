package codingProjectWeek06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 1. Create the Deck Class
 * 2. Create the field: cards - List of Cards
 * 3. Create the methods
 * 		a. Shuffle - randomizes the order of the cards
 * 		b. Draw - removes and returns the top card of the Cards field
 * 		c. In the constructor, when a new Deck is instantiated, the cards field should be populated
 * 			with the standard 52 cards.
 */

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
	
	public Deck()
	{
		int[] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for (String suit : suits) {
			int count = 2;
			for (Integer numberName : numbers) {
				cards.add(new Card(numberName, suit));
				count++;
		}
	}
}


	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		Card card = cards.remove(0);
		return card;
		}
	
	}	

