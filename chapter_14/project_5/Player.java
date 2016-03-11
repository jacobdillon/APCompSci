import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> unplayed = new ArrayList<>();
	private List<Card> winnings = new ArrayList<>();

	public Player(Deck deck) {
		for(int i = 0; i < 26; i++) {
			unplayed.add(deck.deal());
		}
	}

	public Card getCard() {
		if(!unplayed.isEmpty())
			return unplayed.get(unplayed.size() - 1);
		else
			return null;
	}

	public void lostCard() {
		unplayed.remove(unplayed.size() - 1);
	}

	public void wonCard(Card card) {
		winnings.add(card);
	}

	public boolean isEmpty() {
		return unplayed.isEmpty();
	}

	public int winningsCount() {
		return winnings.size();
	}

	public String toString() {
		String str = "";
		str += "Unplayed:\n";
		for(Card card : unplayed)
			str += "\t" + card + "\n";
		str += "Winnings:\n";
		for(Card card : winnings)
			str += "\t" + card + "\n";
		return str;
	}
}
