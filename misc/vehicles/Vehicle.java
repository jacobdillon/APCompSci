public class Vehicle {
	// Instance variables
	private double topSpeed;
	private double weight;

	// Constructor
	public Vehicle() {
		this.topSpeed = 0.0;
		this.weight = 0.0;
	}

	// Accessors
	public double getTopSpeed() {
		return this.topSpeed;
	}

	public double getWeight() {
		return this.weight;
	}

	// Mutators
	public void setTopSpeed(double speed) {
		this.topSpeed = speed;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Tests
	public String testTopSpeed() {
		if(this.topSpeed <= 0) {
			return "[ERROR] Top Speed cannot be under 0!";
		} else {
			return "[SUCCESS] Top Speed is valid";
		}
	}

	public String testWeight() {
		if(this.weight <= 0) {
			return "[ERROR] Weight cannot be under 0!";
		} else {
			return "[SUCCESS] Weight is valid";
		}
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		return str;
	}
}
