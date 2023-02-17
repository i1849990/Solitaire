package a;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private int size;
	private List<Card> cards;
	
	
	public Deck(String[] suits, boolean[] red, int[] value, String[] rank) {
		cards = new ArrayList<Card>();
		size = suits.length;
		for (int i = 0; i < size; i++) {
			cards.add(new Card(suits[i], red[i], value[i], rank[i]));
		}
	}
	
	public Deck() {
		cards = defaultDeck();
		size = 52;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
		this.size = cards.size();
	}

	
	
	public List<Card> defaultDeck() {
		List<Card> temp = new ArrayList<Card>();
		int suitCycle = 0;
		int placement = 0;
		int cardNumber;
		
		while (suitCycle < 4) {
			cardNumber = 1;
			for (int i = 1; i <= 13; i++) {
				temp.add(new Card(defaultSuit(suitCycle),isRed(suitCycle), cardNumber, defaultRank(cardNumber)));
				cardNumber++;
			}
			suitCycle++;
		}
		
		
		
		
		return temp;
	}
	
	public boolean isRed(int suitCycle) {
		if (suitCycle % 2 == 0) {
			return false;
		}
		return true;
	}
	
	public String defaultSuit(int suitCycle){
		if (suitCycle == 0) {
			return "Spades";
		}else if (suitCycle == 1) {
			return "Diamonds";
		}else if (suitCycle == 2) {
			return "Clubs";
		}else {
			return "Hearts";
		}
	}
	
	public String defaultRank(int cardNumber) {
		if (cardNumber == 1) {
			return "Ace";
		}else if (cardNumber == 2) {
			return "Two";
		}else if (cardNumber == 3) {
			return "Three";
		}else if (cardNumber == 4) {
			return "Four";
		}else if (cardNumber == 5) {
			return "Five";
		}else if (cardNumber == 6) {
			return "Six";
		}else if (cardNumber == 7) {
			return "Seven";
		}else if (cardNumber == 8) {
			return "Eight";
		}else if (cardNumber == 9) {
			return "Nine";
		}else if (cardNumber == 10) {
			return "Ten";
		}else if (cardNumber == 11) {
			return "Jack";
		}else if (cardNumber == 12) {
			return "Queen";
		}else {
			return "King";
		}
	}
	
	public void shuffle() {
		List<Card> temp = this.cards;
		List<Integer> position = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			position.clear();
			while (position.size() < 52) {
				int pos1 = (int)(Math.random()*52);
				int pos2 = (int)(Math.random()*52);
				
				while (position.contains(pos1) || position.contains(pos2)) {
					pos1 = (int)(Math.random()*52);
					pos2 = (int)(Math.random()*52);
				}
				
				position.add(pos1);
				position.add(pos2);
				
				Card twmp = (temp.get(pos1));
				temp.set(pos1, temp.get(pos2));
				temp.set(pos2, twmp);
			}
			
		}
		this.cards = temp;
		
	}
	
	

}
