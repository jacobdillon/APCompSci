public class Boat extends Vehicle {
	// Instance variables
	private double length;

	// Accessor
	public double getLength() {
		return this.length;
	}

	// Mutator
	public void setLength(double length) {
		this.length = length;
	}

	// Tests
	public String testLength() {
		if(this.length <= 0) {
			return "[ERROR] Length cannot be under 0!";
		} else {
			return "[SUCCESS] Length is valid";
		}
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		str = str + "\tLength: " + this.getLength() + "\t" + this.testLength() + "\n";
		return str;
	}
}
