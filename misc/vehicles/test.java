public class test {
	public static void main(String[] args) {
		// Car
		Car car = new Car();
		car.setTopSpeed(257);
		car.setWeight(4000);
		car.setPassengers(5);
		car.setWheels(4);
		System.out.println("Car:\n" + car.toString());

		// Bus
		Car bus = new Car();
		bus.setTopSpeed(80);
		bus.setWeight(38000);
		bus.setPassengers(40);
		bus.setWheels(4);
		System.out.println("Bus:\n" + bus.toString());

		// Truck
		Truck truck = new Truck();
		truck.setTopSpeed(120);
		truck.setWeight(6000);
		truck.setPassengers(4);
		truck.setWheels(4);
		truck.setLoad("Dirt");
		System.out.println("Truck:\n" + truck.toString());

		// Train
		Train train = new Train();
		train.setTopSpeed(374);
		train.setWeight(18000000);
		train.setCars(5);
		System.out.println("Train:\n" + train.toString());

		// Boat
		Boat boat = new Boat();
		boat.setTopSpeed(160);
		boat.setWeight(3000);
		boat.setLength(10.0);
		System.out.println("Boat:\n" + boat.toString());

		// Plane
		Air plane = new Air();
		plane.setTopSpeed(575);
		plane.setWeight(524000);
		plane.setMaxHeight(45000);
		System.out.println("Plane:\n" + plane.toString());

		// Jet
		Air jet = new Air();
		jet.setTopSpeed(2193);
		jet.setWeight(65477);
		jet.setMaxHeight(85135);
		System.out.println("Jet:\n" + jet.toString());

		// Tank
		Vehicle tank = new Vehicle();
		tank.setTopSpeed(60);
		tank.setWeight(134000);
		System.out.println("Tank:\n" + jet.toString());
	}
}
