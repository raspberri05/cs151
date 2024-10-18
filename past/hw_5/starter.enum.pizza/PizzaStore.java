
/*
    Use the enum class to revamp the PizzaStore instead of using decorator arrpo
ach.
    What will be the advantage and disadvantage?

*/

/* 
	Answer
	Advantages
		Simplicity - The set of enums for Crust and Topping are defined as constant and make these classes simpler and easier to understand and you don't need explicit getters as you access the values directly.
		Rigidness - with enums, you could have code similar to what is in this file that always assembles pizza toppings in a certain order. This reflects doing the same workflow again and again in the same order, and enums make that easier.
	Disadvantages
		Modification - using enums goes against "closed for modification, open for extension". If you wanted to add more topping options, you would have to modify the files for the enum classes. With decorator, you could just add another class in a new file that "decorates" the pizza with the new topping.

 */

public class PizzaStore {
 
	public static void main(String args[]) {

		for ( Crust c: Crust.values () ) {
			Pizza p = new Pizza( c );
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
