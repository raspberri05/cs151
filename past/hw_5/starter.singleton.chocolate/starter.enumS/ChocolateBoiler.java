
/* Another way to create a Singleton is by creating a enum class */

public enum ChocolateBoiler {
	// xxx your code
	UNIQUE_INSTANCE;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
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
