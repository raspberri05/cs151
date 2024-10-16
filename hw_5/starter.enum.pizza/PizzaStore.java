
/*
    Use the enum class to revamp the PizzaStore instead of using decorator arrpo
ach.
    What will be the advantage and disadvantage?

*/

public class PizzaStore {
 
	public static void main(String args[]) {

		for ( Crust c: Crust.values () ) {
			Pizza p = new Pizza( c );
			System.out.printf( "%s $%.2f\n", p, p.cost() );;
			for ( Topping t: Topping.values () ) {
				p.addTopping ( t );
				System.out.printf( "%s $%.2f\n", p, p.cost() );;
			}
		}
	}
}


/*

Expected Output:

Thin crust pizza, with tomato sauce, cheese $7.99
Thin crust pizza, with tomato sauce, cheese, clam $10.99
Thin crust pizza, with tomato sauce, cheese, clam, pepperoni $12.49
Thin crust pizza, with tomato sauce, cheese, clam, pepperoni, olives $14.49
Thick crust pizza, with tomato sauce, cheese $8.99
Thick crust pizza, with tomato sauce, cheese, clam $11.99
Thick crust pizza, with tomato sauce, cheese, clam, pepperoni $13.49
Thick crust pizza, with tomato sauce, cheese, clam, pepperoni, olives $15.49


*/
