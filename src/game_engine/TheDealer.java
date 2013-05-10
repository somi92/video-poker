package game_engine;

public class TheDealer {

	private static CardInHand[] hand;
	private static DeckOfCards deck;
	
	private static TheDealer instance = new TheDealer();

	private TheDealer() {
		deck = DeckOfCards.getShuffeledDeckInstance();
		hand = new CardInHand[5];
		for (int i=0; i<hand.length; i++) {
			hand[i] = new CardInHand();
		}
	}
	
	public static TheDealer getTheDealerInstance() {
		return instance;
	}
	
	public CardInHand[] drawHand() {
		deck = DeckOfCards.getShuffeledDeckInstance();
		for (int i=0; i<5; i++) {
			Card newCard = deck.drawNextCardFromDeck();
			setGameHandCard(i, newCard);
		}
		deck.showDeck();
		return hand;
	}
	
	public CardInHand[] drawHand(GameHand playedHand) {
		for (int i=0; i<5; i++) {
			if (!playedHand.getPlayingCard(i).isHold()) {
				Card newCard = deck.drawNextCardFromDeck();
				setGameHandCard(i, newCard);
			}
		}
		return hand;
	}
	
	private void setGameHandCard(int position, Card newCard) {
		if (position<0 || position>4) {
			throw new RuntimeException("Error! Card positin must be in range 0-4.");
		}
		if (newCard == null) {
			throw new RuntimeException("Error! newCard cannot be null.");
		}
		hand[position].setCardNumber(newCard.getCardNumber());
		hand[position].setCardSuit(newCard.getCardSuit());
		hand[position].setCardImage(newCard.getCardImage());			
	}
}
