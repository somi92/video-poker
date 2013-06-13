package game_engine.hand_ranks;


public class Flush implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public Flush() {
		winRatio = 6;
		rankTitle = "Flush";
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
