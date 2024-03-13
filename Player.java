package gameOfWar;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Create the Player Class
 * 2. Create the fields
 * 		a. Hand - List of Card
 * 		b. Score - set to 0 in the constructor
 * 		c. Name
 * 3. Create the methods
 * 		a. Describe - prints out information about the player and calls the describe method for each
 * 			card in the Hand list
 * 		b. Flip - removes and returns the top card of the Hand
 * 		c. Draw - takes a Deck as an argument and calls the draw method on the deck, adding
 * 			the returned Card to the Hand field
 * 		d. IncrementScore - adds 1 to the Player's score field
 */

public class Player {

	// Fields
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();
	
	//Constructor
	public Player() {
		score = 0;
	}
	
	public Player(String newName) {
		name = newName;
		score = 0;
	}
	
	public void describe() {
		System.out.printf("\nPlayer %s has the following cards: \n", name);
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flipCard() {
		return hand.remove(0);
	}
	
	public void incrementScore() {
		score++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}