public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}

/*
Expected output:


Creating an instance of Chocolate Boiler with syncronization.
Returning instance of Chocolate Boiler
fill the boiler with a milk/chocolate mixture.
bring the contents to a boil.
drain the boiled milk and chocolate.
Returning instance of Chocolate Boiler

*/
