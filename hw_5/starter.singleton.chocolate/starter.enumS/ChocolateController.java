
public class ChocolateController {
	public static void foo(ChocolateBoiler  x) {
		x.fill();
		x.boil();
		x.drain();
	}
	public static void main(String args[]) {
		foo ( ChocolateBoiler.UNIQUE_INSTANCE );
	}
}


/*

Expected outputs:

fill the boiler with a milk/chocolate mixture.
bring the contents to a boil.
drain the boiled milk and chocolate.


*/
