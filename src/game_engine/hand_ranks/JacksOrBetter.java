package game_engine.hand_ranks;


public class JacksOrBetter implements HandRank {

	private long winRatio;
	private String rankTitle;
	
	public JacksOrBetter() {
		winRatio = 1;
		rankTitle = "Jacks Or Better";
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
