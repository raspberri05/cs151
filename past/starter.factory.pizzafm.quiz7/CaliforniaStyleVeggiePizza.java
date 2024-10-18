// package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaStyleVeggiePizza extends Pizza {
	public CaliforniaStyleVeggiePizza() {
		// xxx your codes
		// xxx name = "..." 
		// xxx dough = "..."
		// xxx sauce = "..."
		name = "California Veggie Pizza";
		dough = "Very Thin Crust Dough";
		sauce = "BBQ Sauce";

		toppings.add("Goat Cheese");
/*
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
*/
        toppings.add("Roasted Garlic"); 
        toppings.add("Mashed Potato");
        toppings.add("Artichoke Hearts");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
