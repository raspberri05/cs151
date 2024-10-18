// package headfirst.designpatterns.factory.pizzaaf;

public class PizzaFactory {
    public static Pizza createPizza( String style, PizzaIngredientFactory ingredientFactory ) {
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
 
}
