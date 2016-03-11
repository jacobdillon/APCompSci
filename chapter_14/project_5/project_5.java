public class project_5 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player(deck);
		Player p2 = new Player(deck);

		while(!p1.isEmpty() && !p2.isEmpty()) {
			if(p1.getCard().getRank() == p2.getCard().getRank()) {
				System.out.println(p1.getCard().toString() + " v. " + p2.getCard().toString()+ " - Tie!");
				p1.lostCard();
				p2.lostCard();
			} else if(p1.getCard().getRank() > p2.getCard().getRank()) {
				System.out.println(p1.getCard().toString() + " v. " + p2.getCard().toString()+ " - Player 1 won!");
				p1.wonCard(p2.getCard());
				p1.wonCard(p1.getCard());
				p1.lostCard();
				p2.lostCard();
			} else {
				System.out.println(p1.getCard().toString() + " v. " + p2.getCard().toString()+ " - Player 2 won!");
				p2.wonCard(p1.getCard());
				p2.wonCard(p2.getCard());
				p2.lostCard();
				p1.lostCard();
			}
		}

		System.out.println();
		System.out.print("Winner: ");
		if(p1.winningsCount() == p2.winningsCount()) {
			System.out.println("Tie!  Winnings piles: " + p1.winningsCount());
		} else if(p1.winningsCount() > p2.winningsCount()) {
			System.out.println("Player 1! Winning pile: " + p1.winningsCount());
		} else {
			System.out.println("Player 2! Winning pile: " + p2.winningsCount());
		}
	}
}
