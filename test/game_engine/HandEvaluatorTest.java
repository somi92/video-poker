package game_engine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HandEvaluatorTest {

	private static CardInHand[] cards;
	private HandEvaluator h;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cards = new CardInHand[5];
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cards = null;
	}

	@Before
	public void setUp() throws Exception {
		for (int i=0; i<cards.length; i++) {
			cards[i] = new CardInHand();
			cards[i].setCardSuit(CardSuitEnum.HEARTS);
		}
		h = new HandEvaluator();
	}

	@After
	public void tearDown() throws Exception {
		cards = null;
		cards = new CardInHand[5];
		h = null;
	}

//	@Test
//	public void testHandEvaluator() {
//
//	}

//	@Test
//	public void testSortHand() {
//
//	}
//
//	@Test
//	public void testIsPair() {
//
//	}
//
	
	/*****************************************************************************************************************/
//	@Test
//	public void testEvaluateHandRF() {
//		
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardNumber(9);
//		cards[1].setCardNumber(10);
//		cards[2].setCardNumber(11);
//		cards[3].setCardNumber(12);
//		cards[4].setCardNumber(13);
//		cards[0].setCardSuit(CardSuitEnum.HEARTS);
//		cards[1].setCardSuit(CardSuitEnum.HEARTS);
//		cards[2].setCardSuit(CardSuitEnum.HEARTS);
//		cards[3].setCardSuit(CardSuitEnum.HEARTS);
//		cards[4].setCardSuit(CardSuitEnum.HEARTS);
//		HandRankEnum expected = HandRankEnum.ROYAL_FLUSH;
//		HandRankEnum value = h.evaluateHand(inputHand);
//		assertEquals(expected, value);
//	}
//	
//	@Test
//	public void testEvaluateHandSF() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		for (int i=1; i<10; i++) {
//			cards[0].setCardNumber(i+1);
//			cards[0].setCardSuit(CardSuitEnum.HEARTS);
//			
//			cards[1].setCardNumber(i+4);
//			cards[1].setCardSuit(CardSuitEnum.HEARTS);
//			
//			cards[2].setCardNumber(i);
//			cards[2].setCardSuit(CardSuitEnum.HEARTS);
//			
//			cards[3].setCardNumber(i+3);
//			cards[3].setCardSuit(CardSuitEnum.HEARTS);
//			
//			cards[4].setCardNumber(i+2);
//			cards[4].setCardSuit(CardSuitEnum.HEARTS);
//			
//			HandRankEnum expected = HandRankEnum.STRAIGHT_FLUSH;
//			HandRankEnum value = h.evaluateHand(inputHand);
//			assertEquals(expected, value);
//		}
//	}
//	
//	@Test
//	public void testEvaluateHandFOK() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardNumber(5);
//		cards[1].setCardNumber(10);
//		cards[2].setCardNumber(5);
//		cards[3].setCardNumber(5);
//		cards[4].setCardNumber(5);
//		
//		HandRankEnum expected = HandRankEnum.FOUR_OF_A_KIND;
//		HandRankEnum value = h.evaluateHand(inputHand);
//		assertEquals(expected, value);
//		
//	}
//	
//	@Test
//	public void testEvaluateHandFH() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardNumber(2);
//		cards[1].setCardNumber(1);
//		cards[2].setCardNumber(2);
//		cards[3].setCardNumber(1);
//		cards[4].setCardNumber(1);
//		
//		HandRankEnum expected = HandRankEnum.FULL_HOUSE;
//		HandRankEnum value = h.evaluateHand(inputHand);
//		assertEquals(expected, value);
//	}
//	
//	@Test
//	public void testEvaluateHandFLS() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardSuit(CardSuitEnum.HEARTS);
//		cards[1].setCardSuit(CardSuitEnum.HEARTS);
//		cards[2].setCardSuit(CardSuitEnum.HEARTS);
//		cards[3].setCardSuit(CardSuitEnum.HEARTS);
//		cards[4].setCardSuit(CardSuitEnum.HEARTS);
//		
//		cards[0].setCardNumber(7);
//		cards[1].setCardNumber(1);
//		cards[2].setCardNumber(2);
//		cards[3].setCardNumber(3);
//		cards[4].setCardNumber(1);
//		
//		HandRankEnum expected = HandRankEnum.FLUSH;
//		HandRankEnum value = h.evaluateHand(inputHand);
//		assertEquals(expected, value);
//	}
//
//	@Test
//	public void testEvaluateHandSTR() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		for (int i=1; i<10; i++) {
//			cards[0].setCardNumber(i+3);
//			cards[1].setCardNumber(i);
//			cards[2].setCardNumber(i+1);
//			cards[3].setCardNumber(i+4);
//			cards[4].setCardNumber(i+2);
//	
//			cards[0].setCardSuit(CardSuitEnum.SPADES);
//			cards[1].setCardSuit(CardSuitEnum.HEARTS);
//			cards[2].setCardSuit(CardSuitEnum.DIAMONDS);
//			cards[3].setCardSuit(CardSuitEnum.CLUBS);
//			cards[4].setCardSuit(CardSuitEnum.HEARTS);
//			
//			HandRankEnum expected = HandRankEnum.STRAIGHT;
//			HandRankEnum value = h.evaluateHand(inputHand);
//			assertEquals(expected, value);
//		}
//	}
//	
//	@Test
//	public void testEvaluateHandTOK() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardSuit(CardSuitEnum.SPADES);
//		cards[1].setCardSuit(CardSuitEnum.HEARTS);
//		cards[2].setCardSuit(CardSuitEnum.DIAMONDS);
//		cards[3].setCardSuit(CardSuitEnum.CLUBS);
//		cards[4].setCardSuit(CardSuitEnum.HEARTS);
//		
//		for (int i=1; i<11; i++) {
//			cards[0].setCardNumber(12);
//			cards[1].setCardNumber(13);
//			cards[2].setCardNumber(i+1);
//			cards[3].setCardNumber(i+1);
//			cards[4].setCardNumber(i+1);
//			
//			HandRankEnum expected = HandRankEnum.THREE_OF_A_KIND;
//			HandRankEnum value = h.evaluateHand(inputHand);
//			assertEquals(expected, value);
//		}
//		
//	}
//	
//	@Test
//	public void testEvaluateHandTP() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardSuit(CardSuitEnum.SPADES);
//		cards[1].setCardSuit(CardSuitEnum.HEARTS);
//		cards[2].setCardSuit(CardSuitEnum.DIAMONDS);
//		cards[3].setCardSuit(CardSuitEnum.CLUBS);
//		cards[4].setCardSuit(CardSuitEnum.HEARTS);
//		
//		for (int i=1; i<12; i++) {
//			cards[0].setCardNumber(i);
//			cards[1].setCardNumber(13);
//			cards[2].setCardNumber(i);
//			cards[3].setCardNumber(i+1);
//			cards[4].setCardNumber(i+1);
//			
//			HandRankEnum expected = HandRankEnum.TWO_PAIR;
//			HandRankEnum value = h.evaluateHand(inputHand);
//			assertEquals(expected, value);
//		}
//	}
//	
//	@Test
//	public void testEvaluateHandJOB() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		cards[0].setCardSuit(CardSuitEnum.SPADES);
//		cards[1].setCardSuit(CardSuitEnum.HEARTS);
//		cards[2].setCardSuit(CardSuitEnum.DIAMONDS);
//		cards[3].setCardSuit(CardSuitEnum.CLUBS);
//		cards[4].setCardSuit(CardSuitEnum.HEARTS);
//		
//		for (int i=11; i<14; i++) {
//			cards[0].setCardNumber(1);
//			cards[1].setCardNumber(2);
//			cards[2].setCardNumber(5);
//			cards[3].setCardNumber(i);
//			cards[4].setCardNumber(i);
//			
//			HandRankEnum expected = HandRankEnum.JACKS_OR_BETTER;
//			HandRankEnum value = h.evaluateHand(inputHand);
//			assertEquals(expected, value);
//		}
//	}
/***************************************************************************************/
	
	//
	
//	@Test
//	public void testIsRoyalFlush() {
//		GameHand inputHand = GameHand.getGameHandInstance();
//		inputHand.setPlayingHand(cards);
//		
//		CardRank expected = generateRF();
//		CardRank value = h.evaluateHand(inputHand);
//		assertEquals(expected, value);
//	}
//
//	@Test
//	public void testIsStraightFlush() {
//
//	}
//
//	@Test
//	public void testIsFourOfAKind() {
//
//	}
//
//	@Test
//	public void testIsFullHouse() {
//
//	}
//
//	@Test
//	public void testIsFlush() {
//
//	}
//
//	@Test
//	public void testIsStraight() {
//
//	}
//
//	@Test
//	public void testIsThreeOfAKind() {
//
//	}
//
//	@Test
//	public void testIsTwoPair() {
//
//	}
//
//	@Test
//	public void testIsJacksOrBetter() {
//
//	}
}