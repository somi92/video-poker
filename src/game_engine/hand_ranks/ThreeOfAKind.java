package game_engine.hand_ranks;


public class ThreeOfAKind implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public ThreeOfAKind() {
		winRatio = 3;
		rankTitle = "Three of a Kind";
	}

	@Override
	public long getWinRatio() {
		// TODO Auto-generated method stub
		return winRatio;
	}

	@Override
	public String getRankTitle() {
		// TODO Auto-generated method stub
		return rankTitle;
	}
	
	
}
