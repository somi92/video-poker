package game_engine;

public class GameHand {
	
	private static CardInHand[] gameHand;
	
	private static GameHand instance = new GameHand();
	
	private GameHand() {
		gameHand = new CardInHand[5];
		gameHand = new CardInHand[5];
		for (int i=0; i<gameHand.length; i++) {
			gameHand[i] = new CardInHand();
		}
	}

	public static GameHand getGameHandInstance() {
		return instance;
	}
	
	public void setPlayingHand(CardInHand[] playingHand) {
		gameHand = playingHand;
	}
	
	public CardInHand[] getPlayingHand() {
		return gameHand;
	}
	
	public CardInHand getPlayingCard(int indexInHand) {
		if (indexInHand<0 || indexInHand>4) {
			throw new RuntimeException("Error! Card positin must be in range 0-4.");
		}
		return gameHand[indexInHand];
	}
	
	public void print() {
		for (int i = 0; i < gameHand.length; i++) {
			System.out.print(" "+gameHand[i]+"  |  ");
		}
	}
}
