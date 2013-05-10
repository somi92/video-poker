package game_engine;

public class TheDealer {

	private static GameHand hand;
	private static DeckOfCards deck;
	
	static {
//		hand = new CardInHand[5];
//		for (int i=0; i<hand.length; i++) {
//			hand[i] = new CardInHand();
//		}
		hand = new GameHand();
	}
	
	public TheDealer() {
//		hand = new CardInHand[5];
//		for (int i=0; i<hand.length; i++) {
//			hand[i] = new CardInHand();
//		}
//		hand = new GameHand();
	}
	
	public static GameHand drawFirstHand() {
		deck = DeckOfCards.getShuffeledDeckInstance();
		for (int i=0; i<5; i++) {
			Card newCard = deck.drawNextCardFromDeck();
			hand.setGameHandCard(i, newCard);
		}
		deck.showDeck();
		return hand;
	}
	
	
	public static GameHand drawSecondHand() {
		if (deck == null) {
			deck = DeckOfCards.getShuffeledDeckInstance();
		}
		for (int i=0; i<hand.gameHandLength(); i++) {
			if (!hand.getGameHandCard(i).isHold()) {
				Card newCard  = deck.drawNextCardFromDeck();
				hand.setGameHandCard(i, newCard);
			}
		}
		
		return hand;
	}
	
	public static CardInHand getCardFromHand(int position) {
		return hand.getGameHandCard(position);
	}
	
	public static void print() {
		for (int i = 0; i < hand.gameHandLength(); i++) {
			System.out.print(" "+hand.getGameHandCard(i)+"  |  ");
		}
	}
}
