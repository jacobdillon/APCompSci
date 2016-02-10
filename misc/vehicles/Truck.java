public class Truck extends Car {
	// Instance variables
	private String load;

	// Accessor
	public String getLoad() {
		return this.load;
	}

	// Mutator
	public void setLoad(String load) {
		this.load = load;
	}

	// String Printout
	public String toString() {
		String str;
		str = "\tTopSpeed: " + this.getTopSpeed() + "mph\t" + this.testTopSpeed() + "\n";
		str = str + "\tWeight: " + this.getWeight() + "lbs\t" + this.testWeight() + "\n";
		str = str + "\tPassengers: " + this.getPassengers() + "\t" + this.testPassengers() + "\n";
		str = str + "\tWheels: " + this.getWheels() + "\t" + this.testWheels() + "\n";
		str = str + "\tLoad: " + this.getLoad() + "\n";
		return str;
	}
}
