package game_engine.hand_ranks;


public class FullHouse implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public FullHouse() {
		winRatio = 9;
		rankTitle = "Full House";
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
