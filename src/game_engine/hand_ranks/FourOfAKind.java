package game_engine.hand_ranks;


public class FourOfAKind implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public FourOfAKind() {
		winRatio = 25;
		rankTitle = "Four of a Kind";
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
