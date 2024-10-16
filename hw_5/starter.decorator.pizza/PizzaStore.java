
import java.util.* ;
public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza p1 		= new ThincrustPizza();
		Pizza p2 		= new ThickcrustPizza();

		List<Pizza> crusts = Arrays.asList(p1, p2);
		for (Pizza orig:crusts ) {
			Pizza cheesePizza 	= new Cheese(orig);
			Pizza greekPizza 	= new Olives(cheesePizza);
			Pizza myPizza 		= new Pepperoni(greekPizza);
			Pizza yourPizza		= new Clam(myPizza);
			List<Pizza> arr = Arrays.asList(orig,cheesePizza, greekPizza,
				myPizza, yourPizza );
			for (Pizza p:arr ) {
				System.out.printf("%s $%.2f\n", p , p.cost());
			}
		}

	}
}


/*

Expected Outputs:

Thin crust pizza, with tomato sauce $6.99
Thin crust pizza, with tomato sauce, Cheese $6.99
Thin crust pizza, with tomato sauce, Cheese, Olives $7.29
Thin crust pizza, with tomato sauce, Cheese, Olives, Pepperoni $7.44
Thin crust pizza, with tomato sauce, Cheese, Olives, Pepperoni, Clam $8.34
Thick crust pizza, with tomato sauce $7.99
Thick crust pizza, with tomato sauce, Cheese $7.99
Thick crust pizza, with tomato sauce, Cheese, Olives $8.29
Thick crust pizza, with tomato sauce, Cheese, Olives, Pepperoni $8.44
Thick crust pizza, with tomato sauce, Cheese, Olives, Pepperoni, Clam $9.34

*/
