
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
		m_crust = c;
	}

	public void addTopping ( Topping t ) {
		// xxx your codes
		m_toppings.add(t);
	}


	public double cost() {
		// xxx your codes
		double total = m_crust.cost;
		for (Topping t : m_toppings) {
			total += t.cost;
		}
		return total;
	}
	
	@Override
	public String toString () {
		String display = "";
		// xxx your codes
		for (Topping t : m_toppings) {
			display +=  ", " + t.name;
		}
		return m_crust.name + display;
	}
}
