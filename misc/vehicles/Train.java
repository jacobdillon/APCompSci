public class Train extends Vehicle {
	// Instance variables
	private int cars;

	// Accessor
	public int getCars() {
		return this.cars;
	}

	// Mutator
	public void setCars(int cars) {
		this.cars = cars;
	}

	// Tests
	public String testCars() {
		if(this.cars <= 0) {
			return "[ERROR] Cars cannot be under 0!";
		} else {
			return "[SUCCESS] Cars is valid";
		}
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		str = str + "\tCars: " + this.getCars() + "\t" + this.testCars() + "\n";
		return str;
	}
}
