// package headfirst.designpatterns.factory.pizzaaf;

public abstract class PizzaStore {
    PizzaIngredientFactory ingredientFactory ;

	PizzaStore (PizzaIngredientFactory f ) {
		ingredientFactory = f ;
	}
	
    protected Pizza createPizza( String style ) {
		// return PizzaFactory.createPizza(style, ingredientFactory);

        Pizza pizza = null;

        style = style.toLowerCase();
        if (style.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (style.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        } else if (style.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (style.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        style = style.substring(0, 1).toUpperCase() + style.substring(1);
        String storeName = ingredientFactory.getName ();
        pizza.setName(storeName + " " + style + " Pizza");
        return pizza;

    }
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
