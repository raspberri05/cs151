// package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza() { 
		// xxx your codes
		// xxx name = 
		// xxx dough = 
		// xxx sauce = 
		name = "California Cheese Pizza";
		dough = "Very Thin Crust Dough";
		sauce = "BBQ Sauce";
		toppings.add("Goat Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
