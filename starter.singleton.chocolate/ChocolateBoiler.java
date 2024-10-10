public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			String name = "fill the boiler with a milk/chocolate mixture.";
			System.out.println ( name );
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			String name = "drain the boiled milk and chocolate.";
			System.out.println ( name );
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			String name = "bring the contents to a boil.";
			System.out.println ( name );
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
