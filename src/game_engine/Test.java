package game_engine;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheDealer d = TheDealer.getTheDealerInstance();
		GameHand h = GameHand.getGameHandInstance();
		h.setPlayingHand(d.drawHand());
//		h.print();
		
//		h.getPlayingCard(0).setHold(true);
//		h.getPlayingCard(1).setHold(true);
//		h.getPlayingCard(2).setHold(false);
//		h.getPlayingCard(3).setHold(true);
//		h.getPlayingCard(4).setHold(true);
//		
//		h.setPlayingHand(d.drawHand(h));
//		System.out.println();
//		h.print();

		HandEvaluator e = new HandEvaluator();
//		e.sortHand(h);
//		System.out.println();
//		e.print();
//		System.out.println();
//		h.print();
//		System.out.println();
		
//		long c = 1;
//		
//		while(!(e.isJacksOrBetter(h))) {
//			h.setPlayingHand(d.drawHand());
//			c++;
//		}
		h.print();
		System.out.println();
//		System.out.println(c);
		
		System.out.println(e.evaluateHand(h));
	}

}
