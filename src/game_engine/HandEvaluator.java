package game_engine;

class HandEvaluator {

//	private CardInHand[] tHand;
	private CardRank rank;
	
	public HandEvaluator() {
		
	}
	
	private CardInHand[] copyValues(GameHand pHand) {
		CardInHand[] hand = new CardInHand[5];
		for (int i=0; i<hand.length; i++) {
			hand[i] = new CardInHand();
			hand[i].setCardNumber(pHand.getPlayingCard(i).getCardNumber());
			hand[i].setCardSuit(pHand.getPlayingCard(i).getCardSuit());
			hand[i].setCardImage(pHand.getPlayingCard(i).getCardImage());
		}
		return hand;
	}
	
	public CardInHand[] sortHand(GameHand pHand) {
		CardInHand[] hand = copyValues(pHand);
		int in, out;
		CardInHand temp;
		for (out=1; out<5; out++) {
			temp = hand[out];
			in = out;
			while (in>0 && hand[in-1].getCardNumber()>temp.getCardNumber()) {
				hand[in] = hand[in-1];
				--in;
			}
			hand[in] = temp;
		}
//		targetHand.setPlayingHand(hand);
		return hand;
	}
	
	public boolean isPair(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		for (int i=0; i<4; i++) {
			if ((hand[i].getCardNumber() == hand[i+1].getCardNumber())) {
				return true;
			}
		}
		return false;
	}
	
	/************************** POKER HANDS **************************/
	
	public boolean isRoyalFlush(GameHand pHand) {
		CardInHand[] hand = pHand.getPlayingHand();
		if (isStraight(pHand) && isFlush(pHand) && hand[4].getCardNumber()==13) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isStraightFlush(GameHand pHand) {
//		CardInHand[] hand = pHand.getPlayingHand();
		if (isStraight(pHand) && isFlush(pHand)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFourOfAKind(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		for (int i=0; i<2; i++) {
			if ((hand[i].getCardNumber() == hand[i+1].getCardNumber()) && (hand[i].getCardNumber() == hand[i+2].getCardNumber()) && (hand[i].getCardNumber() == hand[i+3].getCardNumber())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFullHouse(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		if (isThreeOfAKind(pHand) && isPair(pHand) && hand[0].getCardNumber()==hand[1].getCardNumber() && hand[3].getCardNumber()==hand[4].getCardNumber()) {
			return true;
		}
		return false;
	}
	
	
	public boolean isFlush(GameHand pHand) {
		CardInHand[] hand = pHand.getPlayingHand();
		for (int i=0; i<4; i++) {
			if (!(hand[i].getCardSuit()==hand[i+1].getCardSuit())) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isStraight(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		for (int i=0; i<4; i++) {
			if (!((hand[i].getCardNumber()+1)==hand[i+1].getCardNumber())) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isThreeOfAKind(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		for (int i=0; i<3; i++) {
			if ((hand[i].getCardNumber() == hand[i+1].getCardNumber()) && (hand[i].getCardNumber() == hand[i+2].getCardNumber())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isTwoPair(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		if (!isFourOfAKind(pHand) && !isThreeOfAKind(pHand) && !isFullHouse(pHand) && 
				((hand[0].getCardNumber()==hand[1].getCardNumber() && hand[2].getCardNumber()==hand[3].getCardNumber()) 
				|| (hand[0].getCardNumber()==hand[1].getCardNumber() && hand[3].getCardNumber()==hand[4].getCardNumber())
				|| (hand[2].getCardNumber()==hand[3].getCardNumber() && hand[3].getCardNumber()==hand[4].getCardNumber()))) {
			return true;
		}
		return false;
	}
	
	public boolean isJacksOrBetter(GameHand pHand) {
		CardInHand[] hand = sortHand(pHand);
		for (int i=0; i<4; i++) {
			if (!isFourOfAKind(pHand) && !isThreeOfAKind(pHand) && !isFullHouse(pHand) && !isTwoPair(pHand) &&
					hand[i].getCardNumber() == hand[i+1].getCardNumber() && hand[i].getCardNumber()>=11) {
				return true;
			}
		}
		return false;
	}
}
