package game_engine.hand_ranks;

import game_engine.HandRankEnum;

public class HandRankFactory {

	public static HandRank getHandRank(HandRankEnum rank) {
		if (rank == null) {
			throw new RuntimeException("Error! HandRankEnum cannot be null.");
		}
		if (rank == HandRankEnum.NO_RANK) {
			return new NoRank();
		}
		if (rank == HandRankEnum.JACKS_OR_BETTER) {
			return new JacksOrBetter();
		}
		if (rank == HandRankEnum.TWO_PAIR) {
			return new TwoPair();
		}
		if (rank == HandRankEnum.THREE_OF_A_KIND) {
			return new ThreeOfAKind();
		}
		if (rank == HandRankEnum.STRAIGHT) {
			return new Straight();
		}
		if (rank == HandRankEnum.FLUSH) {
			return new Flush();
		}
		if (rank == HandRankEnum.FULL_HOUSE) {
			return new FullHouse();
		}
		if (rank == HandRankEnum.FOUR_OF_A_KIND) {
			return new FourOfAKind();
		}
		if (rank == HandRankEnum.STRAIGHT_FLUSH) {
			return new StraightFlush();
		}
		if (rank == HandRankEnum.ROYAL_FLUSH) {
			return new RoyalFlush();
		}
		return null;
		
	}
}
