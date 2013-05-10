package game_engine;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DeckOfCards deck = DeckOfCards.getDeckInstance();
//		DeckOfCards shuffeledDeck = DeckOfCards.getShuffeledDeckInstance();
//		
//		deck.showDeck();
//		shuffeledDeck.showDeck();
//		
//		TheDealer d = new TheDealer();
//		GameHand game = TheDealer.drawHand();
//		game.getGameHandCard(3).setHold(true);
//		game.getGameHandCard(4).setHold(true);
//		
//		game.print();
//		
//		GameHand game2 = TheDealer.drawHand(game);
//		System.out.println();
//		game2.print();
		
		TheDealer.drawFirstHand();
		TheDealer.print();
		TheDealer.getCardFromHand(0).setHold(false);
		TheDealer.getCardFromHand(1).setHold(false);
		TheDealer.getCardFromHand(2).setHold(false);
		TheDealer.getCardFromHand(3).setHold(true);
		TheDealer.getCardFromHand(4).setHold(true);
		
		System.out.println();
		
		TheDealer.drawSecondHand();
		TheDealer.print();
		
		
		
//		TheDealer.drawHand();
//		TheDealer.print();

//		System.out.println();
//		System.out.println();
//		
//		TheDealer.drawHand();
//		TheDealer.print();
	}

}
