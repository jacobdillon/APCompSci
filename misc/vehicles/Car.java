public class Car extends Vehicle {
	// Instance variables
	private int passengers;
	private int wheels;

	// Accessors
	public int getPassengers() {
		return this.passengers;
	}

	public int getWheels() {
		return this.wheels;
	}

	// Mutators
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// Tests
	public String testPassengers() {
		if(this.passengers <= 0) {
			return "[ERROR] Passengers cannot be under 0!";
		} else {
			return "[SUCCESS] Passengers is valid";
		}
	}

	public String testWheels() {
		if(this.wheels <= 2) {
			return "[ERROR] Wheels cannot be under 2!";
		} else {
			return "[SUCCESS] Wheels is valid";
		}
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		str = str + "\tPassengers: " + this.getPassengers() + "\t" + this.testPassengers() + "\n";
		str = str + "\tWheels: " + this.getWheels() + "\t" + this.testWheels() + "\n";
		return str;
	}
}
