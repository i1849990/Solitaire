package a;
public class Card {
	private String suit;
	private boolean red;
	private int value;
	private String rank;
	
	public Card(String pSuit, boolean pRed, int pValue, String pRank) {
		suit = pSuit;
		red = pRed;
		value = pValue;
		rank = pRank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return "The " + rank + " of " + suit;
	}
	
	

}
