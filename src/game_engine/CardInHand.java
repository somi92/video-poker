package game_engine;

class CardInHand extends Card {

	private boolean hold;
	
	public CardInHand() {
		hold = false;
	}

	public boolean isHold() {
		return hold;
	}

	public void setHold(boolean hold) {
		this.hold = hold;
	}
}
