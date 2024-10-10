

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	// xxx your code
	// add declaration for uniqueInstance

	private volatile static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	// xxx your code
	// xxx implement thread safe method getInstance() by using the syncronization.
	// public static ... ChocolateBoiler getInstance() {
	// }

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
