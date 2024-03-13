package gameOfWar;

public class App {

	/*
	 * 1. Create a class called App with a main method
	 * 2. instantiate a deck and 2 players, call shuffle method on the deck.
	 * 3. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration
	 * 		using the Deck you instantiated
	 * 4. Using a traditional for loop, iterate 26 times and call the flip method for each player
	 * 5. Compare the value of each card returned by the two player's flip methods. Call the incrementScore method on
	 * 		the player whose card has the higher value.
	 * 6. Print the final score of each player and who won or if it's a draw.
	 */
	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();
	
	//step 3.
		for (int i = 0; i < 52; i++) {
			if ( i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		player1.describe();
		player2.describe();
		
	//step 4.	
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flipCard();
			Card player2Card = player2.flipCard();
			
			System.out.println("\nCard Flipped By Each Player");
			System.out.print("\nPlayer 1's Card: ");
			player1Card.describe();    //Shows the full name and value of player 1's card
			System.out.print("Player 2's Card: ");
			player2Card.describe();    //Shows the full name and value of player 2's card	
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("\nPlayer1 gets a point.");
			}else if
				(player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println("\nPlayer2 gets a point.");
			}else {
				System.out.println("\nIt's a tie, no points awarded.");
			}
			System.out.println("Score: ");
			System.out.println("Player1: " + player1.getScore());
			System.out.println("Player2: " + player2.getScore());
			System.out.println();
		}
	//	step 5 & 6
		 System.out.printf("Player1 score = %d\n", player1.getScore());
	        System.out.printf("Player2 score = %d\n", player2.getScore());
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player1 is the winner!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player2 is the winner!");
	        } else {
	            System.out.println("It is a DRAW!");
	        }
		}   
}

