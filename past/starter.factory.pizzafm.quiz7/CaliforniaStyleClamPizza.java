// package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaStyleClamPizza extends Pizza {

	public CaliforniaStyleClamPizza() {
		// xxx your codes
		// xxx name = 
		// xxx dough = 
		// xxx sauce = 
		name = "California Clam Pizza";
		dough = "Very Thin Crust Dough";
		sauce = "BBQ Sauce";
		toppings.add("Goat Cheese");
		toppings.add("Calamari");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
