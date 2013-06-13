package game_engine.hand_ranks;


public class TwoPair implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public TwoPair() {
		winRatio = 2;
		rankTitle = "Two Pair";
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
