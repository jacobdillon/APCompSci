public class Air extends Vehicle {
	// Instance variables
	private int maxHeight;

	// Accessor
	public int getMaxHeight() {
		return this.maxHeight;
	}

	// Mutator
	public void setMaxHeight(int height) {
		this.maxHeight = height;
	}

	// Tests
	public String testMaxHeight() {
		if(this.maxHeight <= 0) {
			return "[ERROR] Max Height cannot be under 0!";
		} else {
			return "[SUCCESS] Max Height is valid";
		}
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		str = str + "\tMaxHeight: " + this.getMaxHeight() + "\t" + this.testMaxHeight() + "\n";
		return str;
	}
}
