package game_engine;

public class GameHand {

	private static CardInHand[] gameHand;
	
	public GameHand() {
		gameHand = new CardInHand[5];
		for (int i=0; i<gameHand.length; i++) {
			gameHand[i] = new CardInHand();
		}
	}
	
	void setGameHandCard(int position, Card newCard) {
		if (position<0 || position>4) {
			throw new RuntimeException("Error! Card positin must be in range 0-4.");
		}
		if (newCard == null) {
			throw new RuntimeException("Error! newCard cannot be null.");
		}
		gameHand[position].setCardNumber(newCard.getCardNumber());
		gameHand[position].setCardSuit(newCard.getCardSuit());
		gameHand[position].setCardImage(newCard.getCardImage());			
	}
	
	CardInHand getGameHandCard(int position) {
		if (position<0 || position>4) {
			throw new RuntimeException("Error! Card positin must be in range 0-4.");
		}
		return gameHand[position];
	}
	
	int gameHandLength() {
		return gameHand.length;
	}
	
//	public void print() {
//		for (int i = 0; i < gameHandLength(); i++) {
//			System.out.print(" "+gameHand[i]+"  |  ");
//		}
//	}
}
