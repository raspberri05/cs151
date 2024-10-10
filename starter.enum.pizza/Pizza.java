
import java.util.*;

/*
	Use the enum class to revamp the PizzaStore instead of using decorator arrpoach.
    What will be the advantage and disadvantage?

*/

class Item {
	public String name ;
	public double cost ;
	public Item (String n, double c ) {
		name = n ;
		cost = c; 
	}
}
public class Pizza {
	Crust m_crust ;
	ArrayList <Topping> m_toppings = new ArrayList <> ();

	public Pizza (Crust c ) {
		// xxx your codes
	}

	public void addTopping ( Topping t ) {
		// xxx your codes
	}


	public double cost() {
		// xxx your codes
		return 0;
	}
	
	@Override
	public String toString () {
		// xxx your codes
		return "";
	}
}
