package game_engine.hand_ranks;


public class RoyalFlush implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public RoyalFlush() {
		winRatio = 250;
		rankTitle = "Royal Flush";
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
