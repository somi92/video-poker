package game_engine.hand_ranks;


public class StraightFlush implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public StraightFlush() {
		winRatio = 50;
		rankTitle = "Straight Flush";
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
