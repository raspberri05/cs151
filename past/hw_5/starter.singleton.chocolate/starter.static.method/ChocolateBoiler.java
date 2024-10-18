
/* Another way to create a Singleton is by creating a class in which all methods and variables are defined as static.  */

public class ChocolateBoiler {
	// xxx fill in your codes
	private static boolean empty = true;
	private static boolean boiled = false ;
  
	// xxx you cannot instantiate any ChocolateBoiler instance.
	// xxx you cannot implement getInstance() method.
	// xxx ...
	private ChocolateBoiler() {
	}

	public static void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			String name = "fill the boiler with a milk/chocolate mixture.";
			System.out.println ( name );
		}
	}

	public static void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			String name = "drain the boiled milk and chocolate.";
			System.out.println ( name );
		}
	}

	public static void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
			String name = "bring the contents to a boil.";
			System.out.println ( name );
		}
	}

	public static boolean isEmpty() {
		return empty;
	}

	public static boolean isBoiled() {
		return boiled;
	}
}
