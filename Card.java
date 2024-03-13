package gameOfWar;

/*
 * 1. Create the Card class
 * 2. Create fields:
 * 		a. Value - contains a value from 2-14, representing cards 2-Ace
 * 		b. Name - Ace of Diamonds, or Two of Hearts, etc.
 * 3. Create methods
 * 		a. getters and setters
 * 		b. describe - prints out information about a card
 */

public class Card {

		String name;
		int value;
		
		public Card(int value, String suit) {
			this.value = value;
			
			switch(value) {
			case 2:
				name = "Two";
				break;
			case 3:
				name = "Three";
				break;
			case 4:
				name = "Four";
				break;
			case 5:
				name = "Five";
				break;
			case 6:
				name = "Six";
				break;
			case 7:
				name = "Seven";
				break;
			case 8:
				name = "Eight";
				break;
			case 9:
				name = "Nine";
				break;
			case 10:
				name = "Ten";
				break;
			case 11:
				name = "Jack";
				break;
			case 12:
				name = "Queen";
				break;
			case 13:
				name = "King";
				break;
			case 14:
				name = "Ace";
				break;
			}
	//This will add the name expression and suit once it is created.		
			name += " of " + suit;
		}

	//Describe method for printing name of cards	
		public void describe() {
			System.out.println(name + ", " + value);
			}
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}