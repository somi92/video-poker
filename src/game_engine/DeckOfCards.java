package game_engine;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import video_poker.GUImain;

class DeckOfCards {

	private static Card[] deck;
	private static int cardPointer;
	
	private static DeckOfCards instance = new DeckOfCards();
	
	private DeckOfCards() {
		initializeTheDeck();
	}
	
	private static void initializeTheDeck() {
		deck = new Card[52];
		cardPointer = 0;
		int cardCounter = 0;
	    for (int i=1; i<=4; i++) {
	    	for (int j=1; j<=13; j++) {
	    		
	    		CardSuitEnum suit = null;
	    		
	    		switch (i) {
	    		case 1:
	    			suit = CardSuitEnum.HEARTS;
	    			break;
	    		case 2: 
	    			suit = CardSuitEnum.SPADES;
	    			break;
	    		case 3:
	    			suit = CardSuitEnum.DIAMONDS;
	    			break;
	    		case 4:
	    			suit = CardSuitEnum.CLUBS;
	    			break;
	    		}
	    		
	    		Image cardImage = Toolkit.getDefaultToolkit().getImage(GUImain.class.getResource("/resources/cards/"+i+j+".png"));
	    		deck[cardCounter++] = new Card(j, suit, cardImage);

	    	}
	    }
	}

	public static DeckOfCards getDeckInstance() {
		initializeTheDeck();
		return instance;
	}
	
	public static DeckOfCards getShuffeledDeckInstance() {
		return instance.shuffleTheDeck();
	}
	
	public void showDeck() {
		int counter = 0;
		for (int i=0; i<52; i++) {
			System.out.println(deck[i]);
			counter++;
		}
		System.out.println('\n'+"Card count: "+counter+'\n');
	}
	
	public Card drawNextCardFromDeck() {
		return deck[cardPointer++];
	}
	
	private DeckOfCards shuffleTheDeck() {
		cardPointer = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<52; j++) {
				int uLimit = 52-j;
				Random rnd = new Random();
				int a = rnd.nextInt(uLimit)+j;
				Card temp = deck[j];
				deck[j] = deck[a];
				deck[a] = temp;
			}
		}
		return instance;
	}
}
