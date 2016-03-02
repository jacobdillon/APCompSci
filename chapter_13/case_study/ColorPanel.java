import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorPanel extends JPanel {
	private int level;
	private Random gen;

	public ColorPanel(Color backColor) {
		setBackground(backColor);
		setPreferredSize(new Dimension(300, 200));
		level = 0;
		gen = new Random();
	}

	public void setLevel(int newLevel) {
		level = newLevel;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		mondrian(g, 0, 0, getWidth(), getHeight(), level);
	}

	private void mondrian(Graphics g, int x1, int y1, int x2, int y2, int level) {
		if(level > 0) {
			g.drawRect(x1, y1, x2 - x1, y2 - y1);
			g.setColor(new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256)));
			g.fillRect(x1, y1, x2 - x1, y2 - y1);
			int vertical = gen.nextInt(2); // Decide whether to split vertically
			if(vertical == 0) { // or horizontally.
				mondrian(g, x1, y1, (x2 - x1) / 3 + x1, y2, level - 1);
				mondrian(g, (x2 - x1) / 3 + x1, y1, x2, y2, level - 1);
			} else {
				mondrian(g, x1, y1, x2, (y2 - y1) / 3 + y1, level - 1);
				mondrian(g, x1, (y2 - y1) / 3 + y1, x2, y2, level - 1);
			}
		}
	}
}
