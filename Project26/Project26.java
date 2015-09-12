import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;

public class Project26 {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Project 2.6 - French, Mauritius, and Bulgarian Flags"); // Create a new JFrame with appropriate description
		frame.setLayout(new FlowLayout(0, 3, 3));
		frame.setSize(250, 500);
		frame.setAlignOnBaseline(true);

		ImageIcon frenchFlag = new ImageIcon("fr.gif"); // Display the French flag
		JLabel frenchFlagLabel = new JLabel(frenchFlag);

		ImageIcon mauritiusFlag = new ImageIcon("mu.gif"); // Display the Mauritius flag
		JLabel mauritiusFlagLabel = new JLabel(mauritiusFlag);

		ImageIcon bulgarianFlag = new ImageIcon("bg.gif"); // Display the Bulgarian flag
		JLabel bulgarianFlagLabel = new JLabel(bulgarianFlag);

		frame.add(frenchFlagLabel);
		frame.add(mauritiusFlagLabel);
		frame.add(bulgarianFlagLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	} // End of main
} // End of class
