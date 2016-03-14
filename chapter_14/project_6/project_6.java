import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project_6 extends JFrame {
	public static void main(String[] args) {
		// Create a new deck and shuffle it
		Deck deck = new Deck();
		deck.shuffle();

		// Add players
		Player p1 = new Player(deck);
		Player p2 = new Player(deck);

		// Create the JFrame
		JFrame frame = new JFrame("Window");

		// Make the frame visable
		frame.setVisible(true);

		// Set the size of the window
		frame.setSize(300, 145);

		// Manually layout items
		// Use setBounds(x, y, w, h) to layout widgets
		frame.setLayout(null);

		// Label for status
		JTextField status = new JTextField("Click 'play' to play the next two cards");
		status.setBounds(10, 10, 280, 20);
		status.setEditable(false);
		frame.add(status);

		// Player 1 title
		JLabel p1Title = new JLabel("Player 1:");
		p1Title.setBounds(10, 30, 50, 20);
		frame.add(p1Title);

		// Player 2 title
		JLabel p2Title = new JLabel("Player 2:");
		p2Title.setBounds(150, 30, 50, 20);
		frame.add(p2Title);

		// Player 1 card
		final JTextField p1Card = new JTextField("null");
		p1Card.setBounds(10, 50, 140, 20);
		p1Card.setEditable(false);
		frame.add(p1Card);

		// Player 2 card
		final JTextField p2Card = new JTextField("null");
		p2Card.setBounds(150, 50, 140, 20);
		p2Card.setEditable(false);
		frame.add(p2Card);

		// Winner title
		JLabel winnerTitle = new JLabel("Winner:");
		winnerTitle.setBounds(10, 70, 50, 20);
		frame.add(winnerTitle);

		// Winner TextField
		final JTextField winner = new JTextField("null");
		winner.setBounds(10, 90, 280, 20);
		winner.setEditable(false);
		frame.add(winner);

		final JButton play = new JButton("Play");
		play.setBounds(10, 115, 140, 20);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if(!p1.isEmpty() && !p2.isEmpty()) {
					if(p1.getCard().getRank() == p2.getCard().getRank()) {
						winner.setText("Tie");
						p1Card.setText(p1.getCard().toString());
						p2Card.setText(p2.getCard().toString());
						p1.lostCard();
						p2.lostCard();
					} else if(p1.getCard().getRank() > p2.getCard().getRank()) {
						winner.setText("Player 1 won");
						p1Card.setText(p1.getCard().toString());
						p2Card.setText(p2.getCard().toString());
						p1.wonCard(p2.getCard());
						p1.wonCard(p1.getCard());
						p1.lostCard();
						p2.lostCard();
					} else {
						winner.setText("Player 2 won");
						p1Card.setText(p1.getCard().toString());
						p2Card.setText(p2.getCard().toString());
						p2.wonCard(p1.getCard());
						p2.wonCard(p2.getCard());
						p2.lostCard();
						p1.lostCard();
					}
				} else {
					if(p1.winningsCount() == p2.winningsCount()) {
						winner.setText("The game ended in a tie");
					} else if(p1.winningsCount() > p2.winningsCount()) {
						winner.setText("The game ended with Player 1's victory");
					} else {
						winner.setText("The game ended with Player 2's victory");
					}
					status.setText("Press 'Restart' to restart the game");
				}
			}
		});
		frame.add(play);

		final JButton restart = new JButton("Restart");
		restart.setBounds(150, 115, 140, 20);
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				status.setText("Click 'play' to play the next two cards");
				deck.reset();
				deck.shuffle();
				p1.reset(deck);
				p2.reset(deck);
			}
		});
		frame.add(restart);
	}
}
