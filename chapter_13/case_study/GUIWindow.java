// Example 13.5: Main window for drawings of recursive patterns

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class GUIWindow extends JFrame {

	// Create a slider with horizontal orientation, minimum value of 0,
	// maximum value of 10, and initially selected value of 0
	private JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 10, 0);
	private ColorPanel panel = new ColorPanel(Color.white);

	// Track the current value of the slider for state changes
	private int level = 0;

	public GUIWindow() {
		// Add ticks to the slider and show them
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		JPanel sliderPanel = new JPanel();
		sliderPanel.add(slider);
		Container container = getContentPane();
		container.add(panel, BorderLayout.CENTER);
		container.add(sliderPanel, BorderLayout.SOUTH);
		// Attach a listener to the slider
		slider.addChangeListener(new SliderListener());
	}

	private class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int value = slider.getValue(); // Obtain slider's value
			if (value != level) { // Check for change in value
				level = value; // Reset level if changed
				panel.setLevel(level); // Draw a new picture
			}
		}
	}
}
