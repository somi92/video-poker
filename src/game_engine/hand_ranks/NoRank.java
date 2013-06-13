package game_engine.hand_ranks;


public class NoRank implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public NoRank() {
		winRatio = 0;
		rankTitle = "No Rank";
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
