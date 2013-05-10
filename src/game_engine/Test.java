package game_engine;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheDealer d = TheDealer.getTheDealerInstance();
		GameHand h = GameHand.getGameHandInstance();
		h.getPlayingHand(d.drawHand());
		h.print();
		
		h.getPlayingCard(0).setHold(true);
		h.getPlayingCard(1).setHold(true);
		h.getPlayingCard(2).setHold(false);
		h.getPlayingCard(3).setHold(true);
		h.getPlayingCard(4).setHold(true);
		
		h.getPlayingHand(d.drawHand(h));
		System.out.println();
		h.print();

	}

}
