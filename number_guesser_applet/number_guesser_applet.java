import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class number_guesser_applet extends JApplet {
	// If you got the correct number, set to true
	private boolean done = false;

	// Number of guesses counter
	private int guessCountNumber = 0;

	// enum for return value of evalGuess
	public enum CheckVal {
		err, high, low, correct
	}

	public void init() {
		// Generate random number
		int randomNum = ThreadLocalRandom.current().nextInt(0, 101);

		// Manually layout items
		// Use setBounds(x, y, w, h) to layout widgets
		setLayout(null);

		// Title
		JLabel title = new JLabel("Guess the number!");
		title.setBounds(10, 10, 150, 20);
		getContentPane().add(title);

		// Label for number of guesses
		JLabel guessCountLabel = new JLabel("Number of guesses: ");
		guessCountLabel.setBounds(10, 35, 125, 20);
		getContentPane().add(guessCountLabel);

		// Number of guesses text field
		final JTextField guessCount = new JTextField("0");
		guessCount.setBounds(130, 35, 55, 20);
		guessCount.setEditable(false);
		getContentPane().add(guessCount);

		// Label for guess
		JLabel guessLabel = new JLabel("Guess: ");
		guessLabel.setBounds(10, 60, 50, 20);
		getContentPane().add(guessLabel);

		// Guess text field
		final JTextField guess = new JTextField("Enter guess");
		guess.setBounds(55, 60, 130, 20);
		// Make sure input is valid
		guess.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				try {
					Integer.parseInt(String.valueOf(e.getKeyChar()));
				} catch (NumberFormatException ex) {
					e.consume();
				}
			}
		});
		getContentPane().add(guess);

		// Result
		final JTextField result = new JTextField("Press OK to start.");
		result.setBounds(10, 110, 175, 20);
		result.setEditable(false);
		getContentPane().add(result);

		// OK button
		final JButton ok = new JButton("OK");
		ok.setBounds(10, 85, 175, 20);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if(!done) {
					CheckVal returnVal = evalGuess(randomNum, Integer.parseInt(guess.getText()));
					if(returnVal == CheckVal.err) {
						result.setText("Input an int between 0 and 100");
					} else if(returnVal == CheckVal.high) {
						result.setText("Too high");
						guessCountNumber++;
						guessCount.setText(String.valueOf(guessCountNumber));
					} else if(returnVal == CheckVal.low) {
						result.setText("Too low");
						guessCountNumber++;
						guessCount.setText(String.valueOf(guessCountNumber));
					} else if(returnVal == CheckVal.correct) {
						result.setText("You got the number!");
						done = true;
						guessCountNumber++;
						guessCount.setText(String.valueOf(guessCountNumber));
					}
				}
			}
		});
		getContentPane().add(ok);
	}

	// Evaluate the guess
	public CheckVal evalGuess(int randomNum, int guess) {
		// Out of range
		if(guess > 100 || guess < 0) return CheckVal.err;
		// Too high
		else if(guess > randomNum) return CheckVal.high;
		// Too low
		else if(guess < randomNum) return CheckVal.low;
		// Just right
		else if(guess == randomNum) return CheckVal.correct;
		// If those all fail...
		return CheckVal.err;
	}
}
