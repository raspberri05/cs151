

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	// xxx your code
	// xxx add declaration for uniqueInstance
	// xxx ...
	private volatile static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			synchronized (ChocolateBoiler.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
					System.out.println("Creating an instance of Chocolate Boiler with double checked locking.");

				}
			}
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			String s = "fill the boiler with a milk/chocolate mixture." ;
            System.out.println ( s );

		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			String s = "drain the boiled milk and chocolate." ;
            System.out.println ( s );
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			String s = "bring the contents to a boil." ;
            System.out.println ( s );
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
