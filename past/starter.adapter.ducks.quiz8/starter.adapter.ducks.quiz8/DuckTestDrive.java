

public class DuckTestDrive {
	public static void main(String[] args) {
		System.out.println("\nThe Duck says...");
		Duck duck = new MallardDuck();
		testDuck(duck);

		System.out.println("\nThe droneAdapter says...");
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);

		testDuck(droneAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
