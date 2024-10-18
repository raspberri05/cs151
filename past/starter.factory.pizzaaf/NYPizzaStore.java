// package headfirst.designpatterns.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore {
 
    NYPizzaStore () {
		super ( new NYPizzaIngredientFactory() );
    }

}
