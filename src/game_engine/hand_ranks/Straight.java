package game_engine.hand_ranks;


public class Straight implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public Straight() {
		winRatio = 4;
		rankTitle = "Straight";
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
