// package headfirst.designpatterns.factory.pizzafm;

import java.util.* ;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();

		// List<PizzaStore> stores = Arrays.asList ( nyStore, chicagoStore );
		List<PizzaStore> stores = Arrays.asList ( californiaStore );
		List<String> list = Arrays.asList("cheese","clam","pepperoni","veggie"); 
		List<String> names = Arrays.asList ( "Ethan", "Joel" );
//, "Jose", "Maggie" 
 
		int i = 0 ;
		int n = names.size();
		for ( PizzaStore  store: stores ) {
			for ( String s: list ) {
				System.out.println( i + ": ");
				String name = names.get ( (i++)%n );
				Pizza pizza = store.orderPizza( s );
				System.out.println( name + " ordered a " + pizza + "\n");
			}
		}
	}
}
