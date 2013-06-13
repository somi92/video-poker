package game_engine;

import game_engine.hand_ranks.HandRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheDealer d = TheDealer.getTheDealerInstance();
		GameHand h = GameHand.getGameHandInstance();

		boolean done = false;
		while (!done) {
			h.setPlayingHand(d.drawHand());
			System.out.println("Credits: "+TheDealer.getCredits()+"   Current bet: "+TheDealer.getCurrentBet());
			System.out.println();
			h.print();
			System.out.println();
			System.out.println("Select cards to hold (0-4) or 5 to skip: ");
			BufferedReader inQ = new BufferedReader(new InputStreamReader(System.in));
			String sa;
			
			try {
				sa = inQ.readLine();
				if (!sa.equals("5")) {
					String[] ar = sa.split(",");
					for (int i=0; i<ar.length; i++) {
						int p = Integer.parseInt(ar[i]);
						h.getPlayingCard(p).setHold(true);
					}
				}
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			h.setPlayingHand(d.drawHand(h));
			System.out.println();
			h.print();
			System.out.println();
			HandRank rank = TheDealer.evaluateGameHand(h);
			System.out.println();
			System.out.println(rank.getRankTitle() + " - you won: "+TheDealer.getCurrentWin()+" credits!");
			System.out.println();
			System.out.println("Credits: "+TheDealer.getCredits()+"   Current bet: "+TheDealer.getCurrentBet());
			
			System.out.println();
			System.out.println("Deal again? y/n :");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String a = "n";
			try {
				a = in.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (a.equalsIgnoreCase("y")) {
				done = false;
			} else {
				done = true;
			}
		}
	}

}
