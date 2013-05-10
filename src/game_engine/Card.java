package game_engine;

import java.awt.Image;

class Card {

	private int cardNumber;
	private CardSuit cardSuit;
	private Image cardImage;
	
	public Card() {
		
	}
	
	public Card(int cardNumber,CardSuit cardSuit,Image cardImage) {
		setCardNumber(cardNumber);
		setCardSuit(cardSuit);
		setCardImage(cardImage);
	}

	public int getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(int cardNumber) {
		if (cardNumber < 1 || cardNumber >13) {
			throw new RuntimeException("Card number is out of bounds!");
		} else {
			this.cardNumber = cardNumber;
		}
	}

	public CardSuit getCardSuit() {
		return cardSuit;
	}

	void setCardSuit(CardSuit cardSuit) {
		this.cardSuit = cardSuit;
	}

	public Image getCardImage() {
		return cardImage;
	}

	void setCardImage(Image cardImage) {
		this.cardImage = cardImage;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Card)) {
			return false;
		}
		Card newCard = (Card)o;
		if (newCard.getCardSuit() == this.getCardSuit() && newCard.getCardNumber() == this.getCardNumber()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return this.getCardNumber()+" of "+this.getCardSuit();
	}
}
