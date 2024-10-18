
import java.lang.reflect.*;

/* Another way to create a Singleton is by creating a class in which all methods and variables are defined as static.  */

public class ChocolateController {

	public static void main(String args[]) throws NoSuchMethodException, ClassNotFoundException {

		ChocolateBoiler.fill();
		ChocolateBoiler.boil();
		ChocolateBoiler.drain();

	}
}

/*
Expected output:

fill the boiler with a milk/chocolate mixture.
bring the contents to a boil.
drain the boiled milk and chocolate.

*/
